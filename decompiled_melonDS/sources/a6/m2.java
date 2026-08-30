package a6;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m2 extends l2 {
    @Override // a6.l2, aj.g
    public final boolean K() {
        int systemBarsAppearance;
        systemBarsAppearance = this.f487l.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // a6.l2, aj.g
    public final void n0() {
        this.f487l.setSystemBarsBehavior(2);
    }
}
