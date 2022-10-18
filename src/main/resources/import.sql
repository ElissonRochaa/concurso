INSERT INTO tb_curso(nome, sigla) VALUES ('Licenciatura em Computação', 'LinComp');
INSERT INTO tb_curso(nome, sigla) VALUES ('Engenharia de Software', 'EngSoft');

INSERT INTO tb_professor(curso_id, nome, email) VALUES (1, 'Elisson Rocha', 'elissonrochaa@gmail.com');
INSERT INTO tb_professor(curso_id, nome, email) VALUES (2, 'Adauto Trigueiro de Almeida Filho', 'adauto.filho@upe.br');
INSERT INTO tb_professor(curso_id, nome, email) VALUES (2, 'Cleyton Mário de Oliveira Rodrigues', 'cleyton.rodrigues@upe.br');
INSERT INTO tb_professor(curso_id, nome, email) VALUES (1, 'Helaine Solange Lins Barreiros', 'helaine.lins@upe.br');

INSERT INTO tb_aluno(curso_id, nome, email) VALUES (1, 'Sebastiao Rogerio', 'sebastiaorogerio@gmail.com');
INSERT INTO tb_aluno(curso_id, nome, email) VALUES (2, 'Kayo Henrique', 'kayohenrique@gmail.com');
INSERT INTO tb_aluno(curso_id, nome, email) VALUES (2, 'Maria Eduarda', 'mariaeduarda@gmail.com');

INSERT INTO tb_disciplina(professor_id, nome, codigo) VALUES (1, 'Programação para WEB', 'SOF0031G');
INSERT INTO tb_disciplina(professor_id, nome, codigo) VALUES (1, 'Programação 3', 'SOF0019G');

INSERT INTO tb_aluno_disciplinas(aluno_id, disciplinas_id) VALUES (1,1);
INSERT INTO tb_aluno_disciplinas(aluno_id, disciplinas_id) VALUES (1,2);
INSERT INTO tb_aluno_disciplinas(aluno_id, disciplinas_id) VALUES (2,1);
INSERT INTO tb_aluno_disciplinas(aluno_id, disciplinas_id) VALUES (3,1);
INSERT INTO tb_aluno_disciplinas(aluno_id, disciplinas_id) VALUES (3,2);