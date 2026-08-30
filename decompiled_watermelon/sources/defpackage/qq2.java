package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qq2  reason: default package */
/* loaded from: classes.dex */
public final class qq2 implements q33 {
    public static final qq2 b = new qq2(0);
    public static final qq2 c = new qq2(1);
    public static final qq2 d = new qq2(2);
    public static final qq2 e = new qq2(3);
    public final /* synthetic */ int a;

    public /* synthetic */ qq2(int i) {
        this.a = i;
    }

    @Override // defpackage.q33
    public final boolean a(int i) {
        switch (this.a) {
            case 0:
                if (rq2.forNumber(i) != null) {
                    return true;
                }
                return false;
            case 1:
                if (ba3.forNumber(i) != null) {
                    return true;
                }
                return false;
            case 2:
                if (pa3.forNumber(i) != null) {
                    return true;
                }
                return false;
            default:
                if (gg4.forNumber(i) != null) {
                    return true;
                }
                return false;
        }
    }
}
