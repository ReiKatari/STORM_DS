package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ct5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ct5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ ki2 B;
    public final /* synthetic */ SaveFilesPreferencesFragment L;
    public final /* synthetic */ Uri R;

    public /* synthetic */ ct5(ki2 ki2Var, SaveFilesPreferencesFragment saveFilesPreferencesFragment, Uri uri) {
        this.B = ki2Var;
        this.L = saveFilesPreferencesFragment;
        this.R = uri;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        Uri uri = this.R;
        SaveFilesPreferencesFragment saveFilesPreferencesFragment = this.L;
        ki2 ki2Var = this.B;
        switch (i2) {
            case 0:
                saveFilesPreferencesFragment.k().m(uri);
                ki2Var.c();
                saveFilesPreferencesFragment.k().i();
                return;
            default:
                ki2Var.c();
                v16 k = saveFilesPreferencesFragment.k();
                uri.getClass();
                String jSONObject = k.d().toString();
                jSONObject.getClass();
                k.p(uri, jSONObject);
                saveFilesPreferencesFragment.k().i();
                return;
        }
    }

    public /* synthetic */ ct5(SaveFilesPreferencesFragment saveFilesPreferencesFragment, Uri uri, ki2 ki2Var) {
        this.L = saveFilesPreferencesFragment;
        this.R = uri;
        this.B = ki2Var;
    }
}
