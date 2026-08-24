package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rw2  reason: default package */
/* loaded from: classes.dex */
public final class rw2 implements y93 {
    public static final rw2 b = new rw2(0);
    public static final rw2 c = new rw2(1);
    public static final rw2 d = new rw2(2);
    public static final rw2 e = new rw2(3);
    public final /* synthetic */ int a;

    public /* synthetic */ rw2(int i) {
        this.a = i;
    }

    @Override // defpackage.y93
    public final boolean a(int i) {
        switch (this.a) {
            case 0:
                if (sw2.forNumber(i) != null) {
                    return true;
                }
                return false;
            case 1:
                if (ug3.forNumber(i) != null) {
                    return true;
                }
                return false;
            case 2:
                if (hh3.forNumber(i) != null) {
                    return true;
                }
                return false;
            default:
                if (jp4.forNumber(i) != null) {
                    return true;
                }
                return false;
        }
    }
}
