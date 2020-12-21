CREATE TABLE "user" (
  "id" serial NOT NULL,
  "name" varchar(255) NULL,
  "email" character varying NOT NULL,
  "username" character varying NULL,
  "first_name" character varying NULL,
  "last_name" character varying NULL,
  "password" character varying NOT NULL,
  "date" timestamp NULL,
  "created_at" timestamp NOT NULL,
  "updated_at" timestamp NOT NULL,
  "deleted_at" timestamp NULL,
  "gender" integer NOT NULL
);