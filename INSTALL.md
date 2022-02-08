--GENERAR JAR CON DEPENDENCIAS
--PERFILES: pruebas, produccion
mvn clean package -P produccion

--EJECUTAR JAR CON DEPENDENCIAS
java -jar target/demo8-1.0-SNAPSHOT-jar-with-dependencies.jar

--SENTENCIA CURL
curl http://localhost:3456/entornos