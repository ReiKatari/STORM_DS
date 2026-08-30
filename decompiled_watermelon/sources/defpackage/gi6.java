package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gi6  reason: default package */
/* loaded from: classes.dex */
public final class gi6 extends c46 implements ce6 {
    @Override // defpackage.ce6
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.c0;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.d0 + ((int) ((q() + this.f0) - this.d0))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.c0;
            objArr.getClass();
            p(Integer.valueOf(((Number) objArr[((int) ((this.d0 + ((int) ((q() + this.f0) - this.d0))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
