package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z36  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z36 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ on2 B;
    public final /* synthetic */ SaveFilesPreferencesFragment L;
    public final /* synthetic */ Uri R;

    public /* synthetic */ z36(on2 on2Var, SaveFilesPreferencesFragment saveFilesPreferencesFragment, Uri uri) {
        this.B = on2Var;
        this.L = saveFilesPreferencesFragment;
        this.R = uri;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        Uri uri = this.R;
        SaveFilesPreferencesFragment saveFilesPreferencesFragment = this.L;
        on2 on2Var = this.B;
        switch (i2) {
            case 0:
                saveFilesPreferencesFragment.k().m(uri);
                on2Var.c();
                saveFilesPreferencesFragment.k().i();
                return;
            default:
                on2Var.c();
                jd6 k = saveFilesPreferencesFragment.k();
                uri.getClass();
                String jSONObject = k.d().toString();
                jSONObject.getClass();
                k.p(uri, jSONObject);
                saveFilesPreferencesFragment.k().i();
                return;
        }
    }

    public /* synthetic */ z36(SaveFilesPreferencesFragment saveFilesPreferencesFragment, Uri uri, on2 on2Var) {
        this.L = saveFilesPreferencesFragment;
        this.R = uri;
        this.B = on2Var;
    }
}
