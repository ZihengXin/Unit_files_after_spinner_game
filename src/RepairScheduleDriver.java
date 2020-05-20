public class RepairScheduleDriver {

    public static void main(String[] args) {
        RepairSchedule r = new RepairSchedule(6);
        System.out.println(r.addRepair(3, 4)); // true
        System.out.println(r.addRepair(0, 1)); // true
        System.out.println(r.addRepair(0, 2)); // false
        System.out.println(r.addRepair(2, 4)); // false
        r.carOut(4);
        System.out.println(r.addRepair(1, 4)); // true
        System.out.println(r.availableMechanics()); // [2, 3, 4, 5]

    }
}
