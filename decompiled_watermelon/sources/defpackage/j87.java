package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j87  reason: default package */
/* loaded from: classes.dex */
public final class j87 extends ic3 implements aj2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ gs2[] L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j87(gs2[] gs2VarArr, int i) {
        super(2);
        this.B = i;
        this.L = gs2VarArr;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.B;
        gs2[] gs2VarArr = this.L;
        switch (i) {
            case 0:
                return Float.valueOf(me2.d((xn4) obj, true, gs2VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(me2.d((xn4) obj, false, gs2VarArr, ((Number) obj2).floatValue()));
        }
    }
}
