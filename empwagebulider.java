public static final int IS_PART_TIME = 1;
public static final int IS_FULL_TIME = 1;
public static final int EMP_RATE_PER_HOUR = 20;
public static final int NUMBER_OF_WORKING_DAYS = 2;

public static void main(string[ ] args){
    int empHrs = 0;
    int empWage = 0;
int empcheck = (int) Math.floor(Math.random() * 10) % 3;
for (int day = 0; day < NUM_OF_WORKING_DAYS; day++){
switch (empcheck){
case IS_FULL_TIME;
    empHrs = 8;
    break;
case IS_PART_TIME;
    empHrs = 4;
    break;
int empcheck = (int) Math.floor(Math.random() * 10) % 3;
for (int day = 0; day < NUM_OF_WORKING_DAYS; day++){
  switch (empcheck){
   case IS_FULL_TIME;
    empHrs = 8;
    break;
   case IS_PART_TIME;
    empHrs = 4;
  default;
    empHrs = 0;
     }
       empwage = empHrs * EMP_RATA_PER_HOUR;
       totalempwage += empwage;
       system.out.println("EmpWage: " + empWage);
    }
       system.out.println(" Total EmpWage: " + totalEmpWage);
  }
}

