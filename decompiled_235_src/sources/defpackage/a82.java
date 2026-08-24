package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a82  reason: default package */
/* loaded from: classes.dex */
public final class a82 extends Preference {
    public long A;

    @Override // androidx.preference.Preference
    public final long getId() {
        return this.A;
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(x15 x15Var) {
        super.onBindViewHolder(x15Var);
        x15Var.x = false;
    }
}
