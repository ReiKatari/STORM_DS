package defpackage;

import android.app.ProgressDialog;
import androidx.fragment.app.p;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i81  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i81 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ CustomFirmwarePreferencesFragment B;
    public final /* synthetic */ ProgressDialog L;

    public /* synthetic */ i81(CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment, ProgressDialog progressDialog, int i) {
        this.A = i;
        this.B = customFirmwarePreferencesFragment;
        this.L = progressDialog;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        final ProgressDialog progressDialog = this.L;
        CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment = this.B;
        final int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                p activity = customFirmwarePreferencesFragment.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() { // from class: j81
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = r3;
                            int i3 = intValue;
                            ProgressDialog progressDialog2 = progressDialog;
                            switch (i2) {
                                case 0:
                                    progressDialog2.setProgress(i3);
                                    return;
                                default:
                                    progressDialog2.setProgress(i3);
                                    return;
                            }
                        }
                    });
                }
                return jg7Var;
            default:
                p activity2 = customFirmwarePreferencesFragment.getActivity();
                if (activity2 != null) {
                    activity2.runOnUiThread(new Runnable() { // from class: j81
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = r3;
                            int i3 = intValue;
                            ProgressDialog progressDialog2 = progressDialog;
                            switch (i2) {
                                case 0:
                                    progressDialog2.setProgress(i3);
                                    return;
                                default:
                                    progressDialog2.setProgress(i3);
                                    return;
                            }
                        }
                    });
                }
                return jg7Var;
        }
    }
}
