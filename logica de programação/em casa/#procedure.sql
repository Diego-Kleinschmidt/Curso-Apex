create table usuario(
codigo int identity(1,1),
nome varchar(30),
idade int 
primary key(codigo)
)

create procedure cadastrar_Novo 
@nome varchar(30),
@idade int
as insert into usuario (nome, idade) values (@nome,@idade) 

exec cadastrar_Novo @nome = 'Maria', @idade = 40

create procedure alterarDados
@nome varchar(30),
@idade int,
@codigo int
as update usuario set nome = @nome, idade = @idade where codigo = @codigo

exec alterarDados @nome = 'Mario', @idade = 70 , @codigo = 3

create procedure remover 
@nome varchar(30)
as delete from usuario where nome = @nome

exec remover @nome = mario

create procedure maior_idade
as select * from usuario where idade = (select max(idade) from usuario)

exec maior_idade 
