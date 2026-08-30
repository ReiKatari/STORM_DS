package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hy6  reason: default package */
/* loaded from: classes.dex */
public final class hy6 extends gy6 {
    public final /* synthetic */ int R;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.R) {
            case 0:
                int i = this.L;
                this.L = i + 2;
                Object[] objArr = this.A;
                return new qt3(0, objArr[i], objArr[i + 1]);
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
