-- Popula empresas
INSERT INTO companies (id, name) VALUES
                                     ('a7420206-c5f7-4a0a-88e8-c095c91109e9', 'Tech Corp'),
                                     ('a7420206-c5f7-4a0a-88e8-c095c91109ea', 'Finance Solutions'),
                                     ('a7420206-c5f7-4a0a-88e8-c095c91109eb', 'Health Systems');

-- Popula produtos
INSERT INTO products (id, name) VALUES
                                    ('a1420206-c5f7-4a0a-88e8-c095c91109e7', 'PIX'),
                                    ('a7420203-c5f7-4a0a-88e8-c095c91109e8', 'Payments'),
                                    ('a7423206-c5f7-4a0a-88e8-c095c91109e9', 'Accounts'),
                                    ('a7420206-c5f7-4a0a-88e8-c095c9110931', 'Loans');

-- Popula certificados
INSERT INTO certificates (id, fingerprint, valid_until) VALUES
                                                            ('a7420206-c5f7-4a0a-88e8-c095291109e7',  uuid_generate_v4(), now() + interval '1 year'),
                                                            ('a7420206-c527-4a0a-88e8-c095c91109e7', uuid_generate_v4(), now() + interval '2 year'),
                                                            ('a7420206-c5f7-4a0a-81e8-c095c91109e7',  uuid_generate_v4(), now() + interval '1 year');

-- Popula aplicações (agora com certificate_id)
INSERT INTO applications (id, name, company_id, client_id, client_secret, certificate_id, created_at, updated_at)
VALUES
    ('a7420206-c5f7-4a0a-81e8-c095c91109ec',  'Teste App 1', 'a7420206-c5f7-4a0a-88e8-c095c91109e9', uuid_generate_v4(), uuid_generate_v4(), 'a7420206-c5f7-4a0a-88e8-c095291109e7', now(), now()),
    ('a7420206-c5f7-4a0a-81e8-c095c91109ed', 'Teste App 2', 'a7420206-c5f7-4a0a-88e8-c095c91109e9', uuid_generate_v4(), uuid_generate_v4(), 'a7420206-c527-4a0a-88e8-c095c91109e7', now(), now()),
    ('a7420206-c5f7-4a0a-81e8-c095c91109ee',  'Teste App 3', 'a7420206-c5f7-4a0a-88e8-c095c91109eb', uuid_generate_v4(), uuid_generate_v4(), 'a7420206-c5f7-4a0a-81e8-c095c91109e7', now(), now());

-- Popula aplicações x produtos
INSERT INTO application_products (application_id, product_id)
VALUES
    ('a7420206-c5f7-4a0a-81e8-c095c91109ec','a1420206-c5f7-4a0a-88e8-c095c91109e7'),
    ('a7420206-c5f7-4a0a-81e8-c095c91109ec','a7420203-c5f7-4a0a-88e8-c095c91109e8'),
    ('a7420206-c5f7-4a0a-81e8-c095c91109ed','a7423206-c5f7-4a0a-88e8-c095c91109e9'),
    ('a7420206-c5f7-4a0a-81e8-c095c91109ee','a7420206-c5f7-4a0a-88e8-c095c9110931');