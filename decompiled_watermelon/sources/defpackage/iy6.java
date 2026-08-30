package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iy6  reason: default package */
/* loaded from: classes.dex */
public final class iy6 extends gy6 {
    public final ym4 R;

    public iy6(ym4 ym4Var) {
        this.R = ym4Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.L;
        this.L = i + 2;
        Object[] objArr = this.A;
        return new q14(this.R, objArr[i], objArr[i + 1]);
    }
}
