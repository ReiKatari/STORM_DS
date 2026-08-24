package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yt6  reason: default package */
/* loaded from: classes.dex */
public final class yt6 extends of6 implements rp6 {
    @Override // defpackage.rp6
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.d0;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.e0 + ((int) ((q() + this.g0) - this.e0))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.d0;
            objArr.getClass();
            k(Integer.valueOf(((Number) objArr[((int) ((this.e0 + ((int) ((q() + this.g0) - this.e0))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
