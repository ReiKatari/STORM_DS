package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class em2 implements rb0, y05 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ em2(Runnable runnable, ea7 ea7Var, Runnable runnable2) {
        this.A = 0;
        this.B = runnable;
        this.R = ea7Var;
        this.L = runnable2;
    }

    @Override // defpackage.y05
    public void i(Preference preference) {
        StoragePickerPreference storagePickerPreference = (StoragePickerPreference) this.B;
        p15 p15Var = (p15) this.L;
        d9 d9Var = (d9) this.R;
        Set<String> set = du1.A;
        Set<String> persistedStringSet = preference.getPersistedStringSet(set);
        if (persistedStringSet != null) {
            set = gt0.p1(persistedStringSet);
        }
        Uri uri = null;
        if (storagePickerPreference.A && !set.isEmpty()) {
            p15Var.getClass();
            List<String> k1 = gt0.k1(set);
            ArrayList arrayList = new ArrayList(ht0.v0(k1, 10));
            for (String str : k1) {
                Context context = storagePickerPreference.getContext();
                context.getClass();
                arrayList.add(p15.b(context, str));
            }
            zb zbVar = new zb(p15Var.a.requireContext());
            zbVar.z(R.string.manage_rom_directories);
            zbVar.v((CharSequence[]) arrayList.toArray(new String[0]), new qu1(k1, p15Var, storagePickerPreference, 2));
            zbVar.y(R.string.add_directory, new nu1(3, k1, d9Var));
            zbVar.x(R.string.cancel, null);
            zbVar.B();
            return;
        }
        String str2 = (String) gt0.I0(set);
        if (str2 != null) {
            uri = Uri.parse(str2);
        }
        d9Var.a(uri);
    }

    @Override // defpackage.rb0
    public Object s(qb0 qb0Var) {
        int i = this.A;
        Object obj = this.R;
        Object obj2 = this.L;
        Object obj3 = this.B;
        switch (i) {
            case 1:
                l61 l61Var = (l61) obj3;
                a71 a71Var = (a71) obj2;
                eo2 eo2Var = (eo2) obj;
                rk3 rk3Var = new rk3((rc3) l61Var.Z(vs0.h0), 2);
                tj1 tj1Var = tj1.INSTANCE;
                hl5 hl5Var = qb0Var.c;
                if (hl5Var != null) {
                    hl5Var.a(tj1Var, rk3Var);
                }
                return hv.L(g04.i(l61Var), null, a71Var, new u12(eo2Var, qb0Var, (r41) null, 15), 1);
            default:
                Executor executor = (Executor) obj3;
                String str = (String) obj2;
                on2 on2Var = (on2) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                hx3 hx3Var = new hx3(atomicBoolean, 0);
                tj1 tj1Var2 = tj1.INSTANCE;
                hl5 hl5Var2 = qb0Var.c;
                if (hl5Var2 != null) {
                    hl5Var2.a(tj1Var2, hx3Var);
                }
                executor.execute(new ix3(atomicBoolean, qb0Var, on2Var, 0));
                return str;
        }
    }

    public /* synthetic */ em2(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
