/*
*   복습 포인트:
*   MyDate 생성자 오버로딩할때 public 'void' MyDate가 아니라 public MyDate이다.
*   케이스 내에서 if문 처리할때 불리언은 if문을 굳이 안써도 처리가 가능하다.
*   case 1: case 3: 이래도 되는데, case 1, 3 되는지 테스트*/

package calendar;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean valid = true;

    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
        isValid();
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    private boolean isValid() {
        if (year < 0 || month < 0 || month > 12) {
            valid = false;
        }
        else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    valid = day >= 1 && day <= 31;
                    break;
                case 4: case 6: case 9: case 11:
                    valid = day >= 1 && day <= 30;
                    break;
                case 2:
                    if (day >= 1 && day <= 28)
                        valid = true;
                    else if (year / 4 == 0 && (year / 400 == 0 || year / 100 != 0)) {
                        this.valid = (day >= 1 && day <= 29);
                    }
                    else
                        this.valid = false;
                    break;
            }
        }
        return this.valid;
    }

    public void printIsValid() {
        if (this.valid)
            System.out.println("유효한 날짜입니다.");
        else
            System.out.println("유효하지 않은 날짜입니다.");
    }
}
