package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.a;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qu1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ qu1(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Set linkedHashSet;
        int i2 = this.A;
        Object obj = this.R;
        Object obj2 = this.L;
        Object obj3 = this.B;
        switch (i2) {
            case 0:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj3;
                yh2 yh2Var = (yh2) obj;
                int i3 = EmulatorActivity.Z1;
                emulatorActivity.setIntent((Intent) obj2);
                sz1 W = emulatorActivity.W();
                W.getClass();
                if (!((hy1) W.p0.getValue()).a()) {
                    W.x0(yh2Var);
                    return;
                } else {
                    hv.L(W.z, null, null, new ja1(W, yh2Var, null), 3);
                    return;
                }
            case 1:
                b bVar = (b) obj2;
                LayoutEditorView layoutEditorView = (LayoutEditorView) obj;
                int intValue = ((Number) ((List) obj3).get(i)).intValue();
                if (intValue == R.string.label_position) {
                    bVar.y();
                    return;
                } else if (intValue == R.string.label_size) {
                    bVar.z(oj3.SIZE);
                    return;
                } else if (intValue == R.string.center_horizontal) {
                    layoutEditorView.j();
                    return;
                } else if (intValue == R.string.center_vertical) {
                    layoutEditorView.k();
                    return;
                } else if (intValue == R.string.delete) {
                    layoutEditorView.m();
                    return;
                } else {
                    return;
                }
            case 2:
                p15 p15Var = (p15) obj2;
                StoragePickerPreference storagePickerPreference = (StoragePickerPreference) obj;
                String str = (String) ((List) obj3).get(i);
                p15Var.getClass();
                Context context = storagePickerPreference.getContext();
                context.getClass();
                String b = p15.b(context, str);
                k15 k15Var = p15Var.a;
                zb zbVar = new zb(k15Var.requireContext());
                zbVar.z(R.string.remove_rom_directory_title);
                ((wb) zbVar.L).f = k15Var.getString(R.string.remove_rom_directory_message, b);
                zbVar.y(R.string.action_remove, new qu1(p15Var, storagePickerPreference, str, 3));
                zbVar.x(R.string.cancel, null);
                zbVar.B();
                return;
            case 3:
                Preference preference = (StoragePickerPreference) obj2;
                String str2 = (String) obj;
                ((p15) obj3).getClass();
                Set<String> persistedStringSet = preference.getPersistedStringSet(du1.A);
                if (persistedStringSet != null) {
                    linkedHashSet = gt0.o1(persistedStringSet);
                } else {
                    linkedHashSet = new LinkedHashSet();
                }
                if (linkedHashSet.remove(str2)) {
                    Set<String> o1 = gt0.o1(linkedHashSet);
                    if (preference.isPersistent()) {
                        preference.persistStringSet(o1);
                    }
                    x05 onPreferenceChangeListener = preference.getOnPreferenceChangeListener();
                    if (onPreferenceChangeListener != null) {
                        onPreferenceChangeListener.a(preference, o1);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) obj3;
                int i4 = RomDetailsActivity.J0;
                hv.L(bl2.C(romDetailsActivity), null, null, new ev5(romDetailsActivity, (pq5) obj2, (Uri) obj, null, 0), 3);
                return;
            case 5:
                a aVar = (a) obj3;
                hu3 viewLifecycleOwner = aVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                hv.L(bl2.C(viewLifecycleOwner), null, null, new sy5(aVar, (pq5) obj2, (Uri) obj, null, 0), 3);
                return;
            default:
                ((ne4) obj3).o(((dh5) obj2).A, ((dh5) obj).A);
                return;
        }
    }
}
