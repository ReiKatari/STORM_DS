package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eh2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class eh2 implements j90, vr4 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ eh2(Runnable runnable, ix6 ix6Var, Runnable runnable2) {
        this.A = 0;
        this.B = runnable;
        this.R = ix6Var;
        this.L = runnable2;
    }

    @Override // defpackage.vr4
    public void c(Preference preference) {
        StoragePickerPreference storagePickerPreference = (StoragePickerPreference) this.B;
        ns4 ns4Var = (ns4) this.L;
        c9 c9Var = (c9) this.R;
        Set<String> set = up1.A;
        Set<String> persistedStringSet = preference.getPersistedStringSet(set);
        if (persistedStringSet != null) {
            set = tq0.s1(persistedStringSet);
        }
        Uri uri = null;
        if (storagePickerPreference.A && !set.isEmpty()) {
            ns4Var.getClass();
            List<String> n1 = tq0.n1(set);
            ArrayList arrayList = new ArrayList(uq0.y0(n1, 10));
            for (String str : n1) {
                Context context = storagePickerPreference.getContext();
                context.getClass();
                arrayList.add(ns4.b(context, str));
            }
            sb sbVar = new sb(ns4Var.a.requireContext());
            sbVar.A(R.string.manage_rom_directories);
            sbVar.v((CharSequence[]) arrayList.toArray(new String[0]), new cq1(n1, ns4Var, storagePickerPreference, 2));
            sbVar.z(R.string.add_directory, new aq1(4, n1, c9Var));
            sbVar.x(R.string.cancel, null);
            sbVar.C();
            return;
        }
        String str2 = (String) tq0.L0(set);
        if (str2 != null) {
            uri = Uri.parse(str2);
        }
        c9Var.a(uri);
    }

    @Override // defpackage.j90
    public Object i(i90 i90Var) {
        int i = this.A;
        Object obj = this.R;
        Object obj2 = this.L;
        Object obj3 = this.B;
        switch (i) {
            case 1:
                e31 e31Var = (e31) obj3;
                s31 s31Var = (s31) obj2;
                aj2 aj2Var = (aj2) obj;
                tm3 tm3Var = new tm3(1, (c63) e31Var.I(k45.d0));
                pf1 pf1Var = pf1.INSTANCE;
                pb5 pb5Var = i90Var.c;
                if (pb5Var != null) {
                    pb5Var.a(tm3Var, pf1Var);
                }
                return tq5.w(iq2.c(e31Var), null, s31Var, new wx1(aj2Var, i90Var, null, 11), 1);
            default:
                Executor executor = (Executor) obj3;
                String str = (String) obj2;
                ki2 ki2Var = (ki2) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                gq3 gq3Var = new gq3(atomicBoolean, 0);
                pf1 pf1Var2 = pf1.INSTANCE;
                pb5 pb5Var2 = i90Var.c;
                if (pb5Var2 != null) {
                    pb5Var2.a(gq3Var, pf1Var2);
                }
                executor.execute(new hq3(atomicBoolean, i90Var, ki2Var, 0));
                return str;
        }
    }

    public /* synthetic */ eh2(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
