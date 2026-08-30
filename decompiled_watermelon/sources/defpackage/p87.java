package defpackage;

import android.content.DialogInterface;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p87  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class p87 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ VideoPreferencesFragment B;

    public /* synthetic */ p87(VideoPreferencesFragment videoPreferencesFragment, int i) {
        this.A = i;
        this.B = videoPreferencesFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        VideoPreferencesFragment videoPreferencesFragment = this.B;
        switch (i2) {
            case 0:
                videoPreferencesFragment.A();
                return;
            case 1:
                o26 o26Var = videoPreferencesFragment.g0;
                if (o26Var != null) {
                    synchronized (o26Var) {
                        try {
                            o26Var.a.delete();
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                }
                b53.g0("shaderCompatibilityLog");
                throw null;
            default:
                videoPreferencesFragment.A();
                return;
        }
    }
}
