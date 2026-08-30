package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s02  reason: default package */
/* loaded from: classes.dex */
public final class s02 extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ mi2 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s02(int i, mi2 mi2Var) {
        super(1);
        this.B = i;
        this.L = mi2Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        mi2 mi2Var = this.L;
        switch (i) {
            case 0:
                long j = ((i33) obj).a;
                return new i33((((int) (j & 4294967295L)) & 4294967295L) | (((Number) mi2Var.n(Integer.valueOf((int) (j >> 32)))).intValue() << 32));
            case 1:
                return new a33(((Number) mi2Var.n(Integer.valueOf((int) (((i33) obj).a >> 32)))).intValue() << 32);
            case 2:
                return new a33(((Number) mi2Var.n(Integer.valueOf((int) (((i33) obj).a & 4294967295L)))).intValue() & 4294967295L);
            case 3:
                return new a33(((Number) mi2Var.n(Integer.valueOf((int) (((i33) obj).a >> 32)))).intValue() << 32);
            default:
                return new a33(((Number) mi2Var.n(Integer.valueOf((int) (((i33) obj).a & 4294967295L)))).intValue() & 4294967295L);
        }
    }
}
