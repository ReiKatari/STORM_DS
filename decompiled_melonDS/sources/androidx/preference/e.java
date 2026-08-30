package androidx.preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends Preference {
    public long A;

    @Override // androidx.preference.Preference
    public final long getId() {
        return this.A;
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(i0 i0Var) {
        super.onBindViewHolder(i0Var);
        i0Var.f1568x = false;
    }
}
