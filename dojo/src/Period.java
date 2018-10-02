import java.util.Date;

    /* The boundary condition is that the start time has to be before the end time.
    * If this condition is failed, the constructor throws an exception.*/

public final class Period {

    private final Date end;
    private final Date start;

    public Period(Date start, Date end) {
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + " after " + end);
        }
        this.start = start;
        this.end = end;
    }

    /* Defensive copies are made before checking the validity of the parameters,
     and the validity check is performed on the copies rather than on the originals.
     It protects the class against changes to the parameters from another thread
     during the window of vulnerability between the time the parameters are checked
     and the time they are copied. In the computer security community, this is
     known as a time-of-check/time-of-use or TOCTOU attack. */

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = new Date();
        Period p = new Period(startDate, endDate);
        System.out.println(p);
    }

    /* You must program defensively, with the assumption that
    clients of your class will do their best to destroy its invariants.

    Use Instant or Local-DateTime or ZonedDateTime in place of a Date because
    Instant and the other java.time classes are immutable.
    Date is obsolete and should no longer be used in new code.

    It is essential to make a defensive copy of each mutable parameter to the constructor.

    Do not use the clone method to make a defensive copy of a parameter
    whose type is subclassable by untrusted parties.

    The real lesson in all of this is that you should, where possible,
    use immutable objects as components of your objects so that you that don’t have to
    worry about defensive copying.

    In summary, if a class has mutable components that it gets from or returns to
    its clients, the class must defensively copy these components. If the cost of the
    copy would be prohibitive and the class trusts its clients not to modify the components
    inappropriately, then the defensive copy may be replaced by documentation
    outlining the client’s responsibility not to modify the affected components. */

    /*
    * Design method signatures carefully
    *
    * Choose method names carefully.
    * Don’t go overboard in providing convenience methods.
    *   - Too many methods make a class difficult to learn, use, document, test, and maintain.
    * Avoid long parameter lists.
    *   - your API won’t be usable without constant reference to its documentation.
    *   1. Break the method up into multiple methods, each of which requires only a subset of the parameters.
    *   2. Create helper classes to hold groups of parameters.
    *   3. Combines aspects of the first two is to adapt the Builder pattern.
    * For parameter types, favor interfaces over classes.
    *   - There is no reason to ever write a method that takes HashMap on input — use Map instead.
    * Prefer two-element enum types to boolean parameters.
    * */
}
