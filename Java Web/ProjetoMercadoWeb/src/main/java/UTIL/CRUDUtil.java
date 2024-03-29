package UTIL;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class CRUDUtil {

    public static TableModel resultSetToTableModel(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int NumerodeColunas = metaData.getColumnCount();
            Vector NomeDasColunas = new Vector();

            // pegando o nome das colunas
            for (int Coluna = 0; Coluna < NumerodeColunas; Coluna++) {
                NomeDasColunas.addElement(metaData.getColumnLabel(Coluna + 1));
            }

            // Pegando todas as linhas
            Vector Linhas = new Vector();

            while (rs.next()) {
                Vector NovaLinha = new Vector();

                for (int i = 1; i <= NumerodeColunas; i++) {
                    NovaLinha.addElement(rs.getObject(i));
                }

                Linhas.addElement(NovaLinha);
            }

            return new DefaultTableModel(Linhas, NomeDasColunas);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro tableMode" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
