package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc7  reason: default package */
/* loaded from: classes.dex */
public final class dc7 extends bc7 {
    public final dw4 R;

    public dc7(dw4 dw4Var) {
        this.R = dw4Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.L;
        this.L = i + 2;
        Object[] objArr = this.A;
        return new w94(this.R, objArr[i], objArr[i + 1]);
    }
}
