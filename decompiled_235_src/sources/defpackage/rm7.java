package defpackage;

import android.content.DialogInterface;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rm7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rm7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ VideoPreferencesFragment B;

    public /* synthetic */ rm7(VideoPreferencesFragment videoPreferencesFragment, int i) {
        this.A = i;
        this.B = videoPreferencesFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        VideoPreferencesFragment videoPreferencesFragment = this.B;
        switch (i2) {
            case 0:
                videoPreferencesFragment.D();
                return;
            case 1:
                videoPreferencesFragment.D0 = true;
                dialogInterface.dismiss();
                return;
            case 2:
                ae6 ae6Var = videoPreferencesFragment.h0;
                if (ae6Var != null) {
                    synchronized (ae6Var) {
                        try {
                            ae6Var.a.delete();
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                }
                nb3.a0("shaderCompatibilityLog");
                throw null;
            default:
                videoPreferencesFragment.D();
                return;
        }
    }
}
