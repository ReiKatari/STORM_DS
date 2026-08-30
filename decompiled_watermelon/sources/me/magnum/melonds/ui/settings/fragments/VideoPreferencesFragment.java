package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.Formatter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.SwitchPreference;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me.magnum.melonds.common.workers.RetroArchShaderInstallWorker;
import me.magnum.melonds.domain.model.RetroArchShaderSource;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class VideoPreferencesFragment extends Hilt_VideoPreferencesFragment implements os4 {
    public TextView A0;
    public final c9 B0;
    public y37 c0;
    public uf1 d0;
    public w16 e0;
    public gf5 f0;
    public o26 g0;
    public Preference m0;
    public Preference n0;
    public Preference o0;
    public Preference p0;
    public StoragePickerPreference q0;
    public ListPreference r0;
    public Preference s0;
    public q03 u0;
    public kd6 v0;
    public kd6 w0;
    public tb x0;
    public ProgressBar y0;
    public TextView z0;
    public final il6 Z = new il6(new t06(14, this));
    public final ArrayList h0 = new ArrayList();
    public final ArrayList i0 = new ArrayList();
    public final ArrayList j0 = new ArrayList();
    public final ArrayList k0 = new ArrayList();
    public final ArrayList l0 = new ArrayList();
    public final LinkedHashMap t0 = new LinkedHashMap();

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public final class ShaderBrowserAdapter extends g65 {
        public final t06 d;
        public final c e;
        public final ArrayList f = new ArrayList();

        /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
        /* loaded from: classes.dex */
        public final class ViewHolder extends g75 {
            public static final /* synthetic */ int A = 0;
            public final ImageView u;
            public final TextView v;
            public final TextView w;
            public final TextView x;
            public final ImageView y;

            public ViewHolder(View view) {
                super(view);
                View findViewById = view.findViewById(R.id.imageShaderEntryIcon);
                findViewById.getClass();
                this.u = (ImageView) findViewById;
                View findViewById2 = view.findViewById(R.id.textShaderEntryName);
                findViewById2.getClass();
                this.v = (TextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.textShaderEntryDetail);
                findViewById3.getClass();
                this.w = (TextView) findViewById3;
                View findViewById4 = view.findViewById(R.id.textShaderEntryBadge);
                findViewById4.getClass();
                this.x = (TextView) findViewById4;
                View findViewById5 = view.findViewById(R.id.imageShaderEntryChevron);
                findViewById5.getClass();
                this.y = (ImageView) findViewById5;
            }
        }

        public ShaderBrowserAdapter(t06 t06Var, c cVar) {
            this.d = t06Var;
            this.e = cVar;
        }

        @Override // defpackage.g65
        public final int a() {
            return this.f.size();
        }

        @Override // defpackage.g65
        public final void e(g75 g75Var, int i) {
            String str;
            int i2;
            int i3;
            File file;
            ViewHolder viewHolder = (ViewHolder) g75Var;
            final ShaderBrowserItem shaderBrowserItem = (ShaderBrowserItem) this.f.get(i);
            final ShaderBrowserAdapter shaderBrowserAdapter = ShaderBrowserAdapter.this;
            View view = viewHolder.a;
            shaderBrowserItem.getClass();
            boolean z = shaderBrowserItem.c;
            TextView textView = viewHolder.v;
            boolean z2 = shaderBrowserItem.d;
            if (z2) {
                str = view.getContext().getString(R.string.video_retroarch_shader_browser_up);
            } else {
                str = shaderBrowserItem.a;
            }
            textView.setText(str);
            ImageView imageView = viewHolder.u;
            if (z2) {
                i2 = R.drawable.ic_arrow_up;
            } else if (z) {
                i2 = R.drawable.ic_folder;
            } else {
                i2 = R.drawable.ic_file;
            }
            imageView.setImageResource(i2);
            ImageView imageView2 = viewHolder.y;
            boolean z3 = false;
            if (z && !z2) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView2.setVisibility(i3);
            if (!z && b53.x(shaderBrowserItem.b, ((ListPreference) shaderBrowserAdapter.d.B).d0)) {
                z3 = true;
            }
            view.setSelected(z3);
            view.setOnClickListener(new View.OnClickListener() { // from class: me.magnum.melonds.ui.settings.fragments.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i4 = VideoPreferencesFragment.ShaderBrowserAdapter.ViewHolder.A;
                    VideoPreferencesFragment.ShaderBrowserAdapter.this.e.n(shaderBrowserItem);
                }
            });
            viewHolder.w.setVisibility(8);
            viewHolder.x.setVisibility(8);
            if (!z) {
                String str2 = shaderBrowserItem.b;
                VideoPreferencesFragment videoPreferencesFragment = VideoPreferencesFragment.this;
                l lVar = new l(str2, shaderBrowserAdapter, viewHolder);
                File d = videoPreferencesFragment.o().d();
                if (d != null) {
                    if (videoPreferencesFragment.r() == RetroArchShaderSource.INTERNAL) {
                        file = d;
                    } else {
                        file = null;
                    }
                    if (file != null) {
                        if5 if5Var = (if5) videoPreferencesFragment.t0.get(str2);
                        if (if5Var != null) {
                            lVar.n(if5Var);
                        } else {
                            tq5.w(hk2.y(videoPreferencesFragment), null, null, new VideoPreferencesFragment$weighPresetAsync$2(videoPreferencesFragment, str2, lVar, file, null), 3);
                        }
                    }
                }
            }
        }

        @Override // defpackage.g65
        public final g75 f(ViewGroup viewGroup, int i) {
            View inflate = VideoPreferencesFragment.this.getLayoutInflater().inflate(R.layout.item_shader_browser_entry, viewGroup, false);
            inflate.getClass();
            return new ViewHolder(inflate);
        }

        public final void h(List list) {
            list.getClass();
            ArrayList arrayList = this.f;
            arrayList.clear();
            tq0.D0(arrayList, list);
            this.a.b();
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final class ShaderBrowserEntry {
        public final String a;
        public final boolean b;

        public ShaderBrowserEntry(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShaderBrowserEntry) {
                    ShaderBrowserEntry shaderBrowserEntry = (ShaderBrowserEntry) obj;
                    if (!this.a.equals(shaderBrowserEntry.a) || this.b != shaderBrowserEntry.b) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShaderBrowserEntry(name=" + this.a + ", isDirectory=" + this.b + ")";
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final class ShaderBrowserItem {
        public final String a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public ShaderBrowserItem(String str, String str2, boolean z, boolean z2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ShaderBrowserItem) {
                    ShaderBrowserItem shaderBrowserItem = (ShaderBrowserItem) obj;
                    if (!b53.x(this.a, shaderBrowserItem.a) || !b53.x(this.b, shaderBrowserItem.b) || this.c != shaderBrowserItem.c || this.d != shaderBrowserItem.d) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ej6.c(ej6.b(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        }

        public final String toString() {
            StringBuilder v = b31.v("ShaderBrowserItem(label=", this.a, ", path=", this.b, ", isDirectory=");
            v.append(this.c);
            v.append(", isParent=");
            v.append(this.d);
            v.append(")");
            return v.toString();
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public interface ShaderDirectoryLister {
        List a(String str);
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[RetroArchShaderSource.values().length];
            try {
                iArr[RetroArchShaderSource.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RetroArchShaderSource.FOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[VideoRenderer.values().length];
            try {
                iArr2[VideoRenderer.SOFTWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VideoRenderer.OPENGL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoRenderer.COMPUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoRenderer.VULKAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[bf5.values().length];
            try {
                iArr3[bf5.NotEnoughSpace.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[bf5.Truncated.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[bf5.CorruptArchive.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            c = iArr3;
            int[] iArr4 = new int[cm1.values().length];
            try {
                iArr4[cm1.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[cm1.INTERNAL_TOP_EXTERNAL_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[cm1.INTERNAL_BOTTOM_EXTERNAL_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            d = iArr4;
            int[] iArr5 = new int[gv5.values().length];
            try {
                iArr5[gv5.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[gv5.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[gv5.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            e = iArr5;
        }
    }

    public VideoPreferencesFragment() {
        c9 registerForActivityResult = registerForActivityResult(new b9(0), new a(this, 2));
        registerForActivityResult.getClass();
        this.B0 = registerForActivityResult;
    }

    public static void D(VideoPreferencesFragment videoPreferencesFragment, ListPreference listPreference, Uri uri, boolean z, int i) {
        String[] strArr;
        String[] strArr2;
        if ((i & 2) != 0) {
            uri = null;
        }
        if ((i & 4) != 0) {
            if (uri != null) {
                z = true;
            } else {
                z = false;
            }
        }
        kd6 kd6Var = videoPreferencesFragment.v0;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        if (z) {
            listPreference.h(null);
        }
        String str = listPreference.d0;
        if (str != null) {
            strArr = new String[]{str};
        } else {
            strArr = new CharSequence[0];
        }
        listPreference.g(strArr);
        if (str != null) {
            strArr2 = new String[]{str};
        } else {
            strArr2 = new CharSequence[0];
        }
        listPreference.c0 = strArr2;
        if (str == null) {
            str = videoPreferencesFragment.getString(R.string.video_retroarch_shader_preset_summary);
            str.getClass();
        }
        listPreference.setSummary(str);
    }

    public static VideoFiltering I(String str) {
        Object kc5Var;
        if (str == null) {
            str = "";
        }
        try {
            kc5Var = (VideoFiltering) se.t(str, VideoFiltering.values());
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        Object obj = VideoFiltering.NONE;
        if (kc5Var instanceof kc5) {
            kc5Var = obj;
        }
        return (VideoFiltering) kc5Var;
    }

    public static final void k(VideoPreferencesFragment videoPreferencesFragment) {
        tb tbVar = videoPreferencesFragment.x0;
        if (tbVar != null) {
            tbVar.dismiss();
        }
        videoPreferencesFragment.x0 = null;
        videoPreferencesFragment.y0 = null;
        videoPreferencesFragment.z0 = null;
        videoPreferencesFragment.A0 = null;
    }

    public static final void l(VideoPreferencesFragment videoPreferencesFragment, bf5 bf5Var, long j) {
        String string;
        int i = WhenMappings.c[bf5Var.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                string = videoPreferencesFragment.getString(R.string.video_retroarch_shader_error_network);
            } else {
                string = videoPreferencesFragment.getString(R.string.video_retroarch_shader_error_corrupt);
            }
        } else {
            string = videoPreferencesFragment.getString(R.string.video_retroarch_shader_error_space, Formatter.formatShortFileSize(videoPreferencesFragment.requireContext(), j));
        }
        string.getClass();
        sb sbVar = new sb(videoPreferencesFragment.requireContext());
        ((pb) sbVar.L).f = string;
        sbVar.z(R.string.video_retroarch_shader_retry, new p87(videoPreferencesFragment, 0));
        sbVar.x(17039360, null);
        sbVar.C();
    }

    public static final void s(n75 n75Var, TextView textView, SwitchCompat switchCompat, SwitchCompat switchCompat2, j75 j75Var, j75 j75Var2, Button button, Button button2) {
        boolean z;
        int i;
        boolean z2 = true;
        if (n75Var.A != cm1.OFF) {
            z = true;
        } else {
            z = false;
        }
        textView.getClass();
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        switchCompat.setEnabled(z);
        switchCompat2.setEnabled(z);
        if (!z || (!j75Var.A && !j75Var2.A)) {
            z2 = false;
        }
        button.setEnabled(z2);
        button2.setEnabled(z2);
    }

    public static final void t(n75 n75Var, n75 n75Var2, n75 n75Var3, TextView textView, VideoPreferencesFragment videoPreferencesFragment) {
        String m;
        String m2;
        cm1 cm1Var = (cm1) n75Var.A;
        gv5 gv5Var = (gv5) n75Var2.A;
        gv5 gv5Var2 = (gv5) n75Var3.A;
        gv5 A = a53.A(cm1Var);
        gv5 z = a53.z(cm1Var);
        if (gv5Var == null) {
            m = videoPreferencesFragment.getString(R.string.dual_screen_vertical_alignment_preset_value, videoPreferencesFragment.m(A));
            m.getClass();
        } else {
            m = videoPreferencesFragment.m(gv5Var);
        }
        if (gv5Var2 == null) {
            m2 = videoPreferencesFragment.getString(R.string.dual_screen_vertical_alignment_preset_value, videoPreferencesFragment.m(z));
            m2.getClass();
        } else {
            m2 = videoPreferencesFragment.m(gv5Var2);
        }
        String string = videoPreferencesFragment.getString(R.string.dual_screen_vertical_alignment_summary, m, m2);
        string.getClass();
        textView.setText(string);
        textView.setVisibility(0);
    }

    public static final void u(boolean z, SwitchCompat switchCompat, SwitchCompat switchCompat2, boolean z2, boolean z3) {
        boolean z4;
        if (z && z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        switchCompat.setEnabled(z4);
        switchCompat2.setEnabled(z4);
        if (z3) {
            if (!z2) {
                switchCompat.setChecked(false);
                switchCompat2.setChecked(false);
            } else if (!switchCompat.isChecked() && !switchCompat2.isChecked()) {
                switchCompat.setChecked(true);
            }
        }
    }

    public static final void v(boolean z, SwitchCompat switchCompat, SwitchCompat switchCompat2, boolean z2, boolean z3) {
        boolean z4;
        if (z && z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        switchCompat.setEnabled(z4);
        switchCompat2.setEnabled(z4);
        if (z3) {
            if (!z2) {
                switchCompat.setChecked(false);
                switchCompat2.setChecked(false);
            } else if (!switchCompat.isChecked() && !switchCompat2.isChecked()) {
                switchCompat.setChecked(true);
            }
        }
    }

    public static final void w(n75 n75Var, VideoPreferencesFragment videoPreferencesFragment, ShaderDirectoryLister shaderDirectoryLister, LinkedHashMap linkedHashMap, TextView textView, TextView textView2, n75 n75Var2, String str) {
        n75Var.A = str;
        textView.getClass();
        textView2.getClass();
        Object obj = n75Var2.A;
        if (obj != null) {
            ShaderBrowserAdapter shaderBrowserAdapter = (ShaderBrowserAdapter) obj;
            kd6 kd6Var = videoPreferencesFragment.v0;
            if (kd6Var != null) {
                kd6Var.i(null);
            }
            String str2 = "/";
            if (!zg6.B0(str)) {
                str2 = "/".concat(str);
            }
            textView.setText(str2);
            List list = (List) linkedHashMap.get(str);
            int i = 0;
            if (list != null) {
                shaderBrowserAdapter.h(list);
                textView2.setText(R.string.video_retroarch_shader_browser_empty);
                if (!list.isEmpty()) {
                    i = 8;
                }
                textView2.setVisibility(i);
                return;
            }
            shaderBrowserAdapter.h(pp1.A);
            textView2.setText(R.string.info_loading);
            textView2.setVisibility(0);
            videoPreferencesFragment.v0 = tq5.w(hk2.y(videoPreferencesFragment), null, null, new VideoPreferencesFragment$loadShaderBrowserDirectory$2(linkedHashMap, str, shaderBrowserAdapter, textView2, shaderDirectoryLister, null), 3);
            return;
        }
        b53.g0("adapter");
        throw null;
    }

    public static final void z(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((RadioButton) it.next()).setEnabled(z);
        }
    }

    public final void A() {
        xf1 xf1Var = new xf1(RetroArchShaderInstallWorker.class);
        v64 v64Var = v64.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        v64 v64Var2 = v64.CONNECTED;
        v64Var2.getClass();
        ((xh7) xf1Var.B).j = new kz0(new m64(null), v64Var2, false, false, false, false, -1L, -1L, tq0.s1(linkedHashSet));
        id4 c = xf1Var.c();
        Context requireContext = requireContext();
        requireContext.getClass();
        kh7 b = kh7.b(requireContext);
        b.getClass();
        b.a("retroarch-shader-install", g32.KEEP, c);
        x();
    }

    public final void B() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        if (this.m0 == null) {
            return;
        }
        cm1 i2 = ((b56) n()).i();
        boolean z6 = ((b56) n()).b.getBoolean("external_display_keep_ratio", true);
        boolean z7 = false;
        if (((b56) n()).b.getBoolean("dual_screen_integer_scale", false) && i2 != cm1.OFF) {
            z = true;
        } else {
            z = false;
        }
        cm1 cm1Var = cm1.OFF;
        if (i2 != cm1Var && (z || z6)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((b56) n()).b.getBoolean("dual_screen_internal_fill_height", false) && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((b56) n()).b.getBoolean("dual_screen_internal_fill_width", false) && z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (((b56) n()).b.getBoolean("dual_screen_external_fill_height", false) && z2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (((b56) n()).b.getBoolean("dual_screen_external_fill_width", false) && z2) {
            z7 = true;
        }
        int i3 = WhenMappings.d[i2.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i = R.string.dual_screen_preset_internal_bottom_external_top;
                } else {
                    defpackage.i.c();
                    return;
                }
            } else {
                i = R.string.dual_screen_preset_internal_top_external_bottom;
            }
        } else {
            i = R.string.dual_screen_preset_off;
        }
        Preference preference = this.m0;
        if (preference != null) {
            String string7 = getString(i);
            if (i2 != cm1Var && z6) {
                string = getString(R.string.on);
            } else {
                string = getString(R.string.off);
            }
            if (i2 != cm1Var && z) {
                string2 = getString(R.string.on);
            } else {
                string2 = getString(R.string.off);
            }
            String str = string2;
            if (z3) {
                string3 = getString(R.string.on);
            } else {
                string3 = getString(R.string.off);
            }
            String str2 = string3;
            if (z4) {
                string4 = getString(R.string.on);
            } else {
                string4 = getString(R.string.off);
            }
            String str3 = string4;
            if (z5) {
                string5 = getString(R.string.on);
            } else {
                string5 = getString(R.string.off);
            }
            String str4 = string5;
            if (z7) {
                string6 = getString(R.string.on);
            } else {
                string6 = getString(R.string.off);
            }
            preference.setSummary(getString(R.string.dual_screen_presets_summary, string7, string, str, str2, str3, str4, string6));
            return;
        }
        b53.g0("dualScreenPresetsPreference");
        throw null;
    }

    public final void C(VideoRenderer videoRenderer, ListPreference listPreference, StoragePickerPreference storagePickerPreference, ListPreference listPreference2, EditTextPreference editTextPreference, SwitchPreference switchPreference, String[] strArr, String[] strArr2) {
        boolean isSupportedByOpenGlSurface;
        boolean isSupportedByOpenGlSurface2;
        ArrayList J0 = nu.J0(strArr, strArr2);
        ArrayList arrayList = new ArrayList();
        int size = J0.size();
        int i = 0;
        while (i < size) {
            Object obj = J0.get(i);
            i++;
            VideoFiltering I = I((String) ((ti4) obj).A);
            if (WhenMappings.b[videoRenderer.ordinal()] == 4) {
                isSupportedByOpenGlSurface2 = I.isSupportedByVulkan();
            } else {
                isSupportedByOpenGlSurface2 = I.isSupportedByOpenGlSurface();
            }
            if (isSupportedByOpenGlSurface2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add((String) ((ti4) obj2).A);
        }
        listPreference.c0 = (CharSequence[]) arrayList2.toArray(new String[0]);
        ArrayList arrayList3 = new ArrayList(uq0.y0(arrayList, 10));
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            arrayList3.add((String) ((ti4) obj3).B);
        }
        listPreference.g((CharSequence[]) arrayList3.toArray(new String[0]));
        VideoFiltering I2 = I(listPreference.d0);
        if (WhenMappings.b[videoRenderer.ordinal()] == 4) {
            isSupportedByOpenGlSurface = I2.isSupportedByVulkan();
        } else {
            isSupportedByOpenGlSurface = I2.isSupportedByOpenGlSurface();
        }
        if (!isSupportedByOpenGlSurface) {
            String lowerCase = "NONE".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            listPreference.h(lowerCase);
        }
        String str = listPreference.d0;
        str.getClass();
        F(str, storagePickerPreference, listPreference2, editTextPreference, switchPreference);
    }

    public final void E() {
        if (this.o0 == null) {
            return;
        }
        df5 h = o().h();
        if (h != null && o().d() != null) {
            String format = DateFormat.getDateFormat(requireContext()).format(new Date(h.d));
            String formatShortFileSize = Formatter.formatShortFileSize(requireContext(), o().f());
            Preference preference = this.o0;
            if (preference != null) {
                preference.setTitle(R.string.video_retroarch_shader_installed_title);
                Preference preference2 = this.o0;
                if (preference2 != null) {
                    preference2.setSummary(getString(R.string.video_retroarch_shader_installed_summary, format, formatShortFileSize));
                    return;
                } else {
                    b53.g0("shaderManagePreference");
                    throw null;
                }
            }
            b53.g0("shaderManagePreference");
            throw null;
        }
        Preference preference3 = this.o0;
        if (preference3 != null) {
            preference3.setTitle(R.string.video_retroarch_shader_install_title);
            Preference preference4 = this.o0;
            if (preference4 != null) {
                preference4.setSummary(R.string.video_retroarch_shader_install_summary);
                return;
            } else {
                b53.g0("shaderManagePreference");
                throw null;
            }
        }
        b53.g0("shaderManagePreference");
        throw null;
    }

    public final void F(String str, StoragePickerPreference storagePickerPreference, ListPreference listPreference, EditTextPreference editTextPreference, SwitchPreference switchPreference) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        String string;
        boolean z9 = false;
        if (I(str) == VideoFiltering.RETROARCH) {
            z = true;
        } else {
            z = false;
        }
        RetroArchShaderSource r = r();
        if (r == RetroArchShaderSource.FOLDER) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (r == RetroArchShaderSource.INTERNAL) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 && (!z3 || o().d() == null)) {
            z4 = false;
        } else {
            z4 = true;
        }
        Preference preference = this.n0;
        if (preference != null) {
            preference.setVisible(z);
            Preference preference2 = this.n0;
            if (preference2 != null) {
                if (r == null) {
                    i = -1;
                } else {
                    i = WhenMappings.a[r.ordinal()];
                }
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            string = getString(R.string.video_retroarch_shader_source_folder);
                        } else {
                            defpackage.i.c();
                            return;
                        }
                    } else {
                        string = getString(R.string.video_retroarch_shader_source_internal);
                    }
                } else {
                    string = getString(R.string.not_set);
                }
                preference2.setSummary(string);
            } else {
                b53.g0("shaderSourcePreference");
                throw null;
            }
        }
        Preference preference3 = this.o0;
        if (preference3 != null) {
            if (z && z3) {
                z8 = true;
            } else {
                z8 = false;
            }
            preference3.setVisible(z8);
            E();
        }
        Preference preference4 = this.p0;
        if (preference4 != null) {
            preference4.setVisible(z);
        }
        if (z && z2) {
            z5 = true;
        } else {
            z5 = false;
        }
        storagePickerPreference.setVisible(z5);
        if (z && z4) {
            z6 = true;
        } else {
            z6 = false;
        }
        listPreference.setVisible(z6);
        if (editTextPreference != null) {
            if (z && z4) {
                z7 = true;
            } else {
                z7 = false;
            }
            editTextPreference.setVisible(z7);
        }
        if (switchPreference != null) {
            if (z && z4) {
                z9 = true;
            }
            switchPreference.setVisible(z9);
        }
        Preference preference5 = this.s0;
        if (preference5 != null) {
            preference5.setVisible(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(me.magnum.melonds.domain.model.VideoRenderer r3, androidx.preference.PreferenceCategory r4, androidx.preference.ListPreference r5, androidx.preference.Preference r6, boolean r7) {
        /*
            r2 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            r1 = 0
            if (r3 != r0) goto L1d
            q03 r3 = r2.u0
            if (r3 == 0) goto L17
            java.lang.Object r3 = r3.B
            android.content.Context r3 = (android.content.Context) r3
            boolean r3 = defpackage.mh7.S(r3)
            if (r3 == 0) goto L1d
            if (r7 != 0) goto L1d
            r3 = 1
            goto L1e
        L17:
            java.lang.String r2 = "adrenoVulkanDriverManager"
            defpackage.b53.g0(r2)
            throw r1
        L1d:
            r3 = 0
        L1e:
            r4.setVisible(r3)
            if (r3 != 0) goto L24
            return
        L24:
            r4.setSummary(r1)
            r2.H(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.G(me.magnum.melonds.domain.model.VideoRenderer, androidx.preference.PreferenceCategory, androidx.preference.ListPreference, androidx.preference.Preference, boolean):void");
    }

    public final void H(ListPreference listPreference, Preference preference) {
        boolean z;
        String string;
        List<xc7> n = ((b56) n()).n();
        b56 b56Var = (b56) n();
        String str = null;
        String string2 = b56Var.b.getString("video_vulkan_selected_driver_id", null);
        if (string2 == null) {
            xc7 xc7Var = (xc7) tq0.M0(b56Var.n());
            if (xc7Var != null) {
                str = xc7Var.a;
            }
        } else {
            str = string2;
        }
        if (((b56) n()).y() == yc7.CUSTOM && str != null && !n.isEmpty()) {
            for (xc7 xc7Var2 : n) {
                if (xc7Var2.a.equals(str)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        String str2 = "system";
        String[] strArr = {"system"};
        ArrayList arrayList = new ArrayList(uq0.y0(n, 10));
        for (xc7 xc7Var3 : n) {
            arrayList.add(xc7Var3.a);
        }
        listPreference.c0 = (CharSequence[]) nu.z0(strArr, arrayList.toArray(new String[0]));
        String[] strArr2 = {getString(R.string.video_vulkan_driver_mode_system)};
        ArrayList arrayList2 = new ArrayList(uq0.y0(n, 10));
        for (xc7 xc7Var4 : n) {
            arrayList2.add(xc7Var4.b);
        }
        listPreference.g((CharSequence[]) nu.z0(strArr2, arrayList2.toArray(new String[0])));
        if (z) {
            str2 = str;
        }
        listPreference.h(str2);
        if (z) {
            for (xc7 xc7Var5 : n) {
                if (xc7Var5.a.equals(str)) {
                    string = getString(R.string.video_vulkan_driver_active_custom, xc7Var5.b);
                }
            }
            vd6.e("Collection contains no element matching the predicate.");
            return;
        }
        string = getString(R.string.video_vulkan_driver_active_system);
        listPreference.setSummary(string);
        preference.setVisible(!n.isEmpty());
    }

    @Override // defpackage.os4
    public final String getTitle() {
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString(is4.ARG_PREFERENCE_ROOT);
        } else {
            str = null;
        }
        if (b53.x(str, "video_retroarch_shader_settings")) {
            String string = getString(R.string.video_retroarch_shader_settings_title);
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.category_video);
        string2.getClass();
        return string2;
    }

    public final String m(gv5 gv5Var) {
        int i = WhenMappings.e[gv5Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    String string = getString(R.string.dual_screen_vertical_alignment_option_bottom);
                    string.getClass();
                    return string;
                }
                defpackage.i.c();
                return null;
            }
            String string2 = getString(R.string.dual_screen_vertical_alignment_option_center);
            string2.getClass();
            return string2;
        }
        String string3 = getString(R.string.dual_screen_vertical_alignment_option_top);
        string3.getClass();
        return string3;
    }

    public final w16 n() {
        w16 w16Var = this.e0;
        if (w16Var != null) {
            return w16Var;
        }
        b53.g0("settingsRepository");
        throw null;
    }

    public final gf5 o() {
        gf5 gf5Var = this.f0;
        if (gf5Var != null) {
            return gf5Var;
        }
        b53.g0("shaderLibraryManager");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0332 A[EDGE_INSN: B:102:0x0332->B:69:0x0332 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0344 A[LOOP:2: B:70:0x0342->B:71:0x0344, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0377 A[LOOP:3: B:73:0x0375->B:74:0x0377, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04f8  */
    @Override // defpackage.is4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreatePreferences(android.os.Bundle r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 1279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.onCreatePreferences(android.os.Bundle, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Type inference failed for: r0v19, types: [me.magnum.melonds.ui.settings.fragments.d] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, n75] */
    @Override // defpackage.is4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDisplayPreferenceDialog(androidx.preference.Preference r15) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.onDisplayPreferenceDialog(androidx.preference.Preference):void");
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        B();
        ListPreference listPreference = this.r0;
        if (listPreference != null) {
            D(this, listPreference, null, false, 2);
            q();
        }
    }

    public final void p(String str, ListPreference listPreference, StoragePickerPreference storagePickerPreference, ListPreference listPreference2, EditTextPreference editTextPreference, SwitchPreference switchPreference, String[] strArr, String[] strArr2) {
        boolean z;
        boolean z2;
        VideoRenderer videoRenderer = (VideoRenderer) se.t(str, VideoRenderer.values());
        int i = WhenMappings.b[videoRenderer.ordinal()];
        ArrayList arrayList = this.j0;
        ArrayList arrayList2 = this.k0;
        ArrayList arrayList3 = this.l0;
        ArrayList arrayList4 = this.i0;
        ArrayList arrayList5 = this.h0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        int size = arrayList5.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList5.get(i2);
                            i2++;
                            ((Preference) obj).setVisible(false);
                        }
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList4.get(i3);
                            i3++;
                            ((Preference) obj2).setVisible(true);
                        }
                        int size3 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Object obj3 = arrayList3.get(i4);
                            i4++;
                            ((Preference) obj3).setVisible(false);
                        }
                        int size4 = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size4) {
                            Object obj4 = arrayList2.get(i5);
                            i5++;
                            ((Preference) obj4).setVisible(true);
                        }
                        int size5 = arrayList.size();
                        int i6 = 0;
                        while (i6 < size5) {
                            Object obj5 = arrayList.get(i6);
                            i6++;
                            ((Preference) obj5).setVisible(true);
                        }
                    } else {
                        defpackage.i.c();
                        return;
                    }
                } else {
                    int size6 = arrayList5.size();
                    int i7 = 0;
                    while (i7 < size6) {
                        Object obj6 = arrayList5.get(i7);
                        i7++;
                        ((Preference) obj6).setVisible(false);
                    }
                    int size7 = arrayList4.size();
                    int i8 = 0;
                    while (i8 < size7) {
                        Object obj7 = arrayList4.get(i8);
                        i8++;
                        ((Preference) obj7).setVisible(true);
                    }
                    int size8 = arrayList3.size();
                    int i9 = 0;
                    while (i9 < size8) {
                        Object obj8 = arrayList3.get(i9);
                        i9++;
                        ((Preference) obj8).setVisible(false);
                    }
                    int size9 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size9) {
                        Object obj9 = arrayList2.get(i10);
                        i10++;
                        ((Preference) obj9).setVisible(false);
                    }
                    int size10 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size10) {
                        Object obj10 = arrayList.get(i11);
                        i11++;
                        ((Preference) obj10).setVisible(false);
                    }
                }
            } else {
                int size11 = arrayList5.size();
                int i12 = 0;
                while (i12 < size11) {
                    Object obj11 = arrayList5.get(i12);
                    i12++;
                    ((Preference) obj11).setVisible(false);
                }
                int size12 = arrayList4.size();
                int i13 = 0;
                while (i13 < size12) {
                    Object obj12 = arrayList4.get(i13);
                    i13++;
                    ((Preference) obj12).setVisible(true);
                }
                int size13 = arrayList3.size();
                int i14 = 0;
                while (i14 < size13) {
                    Object obj13 = arrayList3.get(i14);
                    i14++;
                    ((Preference) obj13).setVisible(true);
                }
                int size14 = arrayList2.size();
                int i15 = 0;
                while (i15 < size14) {
                    Object obj14 = arrayList2.get(i15);
                    i15++;
                    ((Preference) obj14).setVisible(true);
                }
                int size15 = arrayList.size();
                int i16 = 0;
                while (i16 < size15) {
                    Object obj15 = arrayList.get(i16);
                    i16++;
                    ((Preference) obj15).setVisible(false);
                }
            }
        } else {
            int size16 = arrayList5.size();
            int i17 = 0;
            while (i17 < size16) {
                Object obj16 = arrayList5.get(i17);
                i17++;
                ((Preference) obj16).setVisible(true);
            }
            int size17 = arrayList4.size();
            int i18 = 0;
            while (i18 < size17) {
                Object obj17 = arrayList4.get(i18);
                i18++;
                ((Preference) obj17).setVisible(false);
            }
            int size18 = arrayList3.size();
            int i19 = 0;
            while (i19 < size18) {
                Object obj18 = arrayList3.get(i19);
                i19++;
                ((Preference) obj18).setVisible(false);
            }
            int size19 = arrayList2.size();
            int i20 = 0;
            while (i20 < size19) {
                Object obj19 = arrayList2.get(i20);
                i20++;
                ((Preference) obj19).setVisible(true);
            }
            int size20 = arrayList.size();
            int i21 = 0;
            while (i21 < size20) {
                Object obj20 = arrayList.get(i21);
                i21++;
                ((Preference) obj20).setVisible(false);
            }
        }
        SwitchPreference switchPreference2 = (SwitchPreference) findPreference("video_renderer_debug_tools_enabled");
        if (switchPreference2 != null && switchPreference2.isVisible() && switchPreference2.A) {
            z = true;
        } else {
            z = false;
        }
        for (String str2 : l07.c0("video_renderer_debug_bgobj_enabled", "video_renderer_debug_latch_trace_enabled")) {
            Preference findPreference = findPreference(str2);
            if (findPreference != null) {
                findPreference.setVisible(z);
            }
        }
        SwitchPreference switchPreference3 = (SwitchPreference) findPreference("video_conservative_coverage_enabled");
        if (switchPreference3 != null && switchPreference3.isVisible() && switchPreference3.A) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (String str3 : l07.c0("video_conservative_coverage_px", "video_conservative_coverage_apply_repeat", "video_conservative_coverage_apply_clamp", "video_conservative_coverage_depth_bias")) {
            Preference findPreference2 = findPreference(str3);
            if (findPreference2 != null) {
                findPreference2.setVisible(z2);
            }
        }
        C(videoRenderer, listPreference, storagePickerPreference, listPreference2, editTextPreference, switchPreference, strArr, strArr2);
    }

    public final void q() {
        String str;
        String string;
        String string2;
        boolean z;
        if (this.r0 == null) {
            RetroArchShaderSource r = r();
            Preference preference = this.o0;
            boolean z2 = false;
            if (preference != null) {
                if (r == RetroArchShaderSource.INTERNAL) {
                    z = true;
                } else {
                    z = false;
                }
                preference.setVisible(z);
                E();
            }
            StoragePickerPreference storagePickerPreference = this.q0;
            if (storagePickerPreference != null) {
                if (r == RetroArchShaderSource.FOLDER) {
                    z2 = true;
                }
                storagePickerPreference.setVisible(z2);
                return;
            }
            return;
        }
        SharedPreferences d = getPreferenceManager().d();
        String str2 = "software";
        if (d != null && (string2 = d.getString("video_renderer", "software")) != null) {
            str2 = string2;
        }
        VideoRenderer videoRenderer = (VideoRenderer) se.t(str2, VideoRenderer.values());
        if (d == null || (string = d.getString("video_filtering", "none")) == null) {
            str = "none";
        } else {
            str = string;
        }
        StoragePickerPreference storagePickerPreference2 = this.q0;
        if (storagePickerPreference2 != null) {
            ListPreference listPreference = this.r0;
            if (listPreference != null) {
                F(str, storagePickerPreference2, listPreference, (EditTextPreference) findPreference("video_retroarch_shader_parameters"), (SwitchPreference) findPreference("video_retroarch_shader_clear_history"));
                return;
            } else {
                b53.g0("shaderPresetPreference");
                throw null;
            }
        }
        b53.g0("shaderRootPreference");
        throw null;
    }

    public final RetroArchShaderSource r() {
        String str;
        Set<String> set;
        boolean z;
        Object obj;
        SharedPreferences d = getPreferenceManager().d();
        if (d != null) {
            str = d.getString("video_retroarch_shader_source", null);
        } else {
            str = null;
        }
        if (d != null) {
            set = d.getStringSet("video_retroarch_shader_root", null);
        } else {
            set = null;
        }
        Set<String> set2 = set;
        boolean z2 = false;
        if (set2 != null && !set2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (o().d() != null) {
            z2 = true;
        }
        RetroArchShaderSource.Companion.getClass();
        Iterator<E> it = RetroArchShaderSource.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (gh6.g0(((RetroArchShaderSource) obj).getPreferenceValue(), str, true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        RetroArchShaderSource retroArchShaderSource = (RetroArchShaderSource) obj;
        if (retroArchShaderSource != null) {
            return retroArchShaderSource;
        }
        if (!z) {
            return RetroArchShaderSource.FOLDER;
        }
        if (!z2) {
            return null;
        }
        return RetroArchShaderSource.INTERNAL;
    }

    public final void x() {
        tb tbVar = this.x0;
        if (tbVar != null && tbVar.isShowing()) {
            return;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        float f = getResources().getDisplayMetrics().density;
        TextView textView = new TextView(requireContext);
        ProgressBar progressBar = new ProgressBar(requireContext, null, 16842872);
        progressBar.setMax(100);
        progressBar.setIndeterminate(true);
        TextView textView2 = new TextView(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setOrientation(1);
        int i = (int) (24.0f * f);
        linearLayout.setPadding(i, (int) (16.0f * f), i, 0);
        linearLayout.addView(textView);
        linearLayout.addView(progressBar);
        linearLayout.addView(textView2);
        this.z0 = textView;
        this.y0 = progressBar;
        this.A0 = textView2;
        sb sbVar = new sb(requireContext);
        sbVar.A(R.string.video_retroarch_shader_install_notification_title);
        sbVar.B(linearLayout);
        ((pb) sbVar.L).m = false;
        sbVar.z(R.string.move_to_background, new hm0(8));
        sbVar.x(17039360, new iw(3, requireContext));
        tb l = sbVar.l();
        l.show();
        this.x0 = l;
    }

    public final void y() {
        Context requireContext = requireContext();
        requireContext.getClass();
        SimpleAdapter simpleAdapter = new SimpleAdapter(requireContext, l07.c0(zt3.l0(new ti4("title", getString(R.string.video_retroarch_shader_source_internal)), new ti4("description", getString(R.string.video_retroarch_shader_source_internal_description))), zt3.l0(new ti4("title", getString(R.string.video_retroarch_shader_source_folder)), new ti4("description", getString(R.string.video_retroarch_shader_source_folder_description)))), 17367044, new String[]{"title", "description"}, new int[]{16908308, 16908309});
        ListView listView = new ListView(requireContext);
        listView.setAdapter((ListAdapter) simpleAdapter);
        listView.setDivider(null);
        sb sbVar = new sb(requireContext);
        sbVar.A(R.string.video_retroarch_shader_source_title);
        sbVar.B(listView);
        sbVar.x(17039360, null);
        final tb l = sbVar.l();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: r87
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                SharedPreferences.Editor edit;
                SharedPreferences.Editor putString;
                SharedPreferences.Editor edit2;
                SharedPreferences.Editor putString2;
                tb.this.dismiss();
                VideoPreferencesFragment videoPreferencesFragment = this;
                if (i != 0) {
                    if (i != 1) {
                        return;
                    }
                    RetroArchShaderSource retroArchShaderSource = RetroArchShaderSource.FOLDER;
                    SharedPreferences d = videoPreferencesFragment.getPreferenceManager().d();
                    if (d != null && (edit2 = d.edit()) != null && (putString2 = edit2.putString("video_retroarch_shader_source", retroArchShaderSource.getPreferenceValue())) != null) {
                        putString2.apply();
                    }
                    videoPreferencesFragment.q();
                    StoragePickerPreference storagePickerPreference = videoPreferencesFragment.q0;
                    if (storagePickerPreference != null) {
                        storagePickerPreference.performClick();
                        return;
                    } else {
                        b53.g0("shaderRootPreference");
                        throw null;
                    }
                }
                RetroArchShaderSource retroArchShaderSource2 = RetroArchShaderSource.INTERNAL;
                SharedPreferences d2 = videoPreferencesFragment.getPreferenceManager().d();
                if (d2 != null && (edit = d2.edit()) != null && (putString = edit.putString("video_retroarch_shader_source", retroArchShaderSource2.getPreferenceValue())) != null) {
                    putString.apply();
                }
                videoPreferencesFragment.q();
                if (videoPreferencesFragment.o().d() != null) {
                    return;
                }
                videoPreferencesFragment.A();
            }
        });
        l.show();
    }
}
