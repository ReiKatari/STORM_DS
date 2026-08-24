package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gy2  reason: default package */
/* loaded from: classes.dex */
public final class gy2 extends aj3 implements eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ hy2[] L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy2(hy2[] hy2VarArr, int i) {
        super(2);
        this.B = i;
        this.L = hy2VarArr;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.B;
        hy2[] hy2VarArr = this.L;
        switch (i) {
            case 0:
                return Float.valueOf(gi2.i((cx4) obj, true, hy2VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(gi2.i((cx4) obj, false, hy2VarArr, ((Number) obj2).floatValue()));
        }
    }
}
