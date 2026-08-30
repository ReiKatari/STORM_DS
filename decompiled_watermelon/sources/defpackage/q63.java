package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q63  reason: default package */
/* loaded from: classes.dex */
public abstract class q63 {
    public static final an1 a = new an1("COMPLETING_ALREADY", 9);
    public static final an1 b = new an1("COMPLETING_WAITING_CHILDREN", 9);
    public static final an1 c = new an1("COMPLETING_RETRY", 9);
    public static final an1 d = new an1("TOO_LATE_TO_CANCEL", 9);
    public static final an1 e = new an1("SEALED", 9);
    public static final ip1 f = new ip1(false);
    public static final ip1 g = new ip1(true);

    public static final Object a(Object obj) {
        by2 by2Var;
        ay2 ay2Var;
        if (obj instanceof by2) {
            by2Var = (by2) obj;
        } else {
            by2Var = null;
        }
        if (by2Var != null && (ay2Var = by2Var.a) != null) {
            return ay2Var;
        }
        return obj;
    }
}
