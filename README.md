# planetfood
Desktop aApplication
****////FOR EXPORTING THE DUMP FILE ***///
STEP 1:-open cmd in administration mode
STEP 2:-cd ..
STEP 3:-cd ..
STEP 4:-exp username/password file=filename.dmp
***/// filw will be succesfully exported



***///FOR IMPORTING DUMP FILE ***///
STEP 1:-after exporting the file u will get the dump file in c drive, post which copy the file and paste it on desktop.
NOTE-  open oracle command line and create a ne user then import those dump file
STEP 3:-create user abc identified by abc;
STEP 4:-conn sys as sysdba;
STEP 5:-grant dba to abc;
STEP 6:-conn abc/abc;
not :-minimize  and got to the desktop
STEP 7:-go to the desktop window and press window+r and wite imp.exe
STEP 8:-write username and password
STEP 9:-copy the file path and paste it and press enter
STEP 10:-press y in all questions
STEP 11:-now go to the oracle command line and write select * from tab;
you will get all tables
