package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8540a = 1;

    @Override // l1.h
    public final void b(int i2, y3.x0 x0Var, int[] iArr, int[] iArr2) {
        switch (this.f8540a) {
            case 0:
                i.c(i2, iArr, iArr2, false);
                return;
            default:
                i.b(iArr, iArr2, false);
                return;
        }
    }

    public final String toString() {
        switch (this.f8540a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
