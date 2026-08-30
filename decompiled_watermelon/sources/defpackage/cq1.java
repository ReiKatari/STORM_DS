package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.preference.Preference;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.a;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cq1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ cq1(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        hd3 hd3Var;
        Set linkedHashSet;
        int i2 = this.A;
        Object obj = this.R;
        Object obj2 = this.L;
        Object obj3 = this.B;
        switch (i2) {
            case 0:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj3;
                ln2 ln2Var = (ln2) obj;
                int i3 = EmulatorActivity.P1;
                emulatorActivity.setIntent((Intent) obj2);
                hv1 U = emulatorActivity.U();
                U.getClass();
                if (!((wt1) U.p0.getValue()).a()) {
                    U.z0(ln2Var);
                    return;
                } else {
                    tq5.w(U.z, null, null, new my1(U, ln2Var, null), 3);
                    return;
                }
            case 1:
                b bVar = (b) obj2;
                LayoutEditorView layoutEditorView = (LayoutEditorView) obj;
                int intValue = ((Number) ((List) obj3).get(i)).intValue();
                if (intValue == R.string.label_position) {
                    bVar.z();
                    return;
                } else if (intValue == R.string.label_size) {
                    bVar.A(wc3.SIZE);
                    return;
                } else if (intValue == R.string.center_horizontal) {
                    layoutEditorView.j();
                    return;
                } else if (intValue == R.string.center_vertical) {
                    layoutEditorView.k();
                    return;
                } else if (intValue == R.string.delete && (hd3Var = layoutEditorView.g0) != null) {
                    layoutEditorView.removeView(hd3Var.a);
                    layoutEditorView.getViews().remove(hd3Var.b);
                    layoutEditorView.m();
                    layoutEditorView.i0 = true;
                    layoutEditorView.o();
                    return;
                } else {
                    return;
                }
            case 2:
                ns4 ns4Var = (ns4) obj2;
                StoragePickerPreference storagePickerPreference = (StoragePickerPreference) obj;
                String str = (String) ((List) obj3).get(i);
                ns4Var.getClass();
                Context context = storagePickerPreference.getContext();
                context.getClass();
                String b = ns4.b(context, str);
                is4 is4Var = ns4Var.a;
                sb sbVar = new sb(is4Var.requireContext());
                sbVar.A(R.string.remove_rom_directory_title);
                ((pb) sbVar.L).f = is4Var.getString(R.string.remove_rom_directory_message, b);
                sbVar.z(R.string.action_remove, new cq1(ns4Var, storagePickerPreference, str, 3));
                sbVar.x(R.string.cancel, null);
                sbVar.C();
                return;
            case 3:
                Preference preference = (StoragePickerPreference) obj2;
                String str2 = (String) obj;
                ((ns4) obj3).getClass();
                Set<String> persistedStringSet = preference.getPersistedStringSet(up1.A);
                if (persistedStringSet != null) {
                    linkedHashSet = tq0.r1(persistedStringSet);
                } else {
                    linkedHashSet = new LinkedHashSet();
                }
                if (linkedHashSet.remove(str2)) {
                    Set<String> r1 = tq0.r1(linkedHashSet);
                    if (preference.isPersistent()) {
                        preference.persistStringSet(r1);
                    }
                    ur4 onPreferenceChangeListener = preference.getOnPreferenceChangeListener();
                    if (onPreferenceChangeListener != null) {
                        onPreferenceChangeListener.a(preference, r1);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) obj3;
                int i4 = RomDetailsActivity.I0;
                tq5.w(hk2.y(romDetailsActivity), null, null, new nk5(romDetailsActivity, (rg5) obj2, (Uri) obj, null, 0), 3);
                return;
            case 5:
                a aVar = (a) obj3;
                fn3 viewLifecycleOwner = aVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                tq5.w(hk2.y(viewLifecycleOwner), null, null, new co5(aVar, (rg5) obj2, (Uri) obj, null, 0), 3);
                return;
            default:
                ((b4) obj3).j(((n75) obj2).A, ((n75) obj).A);
                return;
        }
    }
}
