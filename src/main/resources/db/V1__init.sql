CREATE TABLE jobs (
                      id UUID PRIMARY KEY,
                      title VARCHAR(255) NOT NULL,
                      status VARCHAR(50) NOT NULL,
                      created_at TIMESTAMP NOT NULL
);
