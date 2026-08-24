package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h32  reason: default package */
/* loaded from: classes.dex */
public final class h32 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ le2[] B;

    public /* synthetic */ h32(le2[] le2VarArr, int i) {
        this.A = i;
        this.B = le2VarArr;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        le2[] le2VarArr = this.B;
        switch (i) {
            case 0:
                return new Object[le2VarArr.length];
            case 1:
                return new Object[le2VarArr.length];
            default:
                return new x21[le2VarArr.length];
        }
    }
}
