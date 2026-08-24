package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cc7  reason: default package */
/* loaded from: classes.dex */
public final class cc7 extends bc7 {
    public final /* synthetic */ int R;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.R) {
            case 0:
                int i = this.L;
                this.L = i + 2;
                Object[] objArr = this.A;
                return new t04(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.L;
                this.L = i2 + 2;
                return this.A[i2];
            default:
                int i3 = this.L;
                this.L = i3 + 2;
                return this.A[i3 + 1];
        }
    }
}
