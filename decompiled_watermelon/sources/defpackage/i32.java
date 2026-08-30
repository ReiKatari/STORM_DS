package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i32  reason: default package */
/* loaded from: classes.dex */
public final class i32 extends Preference {
    public long A;

    @Override // androidx.preference.Preference
    public final long getId() {
        return this.A;
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(vs4 vs4Var) {
        super.onBindViewHolder(vs4Var);
        vs4Var.x = false;
    }
}
