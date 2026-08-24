package me.magnum.melonds.ui.settings.fragments;

import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.Formatter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.SwitchCompat;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import me.magnum.melonds.MelonDSAndroidInterface;
import me.magnum.melonds.common.workers.RetroArchShaderInstallWorker;
import me.magnum.melonds.domain.model.RetroArchShaderSource;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.k;
import me.magnum.melonds.ui.settings.preferences.InGameLockedListPreference;
import me.magnum.melonds.ui.settings.preferences.InGameLockedSwitchPreference;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melonds.ui.settings.vulkandriver.VulkanDriverManagerActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class VideoPreferencesFragment extends Hilt_VideoPreferencesFragment implements q15 {
    public TextView A0;
    public TextView B0;
    public final d9 C0;
    public boolean D0;
    public wh7 d0;
    public yj1 e0;
    public kd6 f0;
    public cp5 g0;
    public ae6 h0;
    public Preference n0;
    public Preference o0;
    public Preference p0;
    public Preference q0;
    public StoragePickerPreference r0;
    public ListPreference s0;
    public Preference t0;
    public u63 v0;
    public ap6 w0;
    public ap6 x0;
    public ac y0;
    public ProgressBar z0;
    public final ex6 Z = new ex6(new t46(this, 21));
    public final ArrayList i0 = new ArrayList();
    public final ArrayList j0 = new ArrayList();
    public final ArrayList k0 = new ArrayList();
    public final ArrayList l0 = new ArrayList();
    public final ArrayList m0 = new ArrayList();
    public final LinkedHashMap u0 = new LinkedHashMap();

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public final class ShaderBrowserAdapter extends wf5 {
        public final t46 d;
        public final d e;
        public final ArrayList f = new ArrayList();

        /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
        /* loaded from: classes.dex */
        public final class ViewHolder extends wg5 {
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

        public ShaderBrowserAdapter(t46 t46Var, d dVar) {
            this.d = t46Var;
            this.e = dVar;
        }

        @Override // defpackage.wf5
        public final int a() {
            return this.f.size();
        }

        @Override // defpackage.wf5
        public final void e(wg5 wg5Var, int i) {
            String str;
            int i2;
            int i3;
            File file;
            ViewHolder viewHolder = (ViewHolder) wg5Var;
            ShaderBrowserItem shaderBrowserItem = (ShaderBrowserItem) this.f.get(i);
            ShaderBrowserAdapter shaderBrowserAdapter = ShaderBrowserAdapter.this;
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
            if (!z && nb3.k(shaderBrowserItem.b, ((ListPreference) shaderBrowserAdapter.d.B).e0)) {
                z3 = true;
            }
            view.setSelected(z3);
            view.setOnClickListener(new h(1, shaderBrowserAdapter, shaderBrowserItem));
            viewHolder.w.setVisibility(8);
            viewHolder.x.setVisibility(8);
            if (!z) {
                String str2 = shaderBrowserItem.b;
                VideoPreferencesFragment videoPreferencesFragment = VideoPreferencesFragment.this;
                l lVar = new l(str2, shaderBrowserAdapter, viewHolder);
                File d = videoPreferencesFragment.p().d();
                if (d != null) {
                    if (videoPreferencesFragment.t() == RetroArchShaderSource.INTERNAL) {
                        file = d;
                    } else {
                        file = null;
                    }
                    if (file != null) {
                        ep5 ep5Var = (ep5) videoPreferencesFragment.u0.get(str2);
                        if (ep5Var != null) {
                            lVar.g(ep5Var);
                        } else {
                            hv.L(bl2.C(videoPreferencesFragment), null, null, new VideoPreferencesFragment$weighPresetAsync$2(videoPreferencesFragment, str2, lVar, file, null), 3);
                        }
                    }
                }
            }
        }

        @Override // defpackage.wf5
        public final wg5 f(ViewGroup viewGroup, int i) {
            View inflate = VideoPreferencesFragment.this.getLayoutInflater().inflate(R.layout.item_shader_browser_entry, viewGroup, false);
            inflate.getClass();
            return new ViewHolder(inflate);
        }

        public final void h(List list) {
            list.getClass();
            ArrayList arrayList = this.f;
            arrayList.clear();
            gt0.A0(arrayList, list);
            this.a.b();
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
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

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
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
                    if (!nb3.k(this.a, shaderBrowserItem.a) || !nb3.k(this.b, shaderBrowserItem.b) || this.c != shaderBrowserItem.c || this.d != shaderBrowserItem.d) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + xg6.e(xg6.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        }

        public final String toString() {
            StringBuilder u = i61.u("ShaderBrowserItem(label=", this.a, ", path=", this.b, ", isDirectory=");
            u.append(this.c);
            u.append(", isParent=");
            u.append(this.d);
            u.append(")");
            return u.toString();
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface ShaderDirectoryLister {
        List a(String str);
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
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
            int[] iArr3 = new int[xo5.values().length];
            try {
                iArr3[xo5.NotEnoughSpace.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[xo5.Truncated.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[xo5.CorruptArchive.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            c = iArr3;
            int[] iArr4 = new int[jq1.values().length];
            try {
                iArr4[jq1.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[jq1.INTERNAL_TOP_EXTERNAL_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[jq1.INTERNAL_BOTTOM_EXTERNAL_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            d = iArr4;
            int[] iArr5 = new int[p66.values().length];
            try {
                iArr5[p66.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[p66.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[p66.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            e = iArr5;
        }
    }

    public VideoPreferencesFragment() {
        d9 registerForActivityResult = registerForActivityResult(new c9(1), new b(this, 2));
        registerForActivityResult.getClass();
        this.C0 = registerForActivityResult;
    }

    public static final void C(Collection collection, boolean z) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((RadioButton) it.next()).setEnabled(z);
        }
    }

    public static void G(VideoPreferencesFragment videoPreferencesFragment, ListPreference listPreference, Uri uri, boolean z, int i) {
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
        ap6 ap6Var = videoPreferencesFragment.w0;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        if (z) {
            listPreference.h(null);
        }
        String str = listPreference.e0;
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
        listPreference.d0 = strArr2;
        if (str == null) {
            str = videoPreferencesFragment.getString(R.string.video_retroarch_shader_preset_summary);
            str.getClass();
        }
        listPreference.setSummary(str);
    }

    public static VideoFiltering L(String str) {
        Object em5Var;
        if (str == null) {
            str = "";
        }
        try {
            em5Var = (VideoFiltering) jw2.o(str, VideoFiltering.values());
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        Object obj = VideoFiltering.NONE;
        if (em5Var instanceof em5) {
            em5Var = obj;
        }
        return (VideoFiltering) em5Var;
    }

    public static final void k(VideoPreferencesFragment videoPreferencesFragment) {
        videoPreferencesFragment.D0 = false;
        ac acVar = videoPreferencesFragment.y0;
        if (acVar != null) {
            acVar.dismiss();
        }
        videoPreferencesFragment.y0 = null;
        videoPreferencesFragment.z0 = null;
        videoPreferencesFragment.A0 = null;
        videoPreferencesFragment.B0 = null;
    }

    public static final void l(VideoPreferencesFragment videoPreferencesFragment, xo5 xo5Var, long j) {
        String string;
        int i = WhenMappings.c[xo5Var.ordinal()];
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
        zb zbVar = new zb(videoPreferencesFragment.requireContext());
        ((wb) zbVar.L).f = string;
        zbVar.y(R.string.video_retroarch_shader_retry, new rm7(videoPreferencesFragment, 0));
        zbVar.x(17039360, null);
        zbVar.B();
    }

    public static final void u(dh5 dh5Var, TextView textView, SwitchCompat switchCompat, SwitchCompat switchCompat2, zg5 zg5Var, zg5 zg5Var2, Button button, Button button2) {
        boolean z;
        int i;
        boolean z2 = true;
        if (dh5Var.A != jq1.OFF) {
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
        if (!z || (!zg5Var.A && !zg5Var2.A)) {
            z2 = false;
        }
        button.setEnabled(z2);
        button2.setEnabled(z2);
    }

    public static final void v(dh5 dh5Var, dh5 dh5Var2, dh5 dh5Var3, TextView textView, VideoPreferencesFragment videoPreferencesFragment) {
        String m;
        String m2;
        jq1 jq1Var = (jq1) dh5Var.A;
        p66 p66Var = (p66) dh5Var2.A;
        p66 p66Var2 = (p66) dh5Var3.A;
        p66 r = lb4.r(jq1Var);
        p66 q = lb4.q(jq1Var);
        if (p66Var == null) {
            m = videoPreferencesFragment.getString(R.string.dual_screen_vertical_alignment_preset_value, videoPreferencesFragment.m(r));
            m.getClass();
        } else {
            m = videoPreferencesFragment.m(p66Var);
        }
        if (p66Var2 == null) {
            m2 = videoPreferencesFragment.getString(R.string.dual_screen_vertical_alignment_preset_value, videoPreferencesFragment.m(q));
            m2.getClass();
        } else {
            m2 = videoPreferencesFragment.m(p66Var2);
        }
        String string = videoPreferencesFragment.getString(R.string.dual_screen_vertical_alignment_summary, m, m2);
        string.getClass();
        textView.setText(string);
        textView.setVisibility(0);
    }

    public static final void w(boolean z, SwitchCompat switchCompat, SwitchCompat switchCompat2, boolean z2, boolean z3) {
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

    public static final void x(boolean z, SwitchCompat switchCompat, SwitchCompat switchCompat2, boolean z2, boolean z3) {
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

    public static final void z(dh5 dh5Var, VideoPreferencesFragment videoPreferencesFragment, ShaderDirectoryLister shaderDirectoryLister, LinkedHashMap linkedHashMap, TextView textView, TextView textView2, dh5 dh5Var2, String str) {
        dh5Var.A = str;
        textView.getClass();
        textView2.getClass();
        Object obj = dh5Var2.A;
        if (obj != null) {
            ShaderBrowserAdapter shaderBrowserAdapter = (ShaderBrowserAdapter) obj;
            ap6 ap6Var = videoPreferencesFragment.w0;
            if (ap6Var != null) {
                ap6Var.h(null);
            }
            String str2 = "/";
            if (!qs6.v0(str)) {
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
            shaderBrowserAdapter.h(yt1.A);
            textView2.setText(R.string.info_loading);
            textView2.setVisibility(0);
            videoPreferencesFragment.w0 = hv.L(bl2.C(videoPreferencesFragment), null, null, new VideoPreferencesFragment$loadShaderBrowserDirectory$2(linkedHashMap, str, shaderBrowserAdapter, textView2, shaderDirectoryLister, null), 3);
            return;
        }
        nb3.a0("adapter");
        throw null;
    }

    public final void A() {
        if (!this.D0) {
            ac acVar = this.y0;
            if (acVar == null || !acVar.isShowing()) {
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
                this.A0 = textView;
                this.z0 = progressBar;
                this.B0 = textView2;
                zb zbVar = new zb(requireContext);
                zbVar.z(R.string.video_retroarch_shader_install_notification_title);
                zbVar.A(linearLayout);
                ((wb) zbVar.L).m = false;
                zbVar.y(R.string.move_to_background, new rm7(this, 1));
                zbVar.x(17039360, new ax(requireContext, 3));
                ac l = zbVar.l();
                l.show();
                this.y0 = l;
            }
        }
    }

    public final void B() {
        Context requireContext = requireContext();
        requireContext.getClass();
        View inflate = LayoutInflater.from(requireContext).inflate(R.layout.dialog_shader_source, (ViewGroup) null);
        zb zbVar = new zb(requireContext);
        zbVar.z(R.string.video_retroarch_shader_source_title);
        zbVar.A(inflate);
        zbVar.x(17039360, null);
        final ac l = zbVar.l();
        View findViewById = inflate.findViewById(R.id.btn_source_scan);
        if (findViewById != null) {
            findViewById.setOnClickListener(new h(0, l, this));
        }
        View findViewById2 = inflate.findViewById(R.id.btn_source_internal);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: tm7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = r3;
                    VideoPreferencesFragment videoPreferencesFragment = this;
                    ac acVar = l;
                    switch (i) {
                        case 0:
                            acVar.dismiss();
                            videoPreferencesFragment.r(RetroArchShaderSource.INTERNAL);
                            videoPreferencesFragment.s();
                            if (videoPreferencesFragment.p().d() == null) {
                                videoPreferencesFragment.D();
                                return;
                            }
                            return;
                        default:
                            acVar.dismiss();
                            videoPreferencesFragment.r(RetroArchShaderSource.FOLDER);
                            videoPreferencesFragment.s();
                            StoragePickerPreference storagePickerPreference = videoPreferencesFragment.r0;
                            if (storagePickerPreference != null) {
                                storagePickerPreference.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        }
        View findViewById3 = inflate.findViewById(R.id.btn_source_folder);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: tm7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = r3;
                    VideoPreferencesFragment videoPreferencesFragment = this;
                    ac acVar = l;
                    switch (i) {
                        case 0:
                            acVar.dismiss();
                            videoPreferencesFragment.r(RetroArchShaderSource.INTERNAL);
                            videoPreferencesFragment.s();
                            if (videoPreferencesFragment.p().d() == null) {
                                videoPreferencesFragment.D();
                                return;
                            }
                            return;
                        default:
                            acVar.dismiss();
                            videoPreferencesFragment.r(RetroArchShaderSource.FOLDER);
                            videoPreferencesFragment.s();
                            StoragePickerPreference storagePickerPreference = videoPreferencesFragment.r0;
                            if (storagePickerPreference != null) {
                                storagePickerPreference.performClick();
                                return;
                            }
                            return;
                    }
                }
            });
        }
        l.show();
    }

    public final void D() {
        this.D0 = false;
        bk1 bk1Var = new bk1(RetroArchShaderInstallWorker.class);
        kf4 kf4Var = kf4.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kf4 kf4Var2 = kf4.CONNECTED;
        kf4Var2.getClass();
        ((yw7) bk1Var.B).j = new p21(new af4(null), kf4Var2, false, false, false, false, -1L, -1L, gt0.p1(linkedHashSet));
        gm4 c = bk1Var.c();
        Context requireContext = requireContext();
        requireContext.getClass();
        lw7 b = lw7.b(requireContext);
        b.getClass();
        b.a("retroarch-shader-install", y72.KEEP, c);
        A();
    }

    public final void E() {
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
        if (this.n0 == null) {
            return;
        }
        jq1 i2 = ((ng6) o()).i();
        boolean z6 = ((ng6) o()).b.getBoolean("external_display_keep_ratio", true);
        boolean z7 = false;
        if (((ng6) o()).b.getBoolean("dual_screen_integer_scale", false) && i2 != jq1.OFF) {
            z = true;
        } else {
            z = false;
        }
        jq1 jq1Var = jq1.OFF;
        if (i2 != jq1Var && (z || z6)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((ng6) o()).b.getBoolean("dual_screen_internal_fill_height", false) && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((ng6) o()).b.getBoolean("dual_screen_internal_fill_width", false) && z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (((ng6) o()).b.getBoolean("dual_screen_external_fill_height", false) && z2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (((ng6) o()).b.getBoolean("dual_screen_external_fill_width", false) && z2) {
            z7 = true;
        }
        int i3 = WhenMappings.d[i2.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i = R.string.dual_screen_preset_internal_bottom_external_top;
                } else {
                    defpackage.i.d();
                    return;
                }
            } else {
                i = R.string.dual_screen_preset_internal_top_external_bottom;
            }
        } else {
            i = R.string.dual_screen_preset_off;
        }
        Preference preference = this.n0;
        if (preference != null) {
            String string7 = getString(i);
            if (i2 != jq1Var && z6) {
                string = getString(R.string.on);
            } else {
                string = getString(R.string.off);
            }
            if (i2 != jq1Var && z) {
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
        nb3.a0("dualScreenPresetsPreference");
        throw null;
    }

    public final void F(VideoRenderer videoRenderer, ListPreference listPreference, StoragePickerPreference storagePickerPreference, ListPreference listPreference2, EditTextPreference editTextPreference, SwitchPreference switchPreference, String[] strArr, String[] strArr2) {
        boolean z;
        if (videoRenderer == VideoRenderer.SOFTWARE) {
            z = true;
        } else {
            z = false;
        }
        ArrayList X0 = fv.X0(strArr, strArr2);
        ArrayList arrayList = new ArrayList();
        int size = X0.size();
        int i = 0;
        while (i < size) {
            Object obj = X0.get(i);
            i++;
            if (L((String) ((vr4) obj).A).isSupportedByRenderer(videoRenderer)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add((String) ((vr4) obj2).A);
        }
        listPreference.d0 = (CharSequence[]) arrayList2.toArray(new String[0]);
        ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList, 10));
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            arrayList3.add((String) ((vr4) obj3).B);
        }
        listPreference.g((CharSequence[]) arrayList3.toArray(new String[0]));
        if (z) {
            listPreference.setEnabled(false);
            listPreference.setSummary("Шейдерная фильтрация и AI-Upscale недоступны при программном (Software) рендеринге. Переключите рендерер на OpenGL или Vulkan.");
            String lowerCase = "NONE".toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            listPreference.h(lowerCase);
        } else {
            listPreference.setEnabled(true);
            if (!L(listPreference.e0).isSupportedByRenderer(videoRenderer)) {
                String lowerCase2 = "NONE".toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                listPreference.h(lowerCase2);
            }
            listPreference.setSummary("%s");
        }
        TwoStatePreference twoStatePreference = (TwoStatePreference) findPreference("video_hd_textures_enabled");
        if (twoStatePreference != null) {
            if (z) {
                twoStatePreference.e(false);
                twoStatePreference.setEnabled(false);
                twoStatePreference.setSummary("Загрузка HD-текстур доступна только при аппаратном рендеринге (OpenGL / Vulkan).");
            } else {
                twoStatePreference.setEnabled(true);
                twoStatePreference.setSummary(getString(R.string.video_hd_textures_summary));
            }
        }
        ListPreference listPreference3 = (ListPreference) findPreference("video_internal_resolution");
        if (listPreference3 != null) {
            if (z) {
                listPreference3.setEnabled(false);
                listPreference3.setSummary("Масштабирование разрешения 3D доступно только в OpenGL / Vulkan.");
            } else {
                listPreference3.setEnabled(true);
                listPreference3.setSummary("%s");
            }
        }
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) findPreference("video_ai_upscale_enabled");
        if (twoStatePreference2 != null) {
            if (z) {
                twoStatePreference2.e(false);
                twoStatePreference2.setEnabled(false);
                twoStatePreference2.setSummary("AI-Upscale 2D-спрайтов (Anime4K) недоступен при программном (Software) рендеринге. Переключите рендерер на OpenGL или Vulkan.");
            } else {
                twoStatePreference2.setEnabled(true);
                twoStatePreference2.setSummary(getString(R.string.video_ai_upscale_summary));
            }
        }
        Preference findPreference = findPreference("video_ai_upscale_scale");
        if (findPreference != null) {
            findPreference.setEnabled(!z);
            if (z) {
                findPreference.setSummary("AI-Upscale 2D недоступен в Software режиме.");
            } else {
                findPreference.setSummary("%s");
            }
        }
        String str = listPreference.e0;
        str.getClass();
        I(str, storagePickerPreference, listPreference2, editTextPreference, switchPreference);
    }

    public final void H() {
        if (this.p0 == null) {
            return;
        }
        zo5 h = p().h();
        if (h != null && p().d() != null) {
            String format = DateFormat.getDateFormat(requireContext()).format(new Date(h.d));
            String formatShortFileSize = Formatter.formatShortFileSize(requireContext(), p().f());
            Preference preference = this.p0;
            if (preference != null) {
                preference.setTitle(R.string.video_retroarch_shader_installed_title);
                Preference preference2 = this.p0;
                if (preference2 != null) {
                    preference2.setSummary(getString(R.string.video_retroarch_shader_installed_summary, format, formatShortFileSize));
                    return;
                } else {
                    nb3.a0("shaderManagePreference");
                    throw null;
                }
            }
            nb3.a0("shaderManagePreference");
            throw null;
        }
        Preference preference3 = this.p0;
        if (preference3 != null) {
            preference3.setTitle(R.string.video_retroarch_shader_install_title);
            Preference preference4 = this.p0;
            if (preference4 != null) {
                preference4.setSummary(R.string.video_retroarch_shader_install_summary);
                return;
            } else {
                nb3.a0("shaderManagePreference");
                throw null;
            }
        }
        nb3.a0("shaderManagePreference");
        throw null;
    }

    public final void I(String str, StoragePickerPreference storagePickerPreference, ListPreference listPreference, EditTextPreference editTextPreference, SwitchPreference switchPreference) {
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
        if (L(str) == VideoFiltering.RETROARCH) {
            z = true;
        } else {
            z = false;
        }
        RetroArchShaderSource t = t();
        if (t == RetroArchShaderSource.FOLDER) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (t == RetroArchShaderSource.INTERNAL) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 && (!z3 || p().d() == null)) {
            z4 = false;
        } else {
            z4 = true;
        }
        Preference preference = this.o0;
        if (preference != null) {
            preference.setVisible(z);
            Preference preference2 = this.o0;
            if (preference2 != null) {
                if (t == null) {
                    i = -1;
                } else {
                    i = WhenMappings.a[t.ordinal()];
                }
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            string = getString(R.string.video_retroarch_shader_source_folder);
                        } else {
                            defpackage.i.d();
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
                nb3.a0("shaderSourcePreference");
                throw null;
            }
        }
        Preference preference3 = this.p0;
        if (preference3 != null) {
            if (z && z3) {
                z8 = true;
            } else {
                z8 = false;
            }
            preference3.setVisible(z8);
            H();
        }
        Preference preference4 = this.q0;
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
        Preference preference5 = this.t0;
        if (preference5 != null) {
            preference5.setVisible(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(VideoRenderer videoRenderer, PreferenceCategory preferenceCategory, Preference preference, ListPreference listPreference, Preference preference2, boolean z) {
        boolean z2;
        boolean z3 = false;
        String str = null;
        if (videoRenderer == VideoRenderer.VULKAN) {
            u63 u63Var = this.v0;
            if (u63Var != null) {
                if (q60.N((Context) u63Var.B) && !z) {
                    z2 = true;
                    preferenceCategory.setVisible(z2);
                    if (z2) {
                        return;
                    }
                    preferenceCategory.setSummary((CharSequence) null);
                    hm4 b = new jm4().b(q60.H());
                    zq7 w = ((ng6) o()).w();
                    if (w != null) {
                        str = w.b;
                    }
                    if (((ng6) o()).A() == sr7.CUSTOM && str != null && b != null && qs6.j0(str, b.c, true)) {
                        z3 = true;
                    }
                    if (b != null && !z3) {
                        if (preference != null) {
                            preference.setSummary("⭐ Доступен рекомендуемый: ".concat(b.b));
                        }
                    } else if (preference != null) {
                        preference.setSummary(getString(R.string.video_vulkan_driver_manager_summary));
                    }
                    K(listPreference, preference2);
                    return;
                }
            } else {
                nb3.a0("adrenoVulkanDriverManager");
                throw null;
            }
        }
        z2 = false;
        preferenceCategory.setVisible(z2);
        if (z2) {
        }
    }

    public final void K(ListPreference listPreference, Preference preference) {
        boolean z;
        String string;
        List<zq7> n = ((ng6) o()).n();
        String x = ((ng6) o()).x();
        if (((ng6) o()).A() == sr7.CUSTOM && x != null && !n.isEmpty()) {
            for (zq7 zq7Var : n) {
                if (zq7Var.a.equals(x)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        String str = "system";
        String[] strArr = {"system"};
        ArrayList arrayList = new ArrayList(ht0.v0(n, 10));
        for (zq7 zq7Var2 : n) {
            arrayList.add(zq7Var2.a);
        }
        listPreference.d0 = (CharSequence[]) fv.N0(strArr, arrayList.toArray(new String[0]));
        String[] strArr2 = {getString(R.string.video_vulkan_driver_mode_system)};
        ArrayList arrayList2 = new ArrayList(ht0.v0(n, 10));
        for (zq7 zq7Var3 : n) {
            arrayList2.add(zq7Var3.b);
        }
        listPreference.g((CharSequence[]) fv.N0(strArr2, arrayList2.toArray(new String[0])));
        if (z) {
            str = x;
        }
        listPreference.h(str);
        if (z) {
            for (zq7 zq7Var4 : n) {
                if (zq7Var4.a.equals(x)) {
                    string = getString(R.string.video_vulkan_driver_active_custom, zq7Var4.b);
                }
            }
            fa6.e("Collection contains no element matching the predicate.");
            return;
        }
        string = getString(R.string.video_vulkan_driver_active_system);
        listPreference.setSummary(string);
        preference.setVisible(!n.isEmpty());
    }

    @Override // defpackage.q15
    public final String getTitle() {
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString(k15.ARG_PREFERENCE_ROOT);
        } else {
            str = null;
        }
        if (nb3.k(str, "video_retroarch_shader_settings")) {
            String string = getString(R.string.video_retroarch_shader_settings_title);
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.category_video);
        string2.getClass();
        return string2;
    }

    public final String m(p66 p66Var) {
        int i = WhenMappings.e[p66Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    String string = getString(R.string.dual_screen_vertical_alignment_option_bottom);
                    string.getClass();
                    return string;
                }
                defpackage.i.d();
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

    public final p15 n() {
        return (p15) this.Z.getValue();
    }

    public final kd6 o() {
        kd6 kd6Var = this.f0;
        if (kd6Var != null) {
            return kd6Var;
        }
        nb3.a0("settingsRepository");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032d A[EDGE_INSN: B:120:0x032d->B:79:0x032d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x033f A[LOOP:2: B:80:0x033d->B:81:0x033f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0372 A[LOOP:3: B:83:0x0370->B:84:0x0372, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03fc  */
    @Override // defpackage.k15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreatePreferences(Bundle bundle, String str) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        InGameLockedListPreference inGameLockedListPreference;
        boolean z4;
        boolean z5;
        ArrayList X0;
        int size;
        PreferenceCategory preferenceCategory;
        Preference preference;
        int i2;
        StoragePickerPreference storagePickerPreference;
        int size2;
        int i3;
        int size3;
        int i4;
        boolean z6;
        Preference preference2;
        boolean z7;
        ConfigurationInfo deviceConfigurationInfo;
        boolean z8;
        setPreferencesFromResource(R.xml.pref_video, str);
        boolean z9 = true;
        if (nb3.k(str, "video_retroarch_shader_settings")) {
            Preference findPreference = findPreference("video_retroarch_shader_manage");
            if (findPreference != null) {
                this.p0 = findPreference;
                findPreference.setOnPreferenceClickListener(new y05(this) { // from class: om7
                    public final /* synthetic */ VideoPreferencesFragment B;

                    {
                        this.B = this;
                    }

                    /* JADX WARN: Type inference failed for: r10v4, types: [dh5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v15, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v28, types: [dh5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r3v14, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v22, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r6v6, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r7v6, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r8v6, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v5, types: [dh5, java.lang.Object] */
                    @Override // defpackage.y05
                    public final void i(Preference preference3) {
                        RandomAccess randomAccess;
                        final yt1 yt1Var;
                        String P0;
                        boolean z10;
                        switch (r2) {
                            case 0:
                                this.B.B();
                                return;
                            case 1:
                                VideoPreferencesFragment videoPreferencesFragment = this.B;
                                if (videoPreferencesFragment.p().d() != null) {
                                    Context requireContext = videoPreferencesFragment.requireContext();
                                    requireContext.getClass();
                                    String[] strArr = {videoPreferencesFragment.getString(R.string.video_retroarch_shader_check_updates), videoPreferencesFragment.getString(R.string.video_retroarch_shader_reinstall), videoPreferencesFragment.getString(R.string.video_retroarch_shader_uninstall)};
                                    zb zbVar = new zb(requireContext);
                                    zbVar.z(R.string.video_retroarch_shader_installed_title);
                                    zbVar.v(strArr, new k(videoPreferencesFragment, 0));
                                    zbVar.x(17039360, null);
                                    zbVar.B();
                                    return;
                                }
                                videoPreferencesFragment.D();
                                return;
                            case 2:
                                final VideoPreferencesFragment videoPreferencesFragment2 = this.B;
                                ae6 ae6Var = videoPreferencesFragment2.h0;
                                if (ae6Var != null) {
                                    synchronized (ae6Var) {
                                        try {
                                            if (ae6Var.a.isFile()) {
                                                randomAccess = jc2.A0(ae6Var.a);
                                            } else {
                                                randomAccess = yt1.A;
                                            }
                                            RandomAccess randomAccess2 = yt1.A;
                                            boolean z11 = randomAccess instanceof em5;
                                            RandomAccess randomAccess3 = randomAccess;
                                            if (z11) {
                                                randomAccess3 = randomAccess2;
                                            }
                                            yt1Var = (List) randomAccess3;
                                        }
                                    }
                                    if (yt1Var.isEmpty()) {
                                        P0 = videoPreferencesFragment2.getString(R.string.shader_compatibility_report_empty);
                                    } else {
                                        P0 = gt0.P0(new l14(yt1Var), "\n\n", null, null, null, 62);
                                    }
                                    P0.getClass();
                                    zb zbVar2 = new zb(videoPreferencesFragment2.requireContext());
                                    zbVar2.z(R.string.shader_compatibility_report_title);
                                    ((wb) zbVar2.L).f = P0;
                                    zbVar2.y(17039370, null);
                                    if (!yt1Var.isEmpty()) {
                                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: me.magnum.melonds.ui.settings.fragments.j
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                                VideoPreferencesFragment videoPreferencesFragment3 = VideoPreferencesFragment.this;
                                                Uri uri = (Uri) fv.E0(((ng6) videoPreferencesFragment3.o()).r());
                                                if (uri == null) {
                                                    Toast.makeText(videoPreferencesFragment3.requireContext(), (int) R.string.shader_compatibility_report_no_rom_folder, 1).show();
                                                } else {
                                                    hv.L(bl2.C(videoPreferencesFragment3), null, null, new VideoPreferencesFragment$saveShaderCompatibilityLog$1(videoPreferencesFragment3, uri, yt1Var, null), 3);
                                                }
                                            }
                                        };
                                        wb wbVar = (wb) zbVar2.L;
                                        wbVar.k = wbVar.a.getText(R.string.shader_compatibility_report_save);
                                        wbVar.l = onClickListener;
                                        zbVar2.x(R.string.shader_compatibility_report_clear, new rm7(videoPreferencesFragment2, 2));
                                    }
                                    zbVar2.B();
                                    return;
                                }
                                nb3.a0("shaderCompatibilityLog");
                                throw null;
                            case 3:
                                VideoPreferencesFragment videoPreferencesFragment3 = this.B;
                                videoPreferencesFragment3.startActivity(new Intent(videoPreferencesFragment3.requireContext(), VulkanDriverManagerActivity.class));
                                return;
                            case 4:
                                this.B.C0.a(new String[]{"application/zip", "application/x-zip-compressed", "application/octet-stream", "application/x-compressed"});
                                return;
                            default:
                                final VideoPreferencesFragment videoPreferencesFragment4 = this.B;
                                jq1 i5 = ((ng6) videoPreferencesFragment4.o()).i();
                                boolean z12 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("external_display_keep_ratio", true);
                                boolean z13 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_integer_scale", false);
                                boolean z14 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_height", false);
                                boolean z15 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_width", false);
                                boolean z16 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_height", false);
                                boolean z17 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_width", false);
                                p66 h = ((ng6) videoPreferencesFragment4.o()).h();
                                p66 g = ((ng6) videoPreferencesFragment4.o()).g();
                                View inflate = LayoutInflater.from(videoPreferencesFragment4.requireContext()).inflate(R.layout.dialog_dual_screen_presets, (ViewGroup) null);
                                RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupPresets);
                                final SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.switchKeepAspectRatio);
                                final SwitchCompat switchCompat2 = (SwitchCompat) inflate.findViewById(R.id.switchIntegerScale);
                                final Button button = (Button) inflate.findViewById(R.id.buttonFillAreaOptions);
                                final Button button2 = (Button) inflate.findViewById(R.id.buttonVerticalAlignmentOptions);
                                final TextView textView = (TextView) inflate.findViewById(R.id.textVerticalAlignmentSummary);
                                final TextView textView2 = (TextView) inflate.findViewById(R.id.textPresetsDisabledHint);
                                jq1 jq1Var = jq1.OFF;
                                int i6 = R.id.radioPresetOff;
                                final Map m0 = c14.m0(new vr4(jq1Var, Integer.valueOf((int) R.id.radioPresetOff)), new vr4(jq1.INTERNAL_TOP_EXTERNAL_BOTTOM, Integer.valueOf((int) R.id.radioPresetInternalTopExternalBottom)), new vr4(jq1.INTERNAL_BOTTOM_EXTERNAL_TOP, Integer.valueOf((int) R.id.radioPresetInternalBottomExternalTop)));
                                final ?? obj = new Object();
                                obj.A = i5;
                                final ?? obj2 = new Object();
                                obj2.A = z12;
                                final ?? obj3 = new Object();
                                if (z13 && i5 != jq1Var) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                obj3.A = z10;
                                final ?? obj4 = new Object();
                                obj4.A = z14;
                                final ?? obj5 = new Object();
                                obj5.A = z15;
                                final ?? obj6 = new Object();
                                obj6.A = z16;
                                final ?? obj7 = new Object();
                                obj7.A = z17;
                                final ?? obj8 = new Object();
                                obj8.A = h;
                                final ?? obj9 = new Object();
                                obj9.A = g;
                                Integer num = (Integer) m0.get(i5);
                                if (num != null) {
                                    i6 = num.intValue();
                                }
                                radioGroup.check(i6);
                                switchCompat.setChecked(obj2.A);
                                switchCompat2.setChecked(obj3.A);
                                VideoPreferencesFragment.v(obj, obj8, obj9, textView, videoPreferencesFragment4);
                                VideoPreferencesFragment.u(obj, textView2, switchCompat, switchCompat2, obj3, obj2, button, button2);
                                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: um7
                                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                    public final void onCheckedChanged(RadioGroup radioGroup2, int i7) {
                                        Object obj10;
                                        jq1 jq1Var2;
                                        radioGroup2.getClass();
                                        Iterator it = m0.entrySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj10 = it.next();
                                                if (((Number) ((Map.Entry) obj10).getValue()).intValue() == i7) {
                                                    break;
                                                }
                                            } else {
                                                obj10 = null;
                                                break;
                                            }
                                        }
                                        Map.Entry entry = (Map.Entry) obj10;
                                        if (entry != null && (jq1Var2 = (jq1) entry.getKey()) != null) {
                                            dh5 dh5Var = obj;
                                            dh5Var.A = jq1Var2;
                                            jq1 jq1Var3 = jq1.OFF;
                                            SwitchCompat switchCompat3 = switchCompat2;
                                            zg5 zg5Var = obj3;
                                            if (jq1Var2 == jq1Var3) {
                                                switchCompat3.setChecked(false);
                                                zg5Var.A = false;
                                            }
                                            VideoPreferencesFragment.u(dh5Var, textView2, switchCompat, switchCompat3, zg5Var, obj2, button, button2);
                                            VideoPreferencesFragment.v(dh5Var, obj8, obj9, textView, videoPreferencesFragment4);
                                        }
                                    }
                                });
                                switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                        switch (r9) {
                                            case 0:
                                                compoundButton.getClass();
                                                zg5 zg5Var = obj2;
                                                zg5Var.A = z18;
                                                VideoPreferencesFragment.u(obj, textView2, switchCompat, switchCompat2, obj3, zg5Var, button, button2);
                                                return;
                                            default:
                                                compoundButton.getClass();
                                                zg5 zg5Var2 = obj2;
                                                zg5Var2.A = z18;
                                                VideoPreferencesFragment.u(obj, textView2, switchCompat, switchCompat2, zg5Var2, obj3, button, button2);
                                                return;
                                        }
                                    }
                                });
                                switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                        switch (r9) {
                                            case 0:
                                                compoundButton.getClass();
                                                zg5 zg5Var = obj3;
                                                zg5Var.A = z18;
                                                VideoPreferencesFragment.u(obj, textView2, switchCompat, switchCompat2, obj2, zg5Var, button, button2);
                                                return;
                                            default:
                                                compoundButton.getClass();
                                                zg5 zg5Var2 = obj3;
                                                zg5Var2.A = z18;
                                                VideoPreferencesFragment.u(obj, textView2, switchCompat, switchCompat2, zg5Var2, obj2, button, button2);
                                                return;
                                        }
                                    }
                                });
                                button.setOnClickListener(new View.OnClickListener() { // from class: xm7
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        final boolean z18;
                                        boolean z19;
                                        boolean z20;
                                        int i7;
                                        if (dh5.this.A != jq1.OFF && (obj3.A || obj2.A)) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        zg5 zg5Var = obj4;
                                        boolean z21 = zg5Var.A;
                                        zg5 zg5Var2 = obj5;
                                        boolean z22 = zg5Var2.A;
                                        zg5 zg5Var3 = obj6;
                                        boolean z23 = zg5Var3.A;
                                        zg5 zg5Var4 = obj7;
                                        boolean z24 = zg5Var4.A;
                                        final jb7 jb7Var = new jb7(zg5Var, zg5Var2, zg5Var3, zg5Var4, 1);
                                        VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                        View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_fill_area, (ViewGroup) null);
                                        TextView textView3 = (TextView) inflate2.findViewById(R.id.textFillAreaDisabled);
                                        final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillEnabled);
                                        final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillHeight);
                                        final SwitchCompat switchCompat5 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillWidth);
                                        final SwitchCompat switchCompat6 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillEnabled);
                                        final SwitchCompat switchCompat7 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillHeight);
                                        final SwitchCompat switchCompat8 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillWidth);
                                        ((TextView) inflate2.findViewById(R.id.textFillAreaDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_fill_area_description));
                                        switchCompat4.setChecked(z21);
                                        switchCompat5.setChecked(z22);
                                        switchCompat7.setChecked(z23);
                                        switchCompat8.setChecked(z24);
                                        if (!z21 && !z22) {
                                            z19 = false;
                                        } else {
                                            z19 = true;
                                        }
                                        switchCompat3.setChecked(z19);
                                        if (!z23 && !z24) {
                                            z20 = false;
                                        } else {
                                            z20 = true;
                                        }
                                        switchCompat6.setChecked(z20);
                                        switchCompat3.setEnabled(z18);
                                        switchCompat6.setEnabled(z18);
                                        VideoPreferencesFragment.x(z18, switchCompat4, switchCompat5, switchCompat3.isChecked(), false);
                                        VideoPreferencesFragment.w(z18, switchCompat7, switchCompat8, switchCompat6.isChecked(), false);
                                        switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                int i8 = r4;
                                                SwitchCompat switchCompat9 = switchCompat5;
                                                SwitchCompat switchCompat10 = switchCompat4;
                                                boolean z26 = z18;
                                                switch (i8) {
                                                    case 0:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                        return;
                                                    default:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                        return;
                                                }
                                            }
                                        });
                                        switchCompat6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                int i8 = r4;
                                                SwitchCompat switchCompat9 = switchCompat8;
                                                SwitchCompat switchCompat10 = switchCompat7;
                                                boolean z26 = z18;
                                                switch (i8) {
                                                    case 0:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                        return;
                                                    default:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                        return;
                                                }
                                            }
                                        });
                                        textView3.getClass();
                                        if (!z18) {
                                            i7 = 0;
                                        } else {
                                            i7 = 8;
                                        }
                                        textView3.setVisibility(i7);
                                        zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                        zbVar3.z(R.string.dual_screen_fill_area_title);
                                        zbVar3.A(inflate2);
                                        zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: fn7
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i8) {
                                                boolean z25;
                                                boolean z26;
                                                boolean z27;
                                                boolean z28;
                                                boolean z29 = z18;
                                                boolean z30 = true;
                                                boolean z31 = false;
                                                if (z29 && switchCompat3.isChecked()) {
                                                    z25 = true;
                                                } else {
                                                    z25 = false;
                                                }
                                                if (!z29 || !switchCompat6.isChecked()) {
                                                    z30 = false;
                                                }
                                                if (z25) {
                                                    z26 = switchCompat4.isChecked();
                                                } else {
                                                    z26 = false;
                                                }
                                                Boolean valueOf = Boolean.valueOf(z26);
                                                if (z25) {
                                                    z27 = switchCompat5.isChecked();
                                                } else {
                                                    z27 = false;
                                                }
                                                Boolean valueOf2 = Boolean.valueOf(z27);
                                                if (z30) {
                                                    z28 = switchCompat7.isChecked();
                                                } else {
                                                    z28 = false;
                                                }
                                                Boolean valueOf3 = Boolean.valueOf(z28);
                                                if (z30) {
                                                    z31 = switchCompat8.isChecked();
                                                }
                                                jb7Var.l(valueOf, valueOf2, valueOf3, Boolean.valueOf(z31));
                                            }
                                        });
                                        zbVar3.x(R.string.cancel, null);
                                        zbVar3.B();
                                    }
                                });
                                button2.setOnClickListener(new View.OnClickListener() { // from class: ym7
                                    /* JADX WARN: Type inference failed for: r11v6, types: [dh5, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r12v3, types: [dh5, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r14v2, types: [dh5, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r7v4, types: [dh5, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r8v2, types: [zg5, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r9v2, types: [zg5, java.lang.Object] */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        p66 p66Var;
                                        p66 p66Var2;
                                        boolean z18;
                                        boolean z19;
                                        int i7;
                                        int i8;
                                        dh5 dh5Var = obj;
                                        jq1 jq1Var2 = (jq1) dh5Var.A;
                                        dh5 dh5Var2 = obj8;
                                        p66 p66Var3 = (p66) dh5Var2.A;
                                        dh5 dh5Var3 = obj9;
                                        p66 p66Var4 = (p66) dh5Var3.A;
                                        TextView textView3 = textView;
                                        VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                        ne4 ne4Var = new ne4(dh5Var2, dh5Var3, textView3, videoPreferencesFragment5, dh5Var, 8);
                                        View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_vertical_alignment, (ViewGroup) null);
                                        ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_description));
                                        ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDefaults)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_default_hint, videoPreferencesFragment5.m(lb4.r(jq1Var2)), videoPreferencesFragment5.m(lb4.q(jq1Var2))));
                                        final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalAlignmentOverride);
                                        final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalAlignmentOverride);
                                        RadioGroup radioGroup2 = (RadioGroup) inflate2.findViewById(R.id.radioGroupInternalAlignment);
                                        RadioGroup radioGroup3 = (RadioGroup) inflate2.findViewById(R.id.radioGroupExternalAlignment);
                                        p66 p66Var5 = p66.TOP;
                                        vr4 vr4Var = new vr4(p66Var5, inflate2.findViewById(R.id.radioInternalAlignmentTop));
                                        p66 p66Var6 = p66.CENTER;
                                        vr4 vr4Var2 = new vr4(p66Var6, inflate2.findViewById(R.id.radioInternalAlignmentCenter));
                                        p66 p66Var7 = p66.BOTTOM;
                                        final Map m02 = c14.m0(vr4Var, vr4Var2, new vr4(p66Var7, inflate2.findViewById(R.id.radioInternalAlignmentBottom)));
                                        final Map m03 = c14.m0(new vr4(p66Var5, inflate2.findViewById(R.id.radioExternalAlignmentTop)), new vr4(p66Var6, inflate2.findViewById(R.id.radioExternalAlignmentCenter)), new vr4(p66Var7, inflate2.findViewById(R.id.radioExternalAlignmentBottom)));
                                        final ?? obj10 = new Object();
                                        if (p66Var3 == null) {
                                            p66Var = lb4.r(jq1Var2);
                                        } else {
                                            p66Var = p66Var3;
                                        }
                                        obj10.A = p66Var;
                                        final ?? obj11 = new Object();
                                        if (p66Var4 == null) {
                                            p66Var2 = lb4.q(jq1Var2);
                                        } else {
                                            p66Var2 = p66Var4;
                                        }
                                        obj11.A = p66Var2;
                                        final ?? obj12 = new Object();
                                        obj12.A = p66Var3;
                                        final ?? obj13 = new Object();
                                        obj13.A = p66Var4;
                                        final ?? obj14 = new Object();
                                        final ?? obj15 = new Object();
                                        if (obj12.A != null) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        switchCompat3.setChecked(z18);
                                        if (obj13.A != null) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        switchCompat4.setChecked(z19);
                                        obj14.A = true;
                                        RadioButton radioButton = (RadioButton) m02.get(obj10.A);
                                        if (radioButton != null) {
                                            i7 = radioButton.getId();
                                        } else {
                                            i7 = R.id.radioInternalAlignmentTop;
                                        }
                                        radioGroup2.check(i7);
                                        obj14.A = false;
                                        obj15.A = true;
                                        RadioButton radioButton2 = (RadioButton) m03.get(obj11.A);
                                        if (radioButton2 != null) {
                                            i8 = radioButton2.getId();
                                        } else {
                                            i8 = R.id.radioExternalAlignmentTop;
                                        }
                                        radioGroup3.check(i8);
                                        obj15.A = false;
                                        VideoPreferencesFragment.C(m02.values(), switchCompat3.isChecked());
                                        VideoPreferencesFragment.C(m03.values(), switchCompat4.isChecked());
                                        switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                int i9 = r4;
                                                p66 p66Var8 = null;
                                                dh5 dh5Var4 = obj10;
                                                dh5 dh5Var5 = obj12;
                                                Map map = m02;
                                                switch (i9) {
                                                    case 0:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.C(map.values(), z20);
                                                        if (z20) {
                                                            p66Var8 = (p66) dh5Var4.A;
                                                        }
                                                        dh5Var5.A = p66Var8;
                                                        return;
                                                    default:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.C(map.values(), z20);
                                                        if (z20) {
                                                            p66Var8 = (p66) dh5Var4.A;
                                                        }
                                                        dh5Var5.A = p66Var8;
                                                        return;
                                                }
                                            }
                                        });
                                        switchCompat4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                int i9 = r4;
                                                p66 p66Var8 = null;
                                                dh5 dh5Var4 = obj11;
                                                dh5 dh5Var5 = obj13;
                                                Map map = m03;
                                                switch (i9) {
                                                    case 0:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.C(map.values(), z20);
                                                        if (z20) {
                                                            p66Var8 = (p66) dh5Var4.A;
                                                        }
                                                        dh5Var5.A = p66Var8;
                                                        return;
                                                    default:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.C(map.values(), z20);
                                                        if (z20) {
                                                            p66Var8 = (p66) dh5Var4.A;
                                                        }
                                                        dh5Var5.A = p66Var8;
                                                        return;
                                                }
                                            }
                                        });
                                        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                            @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                            public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                p66 p66Var8;
                                                p66 p66Var9;
                                                int i10 = r5;
                                                dh5 dh5Var4 = obj12;
                                                SwitchCompat switchCompat5 = switchCompat3;
                                                dh5 dh5Var5 = obj10;
                                                zg5 zg5Var = obj14;
                                                switch (i10) {
                                                    case 0:
                                                        radioGroup4.getClass();
                                                        if (!zg5Var.A) {
                                                            if (i9 == R.id.radioInternalAlignmentTop) {
                                                                p66Var8 = p66.TOP;
                                                            } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                p66Var8 = p66.CENTER;
                                                            } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                p66Var8 = p66.BOTTOM;
                                                            } else {
                                                                p66Var8 = p66.TOP;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            if (switchCompat5.isChecked()) {
                                                                dh5Var4.A = dh5Var5.A;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        radioGroup4.getClass();
                                                        if (!zg5Var.A) {
                                                            if (i9 == R.id.radioExternalAlignmentTop) {
                                                                p66Var9 = p66.TOP;
                                                            } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                p66Var9 = p66.CENTER;
                                                            } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                p66Var9 = p66.BOTTOM;
                                                            } else {
                                                                p66Var9 = p66.TOP;
                                                            }
                                                            dh5Var5.A = p66Var9;
                                                            if (switchCompat5.isChecked()) {
                                                                dh5Var4.A = dh5Var5.A;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                            @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                            public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                p66 p66Var8;
                                                p66 p66Var9;
                                                int i10 = r5;
                                                dh5 dh5Var4 = obj13;
                                                SwitchCompat switchCompat5 = switchCompat4;
                                                dh5 dh5Var5 = obj11;
                                                zg5 zg5Var = obj15;
                                                switch (i10) {
                                                    case 0:
                                                        radioGroup4.getClass();
                                                        if (!zg5Var.A) {
                                                            if (i9 == R.id.radioInternalAlignmentTop) {
                                                                p66Var8 = p66.TOP;
                                                            } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                p66Var8 = p66.CENTER;
                                                            } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                p66Var8 = p66.BOTTOM;
                                                            } else {
                                                                p66Var8 = p66.TOP;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            if (switchCompat5.isChecked()) {
                                                                dh5Var4.A = dh5Var5.A;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        radioGroup4.getClass();
                                                        if (!zg5Var.A) {
                                                            if (i9 == R.id.radioExternalAlignmentTop) {
                                                                p66Var9 = p66.TOP;
                                                            } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                p66Var9 = p66.CENTER;
                                                            } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                p66Var9 = p66.BOTTOM;
                                                            } else {
                                                                p66Var9 = p66.TOP;
                                                            }
                                                            dh5Var5.A = p66Var9;
                                                            if (switchCompat5.isChecked()) {
                                                                dh5Var4.A = dh5Var5.A;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                        zbVar3.z(R.string.dual_screen_vertical_alignment_title);
                                        zbVar3.A(inflate2);
                                        zbVar3.y(R.string.ok, new qu1(ne4Var, obj12, obj13, 6));
                                        zbVar3.x(R.string.cancel, null);
                                        zbVar3.B();
                                    }
                                });
                                zb zbVar3 = new zb(videoPreferencesFragment4.requireContext());
                                zbVar3.z(R.string.dual_screen_presets_settings_title);
                                zbVar3.A(inflate);
                                zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: zm7
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i7) {
                                        boolean z18;
                                        VideoPreferencesFragment videoPreferencesFragment5 = VideoPreferencesFragment.this;
                                        kd6 o = videoPreferencesFragment5.o();
                                        dh5 dh5Var = obj;
                                        jq1 jq1Var2 = (jq1) dh5Var.A;
                                        jq1Var2.getClass();
                                        SharedPreferences.Editor edit = ((ng6) o).b.edit();
                                        String lowerCase = jq1Var2.name().toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        edit.putString("dual_screen_preset", lowerCase);
                                        edit.apply();
                                        kd6 o2 = videoPreferencesFragment5.o();
                                        boolean z19 = obj2.A;
                                        SharedPreferences.Editor edit2 = ((ng6) o2).b.edit();
                                        edit2.putBoolean("external_display_keep_ratio", z19);
                                        edit2.apply();
                                        kd6 o3 = videoPreferencesFragment5.o();
                                        if (obj3.A && dh5Var.A != jq1.OFF) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        SharedPreferences.Editor edit3 = ((ng6) o3).b.edit();
                                        edit3.putBoolean("dual_screen_integer_scale", z18);
                                        edit3.apply();
                                        kd6 o4 = videoPreferencesFragment5.o();
                                        boolean z20 = obj4.A;
                                        SharedPreferences.Editor edit4 = ((ng6) o4).b.edit();
                                        edit4.putBoolean("dual_screen_internal_fill_height", z20);
                                        edit4.apply();
                                        kd6 o5 = videoPreferencesFragment5.o();
                                        boolean z21 = obj5.A;
                                        SharedPreferences.Editor edit5 = ((ng6) o5).b.edit();
                                        edit5.putBoolean("dual_screen_internal_fill_width", z21);
                                        edit5.apply();
                                        kd6 o6 = videoPreferencesFragment5.o();
                                        boolean z22 = obj6.A;
                                        SharedPreferences.Editor edit6 = ((ng6) o6).b.edit();
                                        edit6.putBoolean("dual_screen_external_fill_height", z22);
                                        edit6.apply();
                                        kd6 o7 = videoPreferencesFragment5.o();
                                        boolean z23 = obj7.A;
                                        SharedPreferences.Editor edit7 = ((ng6) o7).b.edit();
                                        edit7.putBoolean("dual_screen_external_fill_width", z23);
                                        edit7.apply();
                                        ((ng6) videoPreferencesFragment5.o()).N((p66) obj8.A);
                                        ((ng6) videoPreferencesFragment5.o()).M((p66) obj9.A);
                                        videoPreferencesFragment5.E();
                                    }
                                });
                                zbVar3.x(R.string.cancel, null);
                                zbVar3.B();
                                return;
                        }
                    }
                });
            }
            Preference findPreference2 = findPreference("video_retroarch_shader_report");
            if (findPreference2 != null) {
                this.q0 = findPreference2;
                findPreference2.setOnPreferenceClickListener(new y05(this) { // from class: om7
                    public final /* synthetic */ VideoPreferencesFragment B;

                    {
                        this.B = this;
                    }

                    /* JADX WARN: Type inference failed for: r10v4, types: [dh5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r1v15, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r2v28, types: [dh5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r3v14, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v22, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r6v6, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r7v6, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r8v6, types: [zg5, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v5, types: [dh5, java.lang.Object] */
                    @Override // defpackage.y05
                    public final void i(Preference preference3) {
                        RandomAccess randomAccess;
                        final List yt1Var;
                        String P0;
                        boolean z10;
                        switch (r2) {
                            case 0:
                                this.B.B();
                                return;
                            case 1:
                                VideoPreferencesFragment videoPreferencesFragment = this.B;
                                if (videoPreferencesFragment.p().d() != null) {
                                    Context requireContext = videoPreferencesFragment.requireContext();
                                    requireContext.getClass();
                                    String[] strArr = {videoPreferencesFragment.getString(R.string.video_retroarch_shader_check_updates), videoPreferencesFragment.getString(R.string.video_retroarch_shader_reinstall), videoPreferencesFragment.getString(R.string.video_retroarch_shader_uninstall)};
                                    zb zbVar = new zb(requireContext);
                                    zbVar.z(R.string.video_retroarch_shader_installed_title);
                                    zbVar.v(strArr, new k(videoPreferencesFragment, 0));
                                    zbVar.x(17039360, null);
                                    zbVar.B();
                                    return;
                                }
                                videoPreferencesFragment.D();
                                return;
                            case 2:
                                final VideoPreferencesFragment videoPreferencesFragment2 = this.B;
                                ae6 ae6Var = videoPreferencesFragment2.h0;
                                if (ae6Var != null) {
                                    synchronized (ae6Var) {
                                        try {
                                            if (ae6Var.a.isFile()) {
                                                randomAccess = jc2.A0(ae6Var.a);
                                            } else {
                                                randomAccess = yt1.A;
                                            }
                                            RandomAccess randomAccess2 = yt1.A;
                                            boolean z11 = randomAccess instanceof em5;
                                            RandomAccess randomAccess3 = randomAccess;
                                            if (z11) {
                                                randomAccess3 = randomAccess2;
                                            }
                                            yt1Var = (List) randomAccess3;
                                        }
                                    }
                                    if (yt1Var.isEmpty()) {
                                        P0 = videoPreferencesFragment2.getString(R.string.shader_compatibility_report_empty);
                                    } else {
                                        P0 = gt0.P0(new l14(yt1Var), "\n\n", null, null, null, 62);
                                    }
                                    P0.getClass();
                                    zb zbVar2 = new zb(videoPreferencesFragment2.requireContext());
                                    zbVar2.z(R.string.shader_compatibility_report_title);
                                    ((wb) zbVar2.L).f = P0;
                                    zbVar2.y(17039370, null);
                                    if (!yt1Var.isEmpty()) {
                                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: me.magnum.melonds.ui.settings.fragments.j
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                                VideoPreferencesFragment videoPreferencesFragment3 = VideoPreferencesFragment.this;
                                                Uri uri = (Uri) fv.E0(((ng6) videoPreferencesFragment3.o()).r());
                                                if (uri == null) {
                                                    Toast.makeText(videoPreferencesFragment3.requireContext(), (int) R.string.shader_compatibility_report_no_rom_folder, 1).show();
                                                } else {
                                                    hv.L(bl2.C(videoPreferencesFragment3), null, null, new VideoPreferencesFragment$saveShaderCompatibilityLog$1(videoPreferencesFragment3, uri, yt1Var, null), 3);
                                                }
                                            }
                                        };
                                        wb wbVar = (wb) zbVar2.L;
                                        wbVar.k = wbVar.a.getText(R.string.shader_compatibility_report_save);
                                        wbVar.l = onClickListener;
                                        zbVar2.x(R.string.shader_compatibility_report_clear, new rm7(videoPreferencesFragment2, 2));
                                    }
                                    zbVar2.B();
                                    return;
                                }
                                nb3.a0("shaderCompatibilityLog");
                                throw null;
                            case 3:
                                VideoPreferencesFragment videoPreferencesFragment3 = this.B;
                                videoPreferencesFragment3.startActivity(new Intent(videoPreferencesFragment3.requireContext(), VulkanDriverManagerActivity.class));
                                return;
                            case 4:
                                this.B.C0.a(new String[]{"application/zip", "application/x-zip-compressed", "application/octet-stream", "application/x-compressed"});
                                return;
                            default:
                                final VideoPreferencesFragment videoPreferencesFragment4 = this.B;
                                jq1 i5 = ((ng6) videoPreferencesFragment4.o()).i();
                                boolean z12 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("external_display_keep_ratio", true);
                                boolean z13 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_integer_scale", false);
                                boolean z14 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_height", false);
                                boolean z15 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_width", false);
                                boolean z16 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_height", false);
                                boolean z17 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_width", false);
                                p66 h = ((ng6) videoPreferencesFragment4.o()).h();
                                p66 g = ((ng6) videoPreferencesFragment4.o()).g();
                                View inflate = LayoutInflater.from(videoPreferencesFragment4.requireContext()).inflate(R.layout.dialog_dual_screen_presets, (ViewGroup) null);
                                RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupPresets);
                                final SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.switchKeepAspectRatio);
                                final SwitchCompat switchCompat2 = (SwitchCompat) inflate.findViewById(R.id.switchIntegerScale);
                                final Button button = (Button) inflate.findViewById(R.id.buttonFillAreaOptions);
                                final Button button2 = (Button) inflate.findViewById(R.id.buttonVerticalAlignmentOptions);
                                final TextView textView = (TextView) inflate.findViewById(R.id.textVerticalAlignmentSummary);
                                final TextView textView2 = (TextView) inflate.findViewById(R.id.textPresetsDisabledHint);
                                jq1 jq1Var = jq1.OFF;
                                int i6 = R.id.radioPresetOff;
                                final Map m0 = c14.m0(new vr4(jq1Var, Integer.valueOf((int) R.id.radioPresetOff)), new vr4(jq1.INTERNAL_TOP_EXTERNAL_BOTTOM, Integer.valueOf((int) R.id.radioPresetInternalTopExternalBottom)), new vr4(jq1.INTERNAL_BOTTOM_EXTERNAL_TOP, Integer.valueOf((int) R.id.radioPresetInternalBottomExternalTop)));
                                final dh5 obj = new Object();
                                obj.A = i5;
                                final zg5 obj2 = new Object();
                                obj2.A = z12;
                                final zg5 obj3 = new Object();
                                if (z13 && i5 != jq1Var) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                obj3.A = z10;
                                final zg5 obj4 = new Object();
                                obj4.A = z14;
                                final zg5 obj5 = new Object();
                                obj5.A = z15;
                                final zg5 obj6 = new Object();
                                obj6.A = z16;
                                final zg5 obj7 = new Object();
                                obj7.A = z17;
                                final dh5 obj8 = new Object();
                                obj8.A = h;
                                final dh5 obj9 = new Object();
                                obj9.A = g;
                                Integer num = (Integer) m0.get(i5);
                                if (num != null) {
                                    i6 = num.intValue();
                                }
                                radioGroup.check(i6);
                                switchCompat.setChecked(obj2.A);
                                switchCompat2.setChecked(obj3.A);
                                VideoPreferencesFragment.v(obj, obj8, obj9, textView, videoPreferencesFragment4);
                                VideoPreferencesFragment.u(obj, textView2, switchCompat, switchCompat2, obj3, obj2, button, button2);
                                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: um7
                                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                    public final void onCheckedChanged(RadioGroup radioGroup2, int i7) {
                                        Object obj10;
                                        jq1 jq1Var2;
                                        radioGroup2.getClass();
                                        Iterator it = m0.entrySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj10 = it.next();
                                                if (((Number) ((Map.Entry) obj10).getValue()).intValue() == i7) {
                                                    break;
                                                }
                                            } else {
                                                obj10 = null;
                                                break;
                                            }
                                        }
                                        Map.Entry entry = (Map.Entry) obj10;
                                        if (entry != null && (jq1Var2 = (jq1) entry.getKey()) != null) {
                                            dh5 dh5Var = obj;
                                            dh5Var.A = jq1Var2;
                                            jq1 jq1Var3 = jq1.OFF;
                                            SwitchCompat switchCompat3 = switchCompat2;
                                            zg5 zg5Var = obj3;
                                            if (jq1Var2 == jq1Var3) {
                                                switchCompat3.setChecked(false);
                                                zg5Var.A = false;
                                            }
                                            VideoPreferencesFragment.u(dh5Var, textView2, switchCompat, switchCompat3, zg5Var, obj2, button, button2);
                                            VideoPreferencesFragment.v(dh5Var, obj8, obj9, textView, videoPreferencesFragment4);
                                        }
                                    }
                                });
                                switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                        switch (r9) {
                                            case 0:
                                                compoundButton.getClass();
                                                zg5 zg5Var = obj2;
                                                zg5Var.A = z18;
                                                VideoPreferencesFragment.u(obj, textView2, switchCompat, switchCompat2, obj3, zg5Var, button, button2);
                                                return;
                                            default:
                                                compoundButton.getClass();
                                                zg5 zg5Var2 = obj2;
                                                zg5Var2.A = z18;
                                                VideoPreferencesFragment.u(obj, textView2, switchCompat, switchCompat2, zg5Var2, obj3, button, button2);
                                                return;
                                        }
                                    }
                                });
                                switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                        switch (r9) {
                                            case 0:
                                                compoundButton.getClass();
                                                zg5 zg5Var = obj3;
                                                zg5Var.A = z18;
                                                VideoPreferencesFragment.u(obj, textView2, switchCompat, switchCompat2, obj2, zg5Var, button, button2);
                                                return;
                                            default:
                                                compoundButton.getClass();
                                                zg5 zg5Var2 = obj3;
                                                zg5Var2.A = z18;
                                                VideoPreferencesFragment.u(obj, textView2, switchCompat, switchCompat2, zg5Var2, obj2, button, button2);
                                                return;
                                        }
                                    }
                                });
                                button.setOnClickListener(new View.OnClickListener() { // from class: xm7
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        final boolean z18;
                                        boolean z19;
                                        boolean z20;
                                        int i7;
                                        if (dh5.this.A != jq1.OFF && (obj3.A || obj2.A)) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        zg5 zg5Var = obj4;
                                        boolean z21 = zg5Var.A;
                                        zg5 zg5Var2 = obj5;
                                        boolean z22 = zg5Var2.A;
                                        zg5 zg5Var3 = obj6;
                                        boolean z23 = zg5Var3.A;
                                        zg5 zg5Var4 = obj7;
                                        boolean z24 = zg5Var4.A;
                                        final jb7 jb7Var = new jb7(zg5Var, zg5Var2, zg5Var3, zg5Var4, 1);
                                        VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                        View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_fill_area, (ViewGroup) null);
                                        TextView textView3 = (TextView) inflate2.findViewById(R.id.textFillAreaDisabled);
                                        final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillEnabled);
                                        final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillHeight);
                                        final SwitchCompat switchCompat5 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillWidth);
                                        final SwitchCompat switchCompat6 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillEnabled);
                                        final SwitchCompat switchCompat7 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillHeight);
                                        final SwitchCompat switchCompat8 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillWidth);
                                        ((TextView) inflate2.findViewById(R.id.textFillAreaDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_fill_area_description));
                                        switchCompat4.setChecked(z21);
                                        switchCompat5.setChecked(z22);
                                        switchCompat7.setChecked(z23);
                                        switchCompat8.setChecked(z24);
                                        if (!z21 && !z22) {
                                            z19 = false;
                                        } else {
                                            z19 = true;
                                        }
                                        switchCompat3.setChecked(z19);
                                        if (!z23 && !z24) {
                                            z20 = false;
                                        } else {
                                            z20 = true;
                                        }
                                        switchCompat6.setChecked(z20);
                                        switchCompat3.setEnabled(z18);
                                        switchCompat6.setEnabled(z18);
                                        VideoPreferencesFragment.x(z18, switchCompat4, switchCompat5, switchCompat3.isChecked(), false);
                                        VideoPreferencesFragment.w(z18, switchCompat7, switchCompat8, switchCompat6.isChecked(), false);
                                        switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                int i8 = r4;
                                                SwitchCompat switchCompat9 = switchCompat5;
                                                SwitchCompat switchCompat10 = switchCompat4;
                                                boolean z26 = z18;
                                                switch (i8) {
                                                    case 0:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                        return;
                                                    default:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                        return;
                                                }
                                            }
                                        });
                                        switchCompat6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                int i8 = r4;
                                                SwitchCompat switchCompat9 = switchCompat8;
                                                SwitchCompat switchCompat10 = switchCompat7;
                                                boolean z26 = z18;
                                                switch (i8) {
                                                    case 0:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                        return;
                                                    default:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                        return;
                                                }
                                            }
                                        });
                                        textView3.getClass();
                                        if (!z18) {
                                            i7 = 0;
                                        } else {
                                            i7 = 8;
                                        }
                                        textView3.setVisibility(i7);
                                        zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                        zbVar3.z(R.string.dual_screen_fill_area_title);
                                        zbVar3.A(inflate2);
                                        zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: fn7
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i8) {
                                                boolean z25;
                                                boolean z26;
                                                boolean z27;
                                                boolean z28;
                                                boolean z29 = z18;
                                                boolean z30 = true;
                                                boolean z31 = false;
                                                if (z29 && switchCompat3.isChecked()) {
                                                    z25 = true;
                                                } else {
                                                    z25 = false;
                                                }
                                                if (!z29 || !switchCompat6.isChecked()) {
                                                    z30 = false;
                                                }
                                                if (z25) {
                                                    z26 = switchCompat4.isChecked();
                                                } else {
                                                    z26 = false;
                                                }
                                                Boolean valueOf = Boolean.valueOf(z26);
                                                if (z25) {
                                                    z27 = switchCompat5.isChecked();
                                                } else {
                                                    z27 = false;
                                                }
                                                Boolean valueOf2 = Boolean.valueOf(z27);
                                                if (z30) {
                                                    z28 = switchCompat7.isChecked();
                                                } else {
                                                    z28 = false;
                                                }
                                                Boolean valueOf3 = Boolean.valueOf(z28);
                                                if (z30) {
                                                    z31 = switchCompat8.isChecked();
                                                }
                                                jb7Var.l(valueOf, valueOf2, valueOf3, Boolean.valueOf(z31));
                                            }
                                        });
                                        zbVar3.x(R.string.cancel, null);
                                        zbVar3.B();
                                    }
                                });
                                button2.setOnClickListener(new View.OnClickListener() { // from class: ym7
                                    /* JADX WARN: Type inference failed for: r11v6, types: [dh5, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r12v3, types: [dh5, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r14v2, types: [dh5, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r7v4, types: [dh5, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r8v2, types: [zg5, java.lang.Object] */
                                    /* JADX WARN: Type inference failed for: r9v2, types: [zg5, java.lang.Object] */
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        p66 p66Var;
                                        p66 p66Var2;
                                        boolean z18;
                                        boolean z19;
                                        int i7;
                                        int i8;
                                        dh5 dh5Var = obj;
                                        jq1 jq1Var2 = (jq1) dh5Var.A;
                                        dh5 dh5Var2 = obj8;
                                        p66 p66Var3 = (p66) dh5Var2.A;
                                        dh5 dh5Var3 = obj9;
                                        p66 p66Var4 = (p66) dh5Var3.A;
                                        TextView textView3 = textView;
                                        VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                        ne4 ne4Var = new ne4(dh5Var2, dh5Var3, textView3, videoPreferencesFragment5, dh5Var, 8);
                                        View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_vertical_alignment, (ViewGroup) null);
                                        ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_description));
                                        ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDefaults)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_default_hint, videoPreferencesFragment5.m(lb4.r(jq1Var2)), videoPreferencesFragment5.m(lb4.q(jq1Var2))));
                                        final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalAlignmentOverride);
                                        final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalAlignmentOverride);
                                        RadioGroup radioGroup2 = (RadioGroup) inflate2.findViewById(R.id.radioGroupInternalAlignment);
                                        RadioGroup radioGroup3 = (RadioGroup) inflate2.findViewById(R.id.radioGroupExternalAlignment);
                                        p66 p66Var5 = p66.TOP;
                                        vr4 vr4Var = new vr4(p66Var5, inflate2.findViewById(R.id.radioInternalAlignmentTop));
                                        p66 p66Var6 = p66.CENTER;
                                        vr4 vr4Var2 = new vr4(p66Var6, inflate2.findViewById(R.id.radioInternalAlignmentCenter));
                                        p66 p66Var7 = p66.BOTTOM;
                                        final Map m02 = c14.m0(vr4Var, vr4Var2, new vr4(p66Var7, inflate2.findViewById(R.id.radioInternalAlignmentBottom)));
                                        final Map m03 = c14.m0(new vr4(p66Var5, inflate2.findViewById(R.id.radioExternalAlignmentTop)), new vr4(p66Var6, inflate2.findViewById(R.id.radioExternalAlignmentCenter)), new vr4(p66Var7, inflate2.findViewById(R.id.radioExternalAlignmentBottom)));
                                        final dh5 obj10 = new Object();
                                        if (p66Var3 == null) {
                                            p66Var = lb4.r(jq1Var2);
                                        } else {
                                            p66Var = p66Var3;
                                        }
                                        obj10.A = p66Var;
                                        final dh5 obj11 = new Object();
                                        if (p66Var4 == null) {
                                            p66Var2 = lb4.q(jq1Var2);
                                        } else {
                                            p66Var2 = p66Var4;
                                        }
                                        obj11.A = p66Var2;
                                        final dh5 obj12 = new Object();
                                        obj12.A = p66Var3;
                                        final dh5 obj13 = new Object();
                                        obj13.A = p66Var4;
                                        final zg5 obj14 = new Object();
                                        final zg5 obj15 = new Object();
                                        if (obj12.A != null) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        switchCompat3.setChecked(z18);
                                        if (obj13.A != null) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        switchCompat4.setChecked(z19);
                                        obj14.A = true;
                                        RadioButton radioButton = (RadioButton) m02.get(obj10.A);
                                        if (radioButton != null) {
                                            i7 = radioButton.getId();
                                        } else {
                                            i7 = R.id.radioInternalAlignmentTop;
                                        }
                                        radioGroup2.check(i7);
                                        obj14.A = false;
                                        obj15.A = true;
                                        RadioButton radioButton2 = (RadioButton) m03.get(obj11.A);
                                        if (radioButton2 != null) {
                                            i8 = radioButton2.getId();
                                        } else {
                                            i8 = R.id.radioExternalAlignmentTop;
                                        }
                                        radioGroup3.check(i8);
                                        obj15.A = false;
                                        VideoPreferencesFragment.C(m02.values(), switchCompat3.isChecked());
                                        VideoPreferencesFragment.C(m03.values(), switchCompat4.isChecked());
                                        switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                int i9 = r4;
                                                p66 p66Var8 = null;
                                                dh5 dh5Var4 = obj10;
                                                dh5 dh5Var5 = obj12;
                                                Map map = m02;
                                                switch (i9) {
                                                    case 0:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.C(map.values(), z20);
                                                        if (z20) {
                                                            p66Var8 = (p66) dh5Var4.A;
                                                        }
                                                        dh5Var5.A = p66Var8;
                                                        return;
                                                    default:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.C(map.values(), z20);
                                                        if (z20) {
                                                            p66Var8 = (p66) dh5Var4.A;
                                                        }
                                                        dh5Var5.A = p66Var8;
                                                        return;
                                                }
                                            }
                                        });
                                        switchCompat4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                int i9 = r4;
                                                p66 p66Var8 = null;
                                                dh5 dh5Var4 = obj11;
                                                dh5 dh5Var5 = obj13;
                                                Map map = m03;
                                                switch (i9) {
                                                    case 0:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.C(map.values(), z20);
                                                        if (z20) {
                                                            p66Var8 = (p66) dh5Var4.A;
                                                        }
                                                        dh5Var5.A = p66Var8;
                                                        return;
                                                    default:
                                                        compoundButton.getClass();
                                                        VideoPreferencesFragment.C(map.values(), z20);
                                                        if (z20) {
                                                            p66Var8 = (p66) dh5Var4.A;
                                                        }
                                                        dh5Var5.A = p66Var8;
                                                        return;
                                                }
                                            }
                                        });
                                        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                            @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                            public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                p66 p66Var8;
                                                p66 p66Var9;
                                                int i10 = r5;
                                                dh5 dh5Var4 = obj12;
                                                SwitchCompat switchCompat5 = switchCompat3;
                                                dh5 dh5Var5 = obj10;
                                                zg5 zg5Var = obj14;
                                                switch (i10) {
                                                    case 0:
                                                        radioGroup4.getClass();
                                                        if (!zg5Var.A) {
                                                            if (i9 == R.id.radioInternalAlignmentTop) {
                                                                p66Var8 = p66.TOP;
                                                            } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                p66Var8 = p66.CENTER;
                                                            } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                p66Var8 = p66.BOTTOM;
                                                            } else {
                                                                p66Var8 = p66.TOP;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            if (switchCompat5.isChecked()) {
                                                                dh5Var4.A = dh5Var5.A;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        radioGroup4.getClass();
                                                        if (!zg5Var.A) {
                                                            if (i9 == R.id.radioExternalAlignmentTop) {
                                                                p66Var9 = p66.TOP;
                                                            } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                p66Var9 = p66.CENTER;
                                                            } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                p66Var9 = p66.BOTTOM;
                                                            } else {
                                                                p66Var9 = p66.TOP;
                                                            }
                                                            dh5Var5.A = p66Var9;
                                                            if (switchCompat5.isChecked()) {
                                                                dh5Var4.A = dh5Var5.A;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                            @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                            public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                p66 p66Var8;
                                                p66 p66Var9;
                                                int i10 = r5;
                                                dh5 dh5Var4 = obj13;
                                                SwitchCompat switchCompat5 = switchCompat4;
                                                dh5 dh5Var5 = obj11;
                                                zg5 zg5Var = obj15;
                                                switch (i10) {
                                                    case 0:
                                                        radioGroup4.getClass();
                                                        if (!zg5Var.A) {
                                                            if (i9 == R.id.radioInternalAlignmentTop) {
                                                                p66Var8 = p66.TOP;
                                                            } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                p66Var8 = p66.CENTER;
                                                            } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                p66Var8 = p66.BOTTOM;
                                                            } else {
                                                                p66Var8 = p66.TOP;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            if (switchCompat5.isChecked()) {
                                                                dh5Var4.A = dh5Var5.A;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        radioGroup4.getClass();
                                                        if (!zg5Var.A) {
                                                            if (i9 == R.id.radioExternalAlignmentTop) {
                                                                p66Var9 = p66.TOP;
                                                            } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                p66Var9 = p66.CENTER;
                                                            } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                p66Var9 = p66.BOTTOM;
                                                            } else {
                                                                p66Var9 = p66.TOP;
                                                            }
                                                            dh5Var5.A = p66Var9;
                                                            if (switchCompat5.isChecked()) {
                                                                dh5Var4.A = dh5Var5.A;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                        zbVar3.z(R.string.dual_screen_vertical_alignment_title);
                                        zbVar3.A(inflate2);
                                        zbVar3.y(R.string.ok, new qu1(ne4Var, obj12, obj13, 6));
                                        zbVar3.x(R.string.cancel, null);
                                        zbVar3.B();
                                    }
                                });
                                zb zbVar3 = new zb(videoPreferencesFragment4.requireContext());
                                zbVar3.z(R.string.dual_screen_presets_settings_title);
                                zbVar3.A(inflate);
                                zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: zm7
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i7) {
                                        boolean z18;
                                        VideoPreferencesFragment videoPreferencesFragment5 = VideoPreferencesFragment.this;
                                        kd6 o = videoPreferencesFragment5.o();
                                        dh5 dh5Var = obj;
                                        jq1 jq1Var2 = (jq1) dh5Var.A;
                                        jq1Var2.getClass();
                                        SharedPreferences.Editor edit = ((ng6) o).b.edit();
                                        String lowerCase = jq1Var2.name().toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        edit.putString("dual_screen_preset", lowerCase);
                                        edit.apply();
                                        kd6 o2 = videoPreferencesFragment5.o();
                                        boolean z19 = obj2.A;
                                        SharedPreferences.Editor edit2 = ((ng6) o2).b.edit();
                                        edit2.putBoolean("external_display_keep_ratio", z19);
                                        edit2.apply();
                                        kd6 o3 = videoPreferencesFragment5.o();
                                        if (obj3.A && dh5Var.A != jq1.OFF) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        SharedPreferences.Editor edit3 = ((ng6) o3).b.edit();
                                        edit3.putBoolean("dual_screen_integer_scale", z18);
                                        edit3.apply();
                                        kd6 o4 = videoPreferencesFragment5.o();
                                        boolean z20 = obj4.A;
                                        SharedPreferences.Editor edit4 = ((ng6) o4).b.edit();
                                        edit4.putBoolean("dual_screen_internal_fill_height", z20);
                                        edit4.apply();
                                        kd6 o5 = videoPreferencesFragment5.o();
                                        boolean z21 = obj5.A;
                                        SharedPreferences.Editor edit5 = ((ng6) o5).b.edit();
                                        edit5.putBoolean("dual_screen_internal_fill_width", z21);
                                        edit5.apply();
                                        kd6 o6 = videoPreferencesFragment5.o();
                                        boolean z22 = obj6.A;
                                        SharedPreferences.Editor edit6 = ((ng6) o6).b.edit();
                                        edit6.putBoolean("dual_screen_external_fill_height", z22);
                                        edit6.apply();
                                        kd6 o7 = videoPreferencesFragment5.o();
                                        boolean z23 = obj7.A;
                                        SharedPreferences.Editor edit7 = ((ng6) o7).b.edit();
                                        edit7.putBoolean("dual_screen_external_fill_width", z23);
                                        edit7.apply();
                                        ((ng6) videoPreferencesFragment5.o()).N((p66) obj8.A);
                                        ((ng6) videoPreferencesFragment5.o()).M((p66) obj9.A);
                                        videoPreferencesFragment5.E();
                                    }
                                });
                                zbVar3.x(R.string.cancel, null);
                                zbVar3.B();
                                return;
                        }
                    }
                });
            }
            StoragePickerPreference storagePickerPreference2 = (StoragePickerPreference) findPreference("video_retroarch_shader_root");
            if (storagePickerPreference2 != null) {
                this.r0 = storagePickerPreference2;
                n().c(storagePickerPreference2, null);
                yh2.g(storagePickerPreference2, new x05(this) { // from class: wm7
                    public final /* synthetic */ VideoPreferencesFragment b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.x05
                    public final boolean a(Preference preference3, Object obj) {
                        SharedPreferences.Editor edit;
                        SharedPreferences.Editor remove;
                        int i5 = r2;
                        VideoPreferencesFragment videoPreferencesFragment = this.b;
                        switch (i5) {
                            case 0:
                                preference3.getClass();
                                if (!nb3.k(obj, Boolean.TRUE)) {
                                    ((InGameLockedSwitchPreference) preference3).e(false);
                                } else {
                                    zb zbVar = new zb(videoPreferencesFragment.requireContext());
                                    zbVar.z(R.string.video_vulkan_fastpath_warning_title);
                                    zbVar.w(R.string.video_vulkan_fastpath_warning_message);
                                    zbVar.y(R.string.video_vulkan_fastpath_enable_action, new ax(videoPreferencesFragment, preference3));
                                    zbVar.x(17039360, null);
                                    zbVar.B();
                                }
                                return false;
                            case 1:
                                preference3.getClass();
                                SharedPreferences d = videoPreferencesFragment.getPreferenceManager().d();
                                if (d != null && (edit = d.edit()) != null && (remove = edit.remove("video_retroarch_shader_preset")) != null) {
                                    remove.apply();
                                }
                                return true;
                            case 2:
                                preference3.getClass();
                                obj.getClass();
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                Preference findPreference3 = videoPreferencesFragment.findPreference("video_renderer_debug_bgobj_enabled");
                                if (findPreference3 != null) {
                                    findPreference3.setVisible(booleanValue);
                                }
                                Preference findPreference4 = videoPreferencesFragment.findPreference("video_renderer_debug_latch_trace_enabled");
                                if (findPreference4 != null) {
                                    findPreference4.setVisible(booleanValue);
                                }
                                return true;
                            default:
                                preference3.getClass();
                                obj.getClass();
                                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                                for (String str2 : hf.c0("video_conservative_coverage_px", "video_conservative_coverage_apply_repeat", "video_conservative_coverage_apply_clamp", "video_conservative_coverage_depth_bias")) {
                                    Preference findPreference5 = videoPreferencesFragment.findPreference(str2);
                                    if (findPreference5 != null) {
                                        findPreference5.setVisible(booleanValue2);
                                    }
                                }
                                return true;
                        }
                    }
                });
            }
            RetroArchShaderSource t = t();
            Preference preference3 = this.p0;
            if (preference3 != null) {
                if (t == RetroArchShaderSource.INTERNAL) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                preference3.setVisible(z8);
            }
            if (storagePickerPreference2 != null) {
                if (t != RetroArchShaderSource.FOLDER) {
                    z9 = false;
                }
                storagePickerPreference2.setVisible(z9);
            }
            H();
            ap6 ap6Var = this.x0;
            if (ap6Var != null) {
                ap6Var.h(null);
            }
            this.x0 = hv.L(bl2.C(this), null, null, new VideoPreferencesFragment$observeShaderInstallWork$1(this, null), 3);
            return;
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        this.v0 = new u63(requireContext, o());
        final boolean booleanExtra = requireActivity().getIntent().getBooleanExtra("in_game", false);
        Preference findPreference3 = findPreference("video_renderer");
        findPreference3.getClass();
        final InGameLockedListPreference inGameLockedListPreference2 = (InGameLockedListPreference) findPreference3;
        Preference findPreference4 = findPreference("video_internal_resolution");
        findPreference4.getClass();
        InGameLockedListPreference inGameLockedListPreference3 = (InGameLockedListPreference) findPreference4;
        for (InGameLockedListPreference inGameLockedListPreference4 : hf.c0(inGameLockedListPreference2, inGameLockedListPreference3)) {
            inGameLockedListPreference4.h0 = booleanExtra;
            inGameLockedListPreference4.i0 = R.string.video_setting_cannot_change_ingame;
        }
        Preference findPreference5 = findPreference("video_vulkan_fastpath_enabled");
        findPreference5.getClass();
        final InGameLockedSwitchPreference inGameLockedSwitchPreference = (InGameLockedSwitchPreference) findPreference5;
        inGameLockedSwitchPreference.e0 = booleanExtra;
        inGameLockedSwitchPreference.f0 = R.string.video_setting_cannot_change_ingame;
        inGameLockedSwitchPreference.setOnPreferenceChangeListener(new x05(this) { // from class: wm7
            public final /* synthetic */ VideoPreferencesFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.x05
            public final boolean a(Preference preference32, Object obj) {
                SharedPreferences.Editor edit;
                SharedPreferences.Editor remove;
                int i5 = r2;
                VideoPreferencesFragment videoPreferencesFragment = this.b;
                switch (i5) {
                    case 0:
                        preference32.getClass();
                        if (!nb3.k(obj, Boolean.TRUE)) {
                            ((InGameLockedSwitchPreference) preference32).e(false);
                        } else {
                            zb zbVar = new zb(videoPreferencesFragment.requireContext());
                            zbVar.z(R.string.video_vulkan_fastpath_warning_title);
                            zbVar.w(R.string.video_vulkan_fastpath_warning_message);
                            zbVar.y(R.string.video_vulkan_fastpath_enable_action, new ax(videoPreferencesFragment, preference32));
                            zbVar.x(17039360, null);
                            zbVar.B();
                        }
                        return false;
                    case 1:
                        preference32.getClass();
                        SharedPreferences d = videoPreferencesFragment.getPreferenceManager().d();
                        if (d != null && (edit = d.edit()) != null && (remove = edit.remove("video_retroarch_shader_preset")) != null) {
                            remove.apply();
                        }
                        return true;
                    case 2:
                        preference32.getClass();
                        obj.getClass();
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        Preference findPreference32 = videoPreferencesFragment.findPreference("video_renderer_debug_bgobj_enabled");
                        if (findPreference32 != null) {
                            findPreference32.setVisible(booleanValue);
                        }
                        Preference findPreference42 = videoPreferencesFragment.findPreference("video_renderer_debug_latch_trace_enabled");
                        if (findPreference42 != null) {
                            findPreference42.setVisible(booleanValue);
                        }
                        return true;
                    default:
                        preference32.getClass();
                        obj.getClass();
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        for (String str2 : hf.c0("video_conservative_coverage_px", "video_conservative_coverage_apply_repeat", "video_conservative_coverage_apply_clamp", "video_conservative_coverage_depth_bias")) {
                            Preference findPreference52 = videoPreferencesFragment.findPreference(str2);
                            if (findPreference52 != null) {
                                findPreference52.setVisible(booleanValue2);
                            }
                        }
                        return true;
                }
            }
        });
        Preference findPreference6 = findPreference("enable_threaded_rendering");
        findPreference6.getClass();
        this.i0.add(findPreference6);
        ArrayList arrayList = this.j0;
        arrayList.add(inGameLockedListPreference3);
        Preference findPreference7 = findPreference("video_hacks_category");
        findPreference7.getClass();
        arrayList.add(findPreference7);
        Preference findPreference8 = findPreference("video_debug_3d_clear_magenta");
        findPreference8.getClass();
        arrayList.add(findPreference8);
        Preference findPreference9 = findPreference("video_hacks_category");
        findPreference9.getClass();
        ArrayList arrayList2 = this.l0;
        arrayList2.add(findPreference9);
        Preference findPreference10 = findPreference("video_renderer_debug_tools_enabled");
        findPreference10.getClass();
        arrayList2.add(findPreference10);
        Preference findPreference11 = findPreference("video_renderer_debug_bgobj_enabled");
        findPreference11.getClass();
        arrayList2.add(findPreference11);
        Preference findPreference12 = findPreference("video_renderer_debug_latch_trace_enabled");
        findPreference12.getClass();
        arrayList2.add(findPreference12);
        this.k0.add(inGameLockedSwitchPreference);
        Preference findPreference13 = findPreference("video_conservative_coverage_enabled");
        findPreference13.getClass();
        ArrayList arrayList3 = this.m0;
        arrayList3.add(findPreference13);
        Preference findPreference14 = findPreference("video_conservative_coverage_px");
        findPreference14.getClass();
        arrayList3.add(findPreference14);
        Preference findPreference15 = findPreference("video_conservative_coverage_apply_repeat");
        findPreference15.getClass();
        arrayList3.add(findPreference15);
        Preference findPreference16 = findPreference("video_conservative_coverage_apply_clamp");
        findPreference16.getClass();
        arrayList3.add(findPreference16);
        Preference findPreference17 = findPreference("video_conservative_coverage_depth_bias");
        findPreference17.getClass();
        arrayList3.add(findPreference17);
        SwitchPreference switchPreference = (SwitchPreference) findPreference("video_renderer_debug_tools_enabled");
        if (switchPreference != null) {
            switchPreference.setOnPreferenceChangeListener(new x05(this) { // from class: wm7
                public final /* synthetic */ VideoPreferencesFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.x05
                public final boolean a(Preference preference32, Object obj) {
                    SharedPreferences.Editor edit;
                    SharedPreferences.Editor remove;
                    int i5 = r2;
                    VideoPreferencesFragment videoPreferencesFragment = this.b;
                    switch (i5) {
                        case 0:
                            preference32.getClass();
                            if (!nb3.k(obj, Boolean.TRUE)) {
                                ((InGameLockedSwitchPreference) preference32).e(false);
                            } else {
                                zb zbVar = new zb(videoPreferencesFragment.requireContext());
                                zbVar.z(R.string.video_vulkan_fastpath_warning_title);
                                zbVar.w(R.string.video_vulkan_fastpath_warning_message);
                                zbVar.y(R.string.video_vulkan_fastpath_enable_action, new ax(videoPreferencesFragment, preference32));
                                zbVar.x(17039360, null);
                                zbVar.B();
                            }
                            return false;
                        case 1:
                            preference32.getClass();
                            SharedPreferences d = videoPreferencesFragment.getPreferenceManager().d();
                            if (d != null && (edit = d.edit()) != null && (remove = edit.remove("video_retroarch_shader_preset")) != null) {
                                remove.apply();
                            }
                            return true;
                        case 2:
                            preference32.getClass();
                            obj.getClass();
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            Preference findPreference32 = videoPreferencesFragment.findPreference("video_renderer_debug_bgobj_enabled");
                            if (findPreference32 != null) {
                                findPreference32.setVisible(booleanValue);
                            }
                            Preference findPreference42 = videoPreferencesFragment.findPreference("video_renderer_debug_latch_trace_enabled");
                            if (findPreference42 != null) {
                                findPreference42.setVisible(booleanValue);
                            }
                            return true;
                        default:
                            preference32.getClass();
                            obj.getClass();
                            boolean booleanValue2 = ((Boolean) obj).booleanValue();
                            for (String str2 : hf.c0("video_conservative_coverage_px", "video_conservative_coverage_apply_repeat", "video_conservative_coverage_apply_clamp", "video_conservative_coverage_depth_bias")) {
                                Preference findPreference52 = videoPreferencesFragment.findPreference(str2);
                                if (findPreference52 != null) {
                                    findPreference52.setVisible(booleanValue2);
                                }
                            }
                            return true;
                    }
                }
            });
        }
        SwitchPreference switchPreference2 = (SwitchPreference) findPreference("video_conservative_coverage_enabled");
        if (switchPreference2 != null) {
            switchPreference2.setOnPreferenceChangeListener(new x05(this) { // from class: wm7
                public final /* synthetic */ VideoPreferencesFragment b;

                {
                    this.b = this;
                }

                @Override // defpackage.x05
                public final boolean a(Preference preference32, Object obj) {
                    SharedPreferences.Editor edit;
                    SharedPreferences.Editor remove;
                    int i5 = r2;
                    VideoPreferencesFragment videoPreferencesFragment = this.b;
                    switch (i5) {
                        case 0:
                            preference32.getClass();
                            if (!nb3.k(obj, Boolean.TRUE)) {
                                ((InGameLockedSwitchPreference) preference32).e(false);
                            } else {
                                zb zbVar = new zb(videoPreferencesFragment.requireContext());
                                zbVar.z(R.string.video_vulkan_fastpath_warning_title);
                                zbVar.w(R.string.video_vulkan_fastpath_warning_message);
                                zbVar.y(R.string.video_vulkan_fastpath_enable_action, new ax(videoPreferencesFragment, preference32));
                                zbVar.x(17039360, null);
                                zbVar.B();
                            }
                            return false;
                        case 1:
                            preference32.getClass();
                            SharedPreferences d = videoPreferencesFragment.getPreferenceManager().d();
                            if (d != null && (edit = d.edit()) != null && (remove = edit.remove("video_retroarch_shader_preset")) != null) {
                                remove.apply();
                            }
                            return true;
                        case 2:
                            preference32.getClass();
                            obj.getClass();
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            Preference findPreference32 = videoPreferencesFragment.findPreference("video_renderer_debug_bgobj_enabled");
                            if (findPreference32 != null) {
                                findPreference32.setVisible(booleanValue);
                            }
                            Preference findPreference42 = videoPreferencesFragment.findPreference("video_renderer_debug_latch_trace_enabled");
                            if (findPreference42 != null) {
                                findPreference42.setVisible(booleanValue);
                            }
                            return true;
                        default:
                            preference32.getClass();
                            obj.getClass();
                            boolean booleanValue2 = ((Boolean) obj).booleanValue();
                            for (String str2 : hf.c0("video_conservative_coverage_px", "video_conservative_coverage_apply_repeat", "video_conservative_coverage_apply_clamp", "video_conservative_coverage_depth_bias")) {
                                Preference findPreference52 = videoPreferencesFragment.findPreference(str2);
                                if (findPreference52 != null) {
                                    findPreference52.setVisible(booleanValue2);
                                }
                            }
                            return true;
                    }
                }
            });
        }
        Preference findPreference18 = findPreference("video_filtering");
        findPreference18.getClass();
        InGameLockedListPreference inGameLockedListPreference5 = (InGameLockedListPreference) findPreference18;
        if (booleanExtra && requireActivity().getIntent().getBooleanExtra("lock_video_filtering", false)) {
            z = true;
        } else {
            z = false;
        }
        inGameLockedListPreference5.h0 = z;
        inGameLockedListPreference5.i0 = R.string.cannot_change_use_rom_settings;
        Preference findPreference19 = findPreference("dsi_camera_source");
        findPreference19.getClass();
        ListPreference listPreference = (ListPreference) findPreference19;
        Preference findPreference20 = findPreference("dsi_camera_static_image");
        findPreference20.getClass();
        StoragePickerPreference storagePickerPreference3 = (StoragePickerPreference) findPreference20;
        Preference findPreference21 = findPreference("video_retroarch_shader_root");
        findPreference21.getClass();
        StoragePickerPreference storagePickerPreference4 = (StoragePickerPreference) findPreference21;
        Preference findPreference22 = findPreference("video_retroarch_shader_preset");
        findPreference22.getClass();
        final ListPreference listPreference2 = (ListPreference) findPreference22;
        final EditTextPreference editTextPreference = (EditTextPreference) findPreference("video_retroarch_shader_parameters");
        final SwitchPreference switchPreference3 = (SwitchPreference) findPreference("video_retroarch_shader_clear_history");
        Preference findPreference23 = findPreference("video_vulkan_driver_category");
        findPreference23.getClass();
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) findPreference23;
        Preference findPreference24 = findPreference("video_vulkan_driver_manager");
        Preference findPreference25 = findPreference("video_vulkan_driver_mode");
        findPreference25.getClass();
        final ListPreference listPreference3 = (ListPreference) findPreference25;
        final Preference findPreference26 = findPreference("video_vulkan_driver_import");
        findPreference26.getClass();
        final Preference findPreference27 = findPreference("video_vulkan_driver_remove");
        findPreference27.getClass();
        Preference findPreference28 = findPreference("dual_screen_presets");
        findPreference28.getClass();
        this.n0 = findPreference28;
        final String[] stringArray = getResources().getStringArray(R.array.video_filtering_values);
        stringArray.getClass();
        final String[] stringArray2 = getResources().getStringArray(R.array.video_filtering_options);
        stringArray2.getClass();
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        ActivityManager activityManager = (ActivityManager) requireContext2.getSystemService(ActivityManager.class);
        if (activityManager != null && (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) != null) {
            i = deviceConfigurationInfo.reqGlEsVersion;
        } else {
            i = 0;
        }
        if (i >= 196610) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            z3 = z2;
            inGameLockedListPreference = inGameLockedListPreference5;
            if (xs6.Z(Build.HARDWARE, "qcom", true)) {
                z4 = true;
                if (!z3 && z4) {
                    preferenceCategory = preferenceCategory2;
                    preference = findPreference24;
                    storagePickerPreference = storagePickerPreference4;
                } else {
                    String[] stringArray3 = inGameLockedListPreference2.getContext().getResources().getStringArray(R.array.video_renderer_values);
                    stringArray3.getClass();
                    z5 = z4;
                    String[] stringArray4 = inGameLockedListPreference2.getContext().getResources().getStringArray(R.array.video_renderer_options);
                    stringArray4.getClass();
                    X0 = fv.X0(stringArray3, stringArray4);
                    ArrayList arrayList4 = new ArrayList();
                    size = X0.size();
                    preferenceCategory = preferenceCategory2;
                    preference = findPreference24;
                    i2 = 0;
                    while (true) {
                        storagePickerPreference = storagePickerPreference4;
                        if (i2 < size) {
                            break;
                        }
                        int i5 = size;
                        Object obj = X0.get(i2);
                        i2++;
                        ArrayList arrayList5 = X0;
                        String str2 = (String) ((vr4) obj).A;
                        if ((z3 || !nb3.k(str2, "opengl")) && (z5 || !nb3.k(str2, "compute"))) {
                            arrayList4.add(obj);
                        }
                        storagePickerPreference4 = storagePickerPreference;
                        size = i5;
                        X0 = arrayList5;
                    }
                    ArrayList arrayList6 = new ArrayList(ht0.v0(arrayList4, 10));
                    size2 = arrayList4.size();
                    for (i3 = 0; i3 < size2; i3++) {
                        arrayList6.add((String) ((vr4) arrayList4.get(i3)).A);
                    }
                    inGameLockedListPreference2.d0 = (CharSequence[]) arrayList6.toArray(new String[0]);
                    ArrayList arrayList7 = new ArrayList(ht0.v0(arrayList4, 10));
                    size3 = arrayList4.size();
                    i4 = 0;
                    while (i4 < size3) {
                        Object obj2 = arrayList4.get(i4);
                        i4++;
                        arrayList7.add((String) ((vr4) obj2).B);
                        arrayList4 = arrayList4;
                    }
                    inGameLockedListPreference2.Z = (CharSequence[]) arrayList7.toArray(new String[0]);
                    if (z3) {
                        z6 = true;
                        if (xs6.Z(inGameLockedListPreference2.e0, "opengl", true)) {
                            inGameLockedListPreference2.h("software");
                        }
                    } else {
                        z6 = true;
                    }
                    if (!z5 && xs6.Z(inGameLockedListPreference2.e0, "compute", z6)) {
                        inGameLockedListPreference2.h("software");
                    }
                }
                final InGameLockedListPreference inGameLockedListPreference6 = inGameLockedListPreference;
                final PreferenceCategory preferenceCategory3 = preferenceCategory;
                final Preference preference4 = preference;
                final StoragePickerPreference storagePickerPreference5 = storagePickerPreference;
                inGameLockedListPreference2.setOnPreferenceChangeListener(new x05(inGameLockedListPreference6, storagePickerPreference5, listPreference2, editTextPreference, switchPreference3, stringArray, stringArray2, preferenceCategory3, preference4, listPreference3, findPreference26, findPreference27, booleanExtra, inGameLockedSwitchPreference) { // from class: gn7
                    public final /* synthetic */ InGameLockedListPreference b;
                    public final /* synthetic */ StoragePickerPreference c;
                    public final /* synthetic */ ListPreference d;
                    public final /* synthetic */ EditTextPreference e;
                    public final /* synthetic */ SwitchPreference f;
                    public final /* synthetic */ String[] g;
                    public final /* synthetic */ String[] h;
                    public final /* synthetic */ PreferenceCategory i;
                    public final /* synthetic */ Preference j;
                    public final /* synthetic */ ListPreference k;
                    public final /* synthetic */ Preference l;
                    public final /* synthetic */ boolean m;
                    public final /* synthetic */ InGameLockedSwitchPreference n;

                    {
                        this.l = findPreference27;
                        this.m = booleanExtra;
                        this.n = inGameLockedSwitchPreference;
                    }

                    @Override // defpackage.x05
                    public final boolean a(Preference preference5, Object obj3) {
                        preference5.getClass();
                        obj3.getClass();
                        String str3 = (String) obj3;
                        VideoRenderer videoRenderer = (VideoRenderer) jw2.o(str3, VideoRenderer.values());
                        VideoRenderer videoRenderer2 = VideoRenderer.VULKAN;
                        VideoPreferencesFragment videoPreferencesFragment = VideoPreferencesFragment.this;
                        if (videoRenderer == videoRenderer2) {
                            kd6 o = videoPreferencesFragment.o();
                            String str4 = videoPreferencesFragment.requireContext().getApplicationInfo().nativeLibraryDir;
                            str4.getClass();
                            yq7 z10 = ((ng6) o).z(str4);
                            MelonDSAndroidInterface melonDSAndroidInterface = MelonDSAndroidInterface.a;
                            melonDSAndroidInterface.b(z10);
                            if (!melonDSAndroidInterface.c()) {
                                zb zbVar = new zb(videoPreferencesFragment.requireContext());
                                zbVar.z(R.string.renderer_init_failed_title);
                                ((wb) zbVar.L).f = videoPreferencesFragment.getString(R.string.renderer_init_failed_message, "Vulkan");
                                zbVar.y(R.string.ok, null);
                                zbVar.B();
                                return false;
                            }
                        }
                        videoPreferencesFragment.q(str3, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                        videoPreferencesFragment.J(videoRenderer, this.i, this.j, this.k, this.l, this.m);
                        if (videoRenderer != videoRenderer2) {
                            InGameLockedSwitchPreference inGameLockedSwitchPreference2 = this.n;
                            if (inGameLockedSwitchPreference2.A) {
                                inGameLockedSwitchPreference2.e(false);
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                });
                listPreference.setOnPreferenceChangeListener(new zw(this, storagePickerPreference3));
                preference2 = this.n0;
                if (preference2 == null) {
                    preference2.setOnPreferenceClickListener(new y05(this) { // from class: om7
                        public final /* synthetic */ VideoPreferencesFragment B;

                        {
                            this.B = this;
                        }

                        /* JADX WARN: Type inference failed for: r10v4, types: [dh5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r1v15, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r2v28, types: [dh5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r3v14, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v22, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r6v6, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r7v6, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v6, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v5, types: [dh5, java.lang.Object] */
                        @Override // defpackage.y05
                        public final void i(Preference preference32) {
                            RandomAccess randomAccess;
                            final List yt1Var;
                            String P0;
                            boolean z10;
                            switch (r2) {
                                case 0:
                                    this.B.B();
                                    return;
                                case 1:
                                    VideoPreferencesFragment videoPreferencesFragment = this.B;
                                    if (videoPreferencesFragment.p().d() != null) {
                                        Context requireContext3 = videoPreferencesFragment.requireContext();
                                        requireContext3.getClass();
                                        String[] strArr = {videoPreferencesFragment.getString(R.string.video_retroarch_shader_check_updates), videoPreferencesFragment.getString(R.string.video_retroarch_shader_reinstall), videoPreferencesFragment.getString(R.string.video_retroarch_shader_uninstall)};
                                        zb zbVar = new zb(requireContext3);
                                        zbVar.z(R.string.video_retroarch_shader_installed_title);
                                        zbVar.v(strArr, new k(videoPreferencesFragment, 0));
                                        zbVar.x(17039360, null);
                                        zbVar.B();
                                        return;
                                    }
                                    videoPreferencesFragment.D();
                                    return;
                                case 2:
                                    final VideoPreferencesFragment videoPreferencesFragment2 = this.B;
                                    ae6 ae6Var = videoPreferencesFragment2.h0;
                                    if (ae6Var != null) {
                                        synchronized (ae6Var) {
                                            try {
                                                if (ae6Var.a.isFile()) {
                                                    randomAccess = jc2.A0(ae6Var.a);
                                                } else {
                                                    randomAccess = yt1.A;
                                                }
                                                RandomAccess randomAccess2 = yt1.A;
                                                boolean z11 = randomAccess instanceof em5;
                                                RandomAccess randomAccess3 = randomAccess;
                                                if (z11) {
                                                    randomAccess3 = randomAccess2;
                                                }
                                                yt1Var = (List) randomAccess3;
                                            }
                                        }
                                        if (yt1Var.isEmpty()) {
                                            P0 = videoPreferencesFragment2.getString(R.string.shader_compatibility_report_empty);
                                        } else {
                                            P0 = gt0.P0(new l14(yt1Var), "\n\n", null, null, null, 62);
                                        }
                                        P0.getClass();
                                        zb zbVar2 = new zb(videoPreferencesFragment2.requireContext());
                                        zbVar2.z(R.string.shader_compatibility_report_title);
                                        ((wb) zbVar2.L).f = P0;
                                        zbVar2.y(17039370, null);
                                        if (!yt1Var.isEmpty()) {
                                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: me.magnum.melonds.ui.settings.fragments.j
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i52) {
                                                    VideoPreferencesFragment videoPreferencesFragment3 = VideoPreferencesFragment.this;
                                                    Uri uri = (Uri) fv.E0(((ng6) videoPreferencesFragment3.o()).r());
                                                    if (uri == null) {
                                                        Toast.makeText(videoPreferencesFragment3.requireContext(), (int) R.string.shader_compatibility_report_no_rom_folder, 1).show();
                                                    } else {
                                                        hv.L(bl2.C(videoPreferencesFragment3), null, null, new VideoPreferencesFragment$saveShaderCompatibilityLog$1(videoPreferencesFragment3, uri, yt1Var, null), 3);
                                                    }
                                                }
                                            };
                                            wb wbVar = (wb) zbVar2.L;
                                            wbVar.k = wbVar.a.getText(R.string.shader_compatibility_report_save);
                                            wbVar.l = onClickListener;
                                            zbVar2.x(R.string.shader_compatibility_report_clear, new rm7(videoPreferencesFragment2, 2));
                                        }
                                        zbVar2.B();
                                        return;
                                    }
                                    nb3.a0("shaderCompatibilityLog");
                                    throw null;
                                case 3:
                                    VideoPreferencesFragment videoPreferencesFragment3 = this.B;
                                    videoPreferencesFragment3.startActivity(new Intent(videoPreferencesFragment3.requireContext(), VulkanDriverManagerActivity.class));
                                    return;
                                case 4:
                                    this.B.C0.a(new String[]{"application/zip", "application/x-zip-compressed", "application/octet-stream", "application/x-compressed"});
                                    return;
                                default:
                                    final VideoPreferencesFragment videoPreferencesFragment4 = this.B;
                                    jq1 i52 = ((ng6) videoPreferencesFragment4.o()).i();
                                    boolean z12 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("external_display_keep_ratio", true);
                                    boolean z13 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_integer_scale", false);
                                    boolean z14 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_height", false);
                                    boolean z15 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_width", false);
                                    boolean z16 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_height", false);
                                    boolean z17 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_width", false);
                                    p66 h = ((ng6) videoPreferencesFragment4.o()).h();
                                    p66 g = ((ng6) videoPreferencesFragment4.o()).g();
                                    View inflate = LayoutInflater.from(videoPreferencesFragment4.requireContext()).inflate(R.layout.dialog_dual_screen_presets, (ViewGroup) null);
                                    RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupPresets);
                                    final SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.switchKeepAspectRatio);
                                    final SwitchCompat switchCompat2 = (SwitchCompat) inflate.findViewById(R.id.switchIntegerScale);
                                    final Button button = (Button) inflate.findViewById(R.id.buttonFillAreaOptions);
                                    final Button button2 = (Button) inflate.findViewById(R.id.buttonVerticalAlignmentOptions);
                                    final TextView textView = (TextView) inflate.findViewById(R.id.textVerticalAlignmentSummary);
                                    final TextView textView2 = (TextView) inflate.findViewById(R.id.textPresetsDisabledHint);
                                    jq1 jq1Var = jq1.OFF;
                                    int i6 = R.id.radioPresetOff;
                                    final Map m0 = c14.m0(new vr4(jq1Var, Integer.valueOf((int) R.id.radioPresetOff)), new vr4(jq1.INTERNAL_TOP_EXTERNAL_BOTTOM, Integer.valueOf((int) R.id.radioPresetInternalTopExternalBottom)), new vr4(jq1.INTERNAL_BOTTOM_EXTERNAL_TOP, Integer.valueOf((int) R.id.radioPresetInternalBottomExternalTop)));
                                    final dh5 obj3 = new Object();
                                    obj3.A = i52;
                                    final zg5 obj22 = new Object();
                                    obj22.A = z12;
                                    final zg5 obj32 = new Object();
                                    if (z13 && i52 != jq1Var) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    obj32.A = z10;
                                    final zg5 obj4 = new Object();
                                    obj4.A = z14;
                                    final zg5 obj5 = new Object();
                                    obj5.A = z15;
                                    final zg5 obj6 = new Object();
                                    obj6.A = z16;
                                    final zg5 obj7 = new Object();
                                    obj7.A = z17;
                                    final dh5 obj8 = new Object();
                                    obj8.A = h;
                                    final dh5 obj9 = new Object();
                                    obj9.A = g;
                                    Integer num = (Integer) m0.get(i52);
                                    if (num != null) {
                                        i6 = num.intValue();
                                    }
                                    radioGroup.check(i6);
                                    switchCompat.setChecked(obj22.A);
                                    switchCompat2.setChecked(obj32.A);
                                    VideoPreferencesFragment.v(obj3, obj8, obj9, textView, videoPreferencesFragment4);
                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj32, obj22, button, button2);
                                    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: um7
                                        @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                        public final void onCheckedChanged(RadioGroup radioGroup2, int i7) {
                                            Object obj10;
                                            jq1 jq1Var2;
                                            radioGroup2.getClass();
                                            Iterator it = m0.entrySet().iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj10 = it.next();
                                                    if (((Number) ((Map.Entry) obj10).getValue()).intValue() == i7) {
                                                        break;
                                                    }
                                                } else {
                                                    obj10 = null;
                                                    break;
                                                }
                                            }
                                            Map.Entry entry = (Map.Entry) obj10;
                                            if (entry != null && (jq1Var2 = (jq1) entry.getKey()) != null) {
                                                dh5 dh5Var = obj3;
                                                dh5Var.A = jq1Var2;
                                                jq1 jq1Var3 = jq1.OFF;
                                                SwitchCompat switchCompat3 = switchCompat2;
                                                zg5 zg5Var = obj32;
                                                if (jq1Var2 == jq1Var3) {
                                                    switchCompat3.setChecked(false);
                                                    zg5Var.A = false;
                                                }
                                                VideoPreferencesFragment.u(dh5Var, textView2, switchCompat, switchCompat3, zg5Var, obj22, button, button2);
                                                VideoPreferencesFragment.v(dh5Var, obj8, obj9, textView, videoPreferencesFragment4);
                                            }
                                        }
                                    });
                                    switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                            switch (r9) {
                                                case 0:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var = obj22;
                                                    zg5Var.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj32, zg5Var, button, button2);
                                                    return;
                                                default:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var2 = obj22;
                                                    zg5Var2.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, zg5Var2, obj32, button, button2);
                                                    return;
                                            }
                                        }
                                    });
                                    switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                            switch (r9) {
                                                case 0:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var = obj32;
                                                    zg5Var.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj22, zg5Var, button, button2);
                                                    return;
                                                default:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var2 = obj32;
                                                    zg5Var2.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, zg5Var2, obj22, button, button2);
                                                    return;
                                            }
                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() { // from class: xm7
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            final boolean z18;
                                            boolean z19;
                                            boolean z20;
                                            int i7;
                                            if (dh5.this.A != jq1.OFF && (obj32.A || obj22.A)) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            zg5 zg5Var = obj4;
                                            boolean z21 = zg5Var.A;
                                            zg5 zg5Var2 = obj5;
                                            boolean z22 = zg5Var2.A;
                                            zg5 zg5Var3 = obj6;
                                            boolean z23 = zg5Var3.A;
                                            zg5 zg5Var4 = obj7;
                                            boolean z24 = zg5Var4.A;
                                            final jb7 jb7Var = new jb7(zg5Var, zg5Var2, zg5Var3, zg5Var4, 1);
                                            VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                            View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_fill_area, (ViewGroup) null);
                                            TextView textView3 = (TextView) inflate2.findViewById(R.id.textFillAreaDisabled);
                                            final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillEnabled);
                                            final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillHeight);
                                            final SwitchCompat switchCompat5 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillWidth);
                                            final SwitchCompat switchCompat6 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillEnabled);
                                            final SwitchCompat switchCompat7 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillHeight);
                                            final SwitchCompat switchCompat8 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillWidth);
                                            ((TextView) inflate2.findViewById(R.id.textFillAreaDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_fill_area_description));
                                            switchCompat4.setChecked(z21);
                                            switchCompat5.setChecked(z22);
                                            switchCompat7.setChecked(z23);
                                            switchCompat8.setChecked(z24);
                                            if (!z21 && !z22) {
                                                z19 = false;
                                            } else {
                                                z19 = true;
                                            }
                                            switchCompat3.setChecked(z19);
                                            if (!z23 && !z24) {
                                                z20 = false;
                                            } else {
                                                z20 = true;
                                            }
                                            switchCompat6.setChecked(z20);
                                            switchCompat3.setEnabled(z18);
                                            switchCompat6.setEnabled(z18);
                                            VideoPreferencesFragment.x(z18, switchCompat4, switchCompat5, switchCompat3.isChecked(), false);
                                            VideoPreferencesFragment.w(z18, switchCompat7, switchCompat8, switchCompat6.isChecked(), false);
                                            switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                    int i8 = r4;
                                                    SwitchCompat switchCompat9 = switchCompat5;
                                                    SwitchCompat switchCompat10 = switchCompat4;
                                                    boolean z26 = z18;
                                                    switch (i8) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                    }
                                                }
                                            });
                                            switchCompat6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                    int i8 = r4;
                                                    SwitchCompat switchCompat9 = switchCompat8;
                                                    SwitchCompat switchCompat10 = switchCompat7;
                                                    boolean z26 = z18;
                                                    switch (i8) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                    }
                                                }
                                            });
                                            textView3.getClass();
                                            if (!z18) {
                                                i7 = 0;
                                            } else {
                                                i7 = 8;
                                            }
                                            textView3.setVisibility(i7);
                                            zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                            zbVar3.z(R.string.dual_screen_fill_area_title);
                                            zbVar3.A(inflate2);
                                            zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: fn7
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i8) {
                                                    boolean z25;
                                                    boolean z26;
                                                    boolean z27;
                                                    boolean z28;
                                                    boolean z29 = z18;
                                                    boolean z30 = true;
                                                    boolean z31 = false;
                                                    if (z29 && switchCompat3.isChecked()) {
                                                        z25 = true;
                                                    } else {
                                                        z25 = false;
                                                    }
                                                    if (!z29 || !switchCompat6.isChecked()) {
                                                        z30 = false;
                                                    }
                                                    if (z25) {
                                                        z26 = switchCompat4.isChecked();
                                                    } else {
                                                        z26 = false;
                                                    }
                                                    Boolean valueOf = Boolean.valueOf(z26);
                                                    if (z25) {
                                                        z27 = switchCompat5.isChecked();
                                                    } else {
                                                        z27 = false;
                                                    }
                                                    Boolean valueOf2 = Boolean.valueOf(z27);
                                                    if (z30) {
                                                        z28 = switchCompat7.isChecked();
                                                    } else {
                                                        z28 = false;
                                                    }
                                                    Boolean valueOf3 = Boolean.valueOf(z28);
                                                    if (z30) {
                                                        z31 = switchCompat8.isChecked();
                                                    }
                                                    jb7Var.l(valueOf, valueOf2, valueOf3, Boolean.valueOf(z31));
                                                }
                                            });
                                            zbVar3.x(R.string.cancel, null);
                                            zbVar3.B();
                                        }
                                    });
                                    button2.setOnClickListener(new View.OnClickListener() { // from class: ym7
                                        /* JADX WARN: Type inference failed for: r11v6, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r12v3, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r14v2, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r7v4, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r8v2, types: [zg5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r9v2, types: [zg5, java.lang.Object] */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            p66 p66Var;
                                            p66 p66Var2;
                                            boolean z18;
                                            boolean z19;
                                            int i7;
                                            int i8;
                                            dh5 dh5Var = obj3;
                                            jq1 jq1Var2 = (jq1) dh5Var.A;
                                            dh5 dh5Var2 = obj8;
                                            p66 p66Var3 = (p66) dh5Var2.A;
                                            dh5 dh5Var3 = obj9;
                                            p66 p66Var4 = (p66) dh5Var3.A;
                                            TextView textView3 = textView;
                                            VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                            ne4 ne4Var = new ne4(dh5Var2, dh5Var3, textView3, videoPreferencesFragment5, dh5Var, 8);
                                            View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_vertical_alignment, (ViewGroup) null);
                                            ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_description));
                                            ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDefaults)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_default_hint, videoPreferencesFragment5.m(lb4.r(jq1Var2)), videoPreferencesFragment5.m(lb4.q(jq1Var2))));
                                            final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalAlignmentOverride);
                                            final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalAlignmentOverride);
                                            RadioGroup radioGroup2 = (RadioGroup) inflate2.findViewById(R.id.radioGroupInternalAlignment);
                                            RadioGroup radioGroup3 = (RadioGroup) inflate2.findViewById(R.id.radioGroupExternalAlignment);
                                            p66 p66Var5 = p66.TOP;
                                            vr4 vr4Var = new vr4(p66Var5, inflate2.findViewById(R.id.radioInternalAlignmentTop));
                                            p66 p66Var6 = p66.CENTER;
                                            vr4 vr4Var2 = new vr4(p66Var6, inflate2.findViewById(R.id.radioInternalAlignmentCenter));
                                            p66 p66Var7 = p66.BOTTOM;
                                            final Map m02 = c14.m0(vr4Var, vr4Var2, new vr4(p66Var7, inflate2.findViewById(R.id.radioInternalAlignmentBottom)));
                                            final Map m03 = c14.m0(new vr4(p66Var5, inflate2.findViewById(R.id.radioExternalAlignmentTop)), new vr4(p66Var6, inflate2.findViewById(R.id.radioExternalAlignmentCenter)), new vr4(p66Var7, inflate2.findViewById(R.id.radioExternalAlignmentBottom)));
                                            final dh5 obj10 = new Object();
                                            if (p66Var3 == null) {
                                                p66Var = lb4.r(jq1Var2);
                                            } else {
                                                p66Var = p66Var3;
                                            }
                                            obj10.A = p66Var;
                                            final dh5 obj11 = new Object();
                                            if (p66Var4 == null) {
                                                p66Var2 = lb4.q(jq1Var2);
                                            } else {
                                                p66Var2 = p66Var4;
                                            }
                                            obj11.A = p66Var2;
                                            final dh5 obj12 = new Object();
                                            obj12.A = p66Var3;
                                            final dh5 obj13 = new Object();
                                            obj13.A = p66Var4;
                                            final zg5 obj14 = new Object();
                                            final zg5 obj15 = new Object();
                                            if (obj12.A != null) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            switchCompat3.setChecked(z18);
                                            if (obj13.A != null) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            switchCompat4.setChecked(z19);
                                            obj14.A = true;
                                            RadioButton radioButton = (RadioButton) m02.get(obj10.A);
                                            if (radioButton != null) {
                                                i7 = radioButton.getId();
                                            } else {
                                                i7 = R.id.radioInternalAlignmentTop;
                                            }
                                            radioGroup2.check(i7);
                                            obj14.A = false;
                                            obj15.A = true;
                                            RadioButton radioButton2 = (RadioButton) m03.get(obj11.A);
                                            if (radioButton2 != null) {
                                                i8 = radioButton2.getId();
                                            } else {
                                                i8 = R.id.radioExternalAlignmentTop;
                                            }
                                            radioGroup3.check(i8);
                                            obj15.A = false;
                                            VideoPreferencesFragment.C(m02.values(), switchCompat3.isChecked());
                                            VideoPreferencesFragment.C(m03.values(), switchCompat4.isChecked());
                                            switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                    int i9 = r4;
                                                    p66 p66Var8 = null;
                                                    dh5 dh5Var4 = obj10;
                                                    dh5 dh5Var5 = obj12;
                                                    Map map = m02;
                                                    switch (i9) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                    }
                                                }
                                            });
                                            switchCompat4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                    int i9 = r4;
                                                    p66 p66Var8 = null;
                                                    dh5 dh5Var4 = obj11;
                                                    dh5 dh5Var5 = obj13;
                                                    Map map = m03;
                                                    switch (i9) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                    }
                                                }
                                            });
                                            radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                    p66 p66Var8;
                                                    p66 p66Var9;
                                                    int i10 = r5;
                                                    dh5 dh5Var4 = obj12;
                                                    SwitchCompat switchCompat5 = switchCompat3;
                                                    dh5 dh5Var5 = obj10;
                                                    zg5 zg5Var = obj14;
                                                    switch (i10) {
                                                        case 0:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioInternalAlignmentTop) {
                                                                    p66Var8 = p66.TOP;
                                                                } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                    p66Var8 = p66.CENTER;
                                                                } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                    p66Var8 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var8 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var8;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioExternalAlignmentTop) {
                                                                    p66Var9 = p66.TOP;
                                                                } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                    p66Var9 = p66.CENTER;
                                                                } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                    p66Var9 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var9 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var9;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                    p66 p66Var8;
                                                    p66 p66Var9;
                                                    int i10 = r5;
                                                    dh5 dh5Var4 = obj13;
                                                    SwitchCompat switchCompat5 = switchCompat4;
                                                    dh5 dh5Var5 = obj11;
                                                    zg5 zg5Var = obj15;
                                                    switch (i10) {
                                                        case 0:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioInternalAlignmentTop) {
                                                                    p66Var8 = p66.TOP;
                                                                } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                    p66Var8 = p66.CENTER;
                                                                } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                    p66Var8 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var8 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var8;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioExternalAlignmentTop) {
                                                                    p66Var9 = p66.TOP;
                                                                } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                    p66Var9 = p66.CENTER;
                                                                } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                    p66Var9 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var9 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var9;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                            zbVar3.z(R.string.dual_screen_vertical_alignment_title);
                                            zbVar3.A(inflate2);
                                            zbVar3.y(R.string.ok, new qu1(ne4Var, obj12, obj13, 6));
                                            zbVar3.x(R.string.cancel, null);
                                            zbVar3.B();
                                        }
                                    });
                                    zb zbVar3 = new zb(videoPreferencesFragment4.requireContext());
                                    zbVar3.z(R.string.dual_screen_presets_settings_title);
                                    zbVar3.A(inflate);
                                    zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: zm7
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i7) {
                                            boolean z18;
                                            VideoPreferencesFragment videoPreferencesFragment5 = VideoPreferencesFragment.this;
                                            kd6 o = videoPreferencesFragment5.o();
                                            dh5 dh5Var = obj3;
                                            jq1 jq1Var2 = (jq1) dh5Var.A;
                                            jq1Var2.getClass();
                                            SharedPreferences.Editor edit = ((ng6) o).b.edit();
                                            String lowerCase = jq1Var2.name().toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                            edit.putString("dual_screen_preset", lowerCase);
                                            edit.apply();
                                            kd6 o2 = videoPreferencesFragment5.o();
                                            boolean z19 = obj22.A;
                                            SharedPreferences.Editor edit2 = ((ng6) o2).b.edit();
                                            edit2.putBoolean("external_display_keep_ratio", z19);
                                            edit2.apply();
                                            kd6 o3 = videoPreferencesFragment5.o();
                                            if (obj32.A && dh5Var.A != jq1.OFF) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            SharedPreferences.Editor edit3 = ((ng6) o3).b.edit();
                                            edit3.putBoolean("dual_screen_integer_scale", z18);
                                            edit3.apply();
                                            kd6 o4 = videoPreferencesFragment5.o();
                                            boolean z20 = obj4.A;
                                            SharedPreferences.Editor edit4 = ((ng6) o4).b.edit();
                                            edit4.putBoolean("dual_screen_internal_fill_height", z20);
                                            edit4.apply();
                                            kd6 o5 = videoPreferencesFragment5.o();
                                            boolean z21 = obj5.A;
                                            SharedPreferences.Editor edit5 = ((ng6) o5).b.edit();
                                            edit5.putBoolean("dual_screen_internal_fill_width", z21);
                                            edit5.apply();
                                            kd6 o6 = videoPreferencesFragment5.o();
                                            boolean z22 = obj6.A;
                                            SharedPreferences.Editor edit6 = ((ng6) o6).b.edit();
                                            edit6.putBoolean("dual_screen_external_fill_height", z22);
                                            edit6.apply();
                                            kd6 o7 = videoPreferencesFragment5.o();
                                            boolean z23 = obj7.A;
                                            SharedPreferences.Editor edit7 = ((ng6) o7).b.edit();
                                            edit7.putBoolean("dual_screen_external_fill_width", z23);
                                            edit7.apply();
                                            ((ng6) videoPreferencesFragment5.o()).N((p66) obj8.A);
                                            ((ng6) videoPreferencesFragment5.o()).M((p66) obj9.A);
                                            videoPreferencesFragment5.E();
                                        }
                                    });
                                    zbVar3.x(R.string.cancel, null);
                                    zbVar3.B();
                                    return;
                            }
                        }
                    });
                    n().c(storagePickerPreference3, null);
                    n().c(storagePickerPreference5, null);
                    n().getClass();
                    p15.a(listPreference2);
                    if (editTextPreference != null) {
                        n().getClass();
                        p15.a(editTextPreference);
                    }
                    String str3 = inGameLockedListPreference2.e0;
                    str3.getClass();
                    VideoRenderer videoRenderer = (VideoRenderer) jw2.o(str3, VideoRenderer.values());
                    if (preference4 != null) {
                        preference4.setOnPreferenceClickListener(new y05(this) { // from class: om7
                            public final /* synthetic */ VideoPreferencesFragment B;

                            {
                                this.B = this;
                            }

                            /* JADX WARN: Type inference failed for: r10v4, types: [dh5, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r1v15, types: [zg5, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r2v28, types: [dh5, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r3v14, types: [zg5, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r4v22, types: [zg5, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r6v6, types: [zg5, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r7v6, types: [zg5, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r8v6, types: [zg5, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r9v5, types: [dh5, java.lang.Object] */
                            @Override // defpackage.y05
                            public final void i(Preference preference32) {
                                RandomAccess randomAccess;
                                final List yt1Var;
                                String P0;
                                boolean z10;
                                switch (r2) {
                                    case 0:
                                        this.B.B();
                                        return;
                                    case 1:
                                        VideoPreferencesFragment videoPreferencesFragment = this.B;
                                        if (videoPreferencesFragment.p().d() != null) {
                                            Context requireContext3 = videoPreferencesFragment.requireContext();
                                            requireContext3.getClass();
                                            String[] strArr = {videoPreferencesFragment.getString(R.string.video_retroarch_shader_check_updates), videoPreferencesFragment.getString(R.string.video_retroarch_shader_reinstall), videoPreferencesFragment.getString(R.string.video_retroarch_shader_uninstall)};
                                            zb zbVar = new zb(requireContext3);
                                            zbVar.z(R.string.video_retroarch_shader_installed_title);
                                            zbVar.v(strArr, new k(videoPreferencesFragment, 0));
                                            zbVar.x(17039360, null);
                                            zbVar.B();
                                            return;
                                        }
                                        videoPreferencesFragment.D();
                                        return;
                                    case 2:
                                        final VideoPreferencesFragment videoPreferencesFragment2 = this.B;
                                        ae6 ae6Var = videoPreferencesFragment2.h0;
                                        if (ae6Var != null) {
                                            synchronized (ae6Var) {
                                                try {
                                                    if (ae6Var.a.isFile()) {
                                                        randomAccess = jc2.A0(ae6Var.a);
                                                    } else {
                                                        randomAccess = yt1.A;
                                                    }
                                                    RandomAccess randomAccess2 = yt1.A;
                                                    boolean z11 = randomAccess instanceof em5;
                                                    RandomAccess randomAccess3 = randomAccess;
                                                    if (z11) {
                                                        randomAccess3 = randomAccess2;
                                                    }
                                                    yt1Var = (List) randomAccess3;
                                                }
                                            }
                                            if (yt1Var.isEmpty()) {
                                                P0 = videoPreferencesFragment2.getString(R.string.shader_compatibility_report_empty);
                                            } else {
                                                P0 = gt0.P0(new l14(yt1Var), "\n\n", null, null, null, 62);
                                            }
                                            P0.getClass();
                                            zb zbVar2 = new zb(videoPreferencesFragment2.requireContext());
                                            zbVar2.z(R.string.shader_compatibility_report_title);
                                            ((wb) zbVar2.L).f = P0;
                                            zbVar2.y(17039370, null);
                                            if (!yt1Var.isEmpty()) {
                                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: me.magnum.melonds.ui.settings.fragments.j
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i52) {
                                                        VideoPreferencesFragment videoPreferencesFragment3 = VideoPreferencesFragment.this;
                                                        Uri uri = (Uri) fv.E0(((ng6) videoPreferencesFragment3.o()).r());
                                                        if (uri == null) {
                                                            Toast.makeText(videoPreferencesFragment3.requireContext(), (int) R.string.shader_compatibility_report_no_rom_folder, 1).show();
                                                        } else {
                                                            hv.L(bl2.C(videoPreferencesFragment3), null, null, new VideoPreferencesFragment$saveShaderCompatibilityLog$1(videoPreferencesFragment3, uri, yt1Var, null), 3);
                                                        }
                                                    }
                                                };
                                                wb wbVar = (wb) zbVar2.L;
                                                wbVar.k = wbVar.a.getText(R.string.shader_compatibility_report_save);
                                                wbVar.l = onClickListener;
                                                zbVar2.x(R.string.shader_compatibility_report_clear, new rm7(videoPreferencesFragment2, 2));
                                            }
                                            zbVar2.B();
                                            return;
                                        }
                                        nb3.a0("shaderCompatibilityLog");
                                        throw null;
                                    case 3:
                                        VideoPreferencesFragment videoPreferencesFragment3 = this.B;
                                        videoPreferencesFragment3.startActivity(new Intent(videoPreferencesFragment3.requireContext(), VulkanDriverManagerActivity.class));
                                        return;
                                    case 4:
                                        this.B.C0.a(new String[]{"application/zip", "application/x-zip-compressed", "application/octet-stream", "application/x-compressed"});
                                        return;
                                    default:
                                        final VideoPreferencesFragment videoPreferencesFragment4 = this.B;
                                        jq1 i52 = ((ng6) videoPreferencesFragment4.o()).i();
                                        boolean z12 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("external_display_keep_ratio", true);
                                        boolean z13 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_integer_scale", false);
                                        boolean z14 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_height", false);
                                        boolean z15 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_width", false);
                                        boolean z16 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_height", false);
                                        boolean z17 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_width", false);
                                        p66 h = ((ng6) videoPreferencesFragment4.o()).h();
                                        p66 g = ((ng6) videoPreferencesFragment4.o()).g();
                                        View inflate = LayoutInflater.from(videoPreferencesFragment4.requireContext()).inflate(R.layout.dialog_dual_screen_presets, (ViewGroup) null);
                                        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupPresets);
                                        final SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.switchKeepAspectRatio);
                                        final SwitchCompat switchCompat2 = (SwitchCompat) inflate.findViewById(R.id.switchIntegerScale);
                                        final Button button = (Button) inflate.findViewById(R.id.buttonFillAreaOptions);
                                        final Button button2 = (Button) inflate.findViewById(R.id.buttonVerticalAlignmentOptions);
                                        final TextView textView = (TextView) inflate.findViewById(R.id.textVerticalAlignmentSummary);
                                        final TextView textView2 = (TextView) inflate.findViewById(R.id.textPresetsDisabledHint);
                                        jq1 jq1Var = jq1.OFF;
                                        int i6 = R.id.radioPresetOff;
                                        final Map m0 = c14.m0(new vr4(jq1Var, Integer.valueOf((int) R.id.radioPresetOff)), new vr4(jq1.INTERNAL_TOP_EXTERNAL_BOTTOM, Integer.valueOf((int) R.id.radioPresetInternalTopExternalBottom)), new vr4(jq1.INTERNAL_BOTTOM_EXTERNAL_TOP, Integer.valueOf((int) R.id.radioPresetInternalBottomExternalTop)));
                                        final dh5 obj3 = new Object();
                                        obj3.A = i52;
                                        final zg5 obj22 = new Object();
                                        obj22.A = z12;
                                        final zg5 obj32 = new Object();
                                        if (z13 && i52 != jq1Var) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        obj32.A = z10;
                                        final zg5 obj4 = new Object();
                                        obj4.A = z14;
                                        final zg5 obj5 = new Object();
                                        obj5.A = z15;
                                        final zg5 obj6 = new Object();
                                        obj6.A = z16;
                                        final zg5 obj7 = new Object();
                                        obj7.A = z17;
                                        final dh5 obj8 = new Object();
                                        obj8.A = h;
                                        final dh5 obj9 = new Object();
                                        obj9.A = g;
                                        Integer num = (Integer) m0.get(i52);
                                        if (num != null) {
                                            i6 = num.intValue();
                                        }
                                        radioGroup.check(i6);
                                        switchCompat.setChecked(obj22.A);
                                        switchCompat2.setChecked(obj32.A);
                                        VideoPreferencesFragment.v(obj3, obj8, obj9, textView, videoPreferencesFragment4);
                                        VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj32, obj22, button, button2);
                                        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: um7
                                            @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                            public final void onCheckedChanged(RadioGroup radioGroup2, int i7) {
                                                Object obj10;
                                                jq1 jq1Var2;
                                                radioGroup2.getClass();
                                                Iterator it = m0.entrySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        obj10 = it.next();
                                                        if (((Number) ((Map.Entry) obj10).getValue()).intValue() == i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj10 = null;
                                                        break;
                                                    }
                                                }
                                                Map.Entry entry = (Map.Entry) obj10;
                                                if (entry != null && (jq1Var2 = (jq1) entry.getKey()) != null) {
                                                    dh5 dh5Var = obj3;
                                                    dh5Var.A = jq1Var2;
                                                    jq1 jq1Var3 = jq1.OFF;
                                                    SwitchCompat switchCompat3 = switchCompat2;
                                                    zg5 zg5Var = obj32;
                                                    if (jq1Var2 == jq1Var3) {
                                                        switchCompat3.setChecked(false);
                                                        zg5Var.A = false;
                                                    }
                                                    VideoPreferencesFragment.u(dh5Var, textView2, switchCompat, switchCompat3, zg5Var, obj22, button, button2);
                                                    VideoPreferencesFragment.v(dh5Var, obj8, obj9, textView, videoPreferencesFragment4);
                                                }
                                            }
                                        });
                                        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                                switch (r9) {
                                                    case 0:
                                                        compoundButton.getClass();
                                                        zg5 zg5Var = obj22;
                                                        zg5Var.A = z18;
                                                        VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj32, zg5Var, button, button2);
                                                        return;
                                                    default:
                                                        compoundButton.getClass();
                                                        zg5 zg5Var2 = obj22;
                                                        zg5Var2.A = z18;
                                                        VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, zg5Var2, obj32, button, button2);
                                                        return;
                                                }
                                            }
                                        });
                                        switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                                switch (r9) {
                                                    case 0:
                                                        compoundButton.getClass();
                                                        zg5 zg5Var = obj32;
                                                        zg5Var.A = z18;
                                                        VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj22, zg5Var, button, button2);
                                                        return;
                                                    default:
                                                        compoundButton.getClass();
                                                        zg5 zg5Var2 = obj32;
                                                        zg5Var2.A = z18;
                                                        VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, zg5Var2, obj22, button, button2);
                                                        return;
                                                }
                                            }
                                        });
                                        button.setOnClickListener(new View.OnClickListener() { // from class: xm7
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                final boolean z18;
                                                boolean z19;
                                                boolean z20;
                                                int i7;
                                                if (dh5.this.A != jq1.OFF && (obj32.A || obj22.A)) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                zg5 zg5Var = obj4;
                                                boolean z21 = zg5Var.A;
                                                zg5 zg5Var2 = obj5;
                                                boolean z22 = zg5Var2.A;
                                                zg5 zg5Var3 = obj6;
                                                boolean z23 = zg5Var3.A;
                                                zg5 zg5Var4 = obj7;
                                                boolean z24 = zg5Var4.A;
                                                final jb7 jb7Var = new jb7(zg5Var, zg5Var2, zg5Var3, zg5Var4, 1);
                                                VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                                View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_fill_area, (ViewGroup) null);
                                                TextView textView3 = (TextView) inflate2.findViewById(R.id.textFillAreaDisabled);
                                                final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillEnabled);
                                                final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillHeight);
                                                final SwitchCompat switchCompat5 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillWidth);
                                                final SwitchCompat switchCompat6 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillEnabled);
                                                final SwitchCompat switchCompat7 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillHeight);
                                                final SwitchCompat switchCompat8 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillWidth);
                                                ((TextView) inflate2.findViewById(R.id.textFillAreaDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_fill_area_description));
                                                switchCompat4.setChecked(z21);
                                                switchCompat5.setChecked(z22);
                                                switchCompat7.setChecked(z23);
                                                switchCompat8.setChecked(z24);
                                                if (!z21 && !z22) {
                                                    z19 = false;
                                                } else {
                                                    z19 = true;
                                                }
                                                switchCompat3.setChecked(z19);
                                                if (!z23 && !z24) {
                                                    z20 = false;
                                                } else {
                                                    z20 = true;
                                                }
                                                switchCompat6.setChecked(z20);
                                                switchCompat3.setEnabled(z18);
                                                switchCompat6.setEnabled(z18);
                                                VideoPreferencesFragment.x(z18, switchCompat4, switchCompat5, switchCompat3.isChecked(), false);
                                                VideoPreferencesFragment.w(z18, switchCompat7, switchCompat8, switchCompat6.isChecked(), false);
                                                switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                        int i8 = r4;
                                                        SwitchCompat switchCompat9 = switchCompat5;
                                                        SwitchCompat switchCompat10 = switchCompat4;
                                                        boolean z26 = z18;
                                                        switch (i8) {
                                                            case 0:
                                                                compoundButton.getClass();
                                                                VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                                return;
                                                            default:
                                                                compoundButton.getClass();
                                                                VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                                return;
                                                        }
                                                    }
                                                });
                                                switchCompat6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                        int i8 = r4;
                                                        SwitchCompat switchCompat9 = switchCompat8;
                                                        SwitchCompat switchCompat10 = switchCompat7;
                                                        boolean z26 = z18;
                                                        switch (i8) {
                                                            case 0:
                                                                compoundButton.getClass();
                                                                VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                                return;
                                                            default:
                                                                compoundButton.getClass();
                                                                VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                                return;
                                                        }
                                                    }
                                                });
                                                textView3.getClass();
                                                if (!z18) {
                                                    i7 = 0;
                                                } else {
                                                    i7 = 8;
                                                }
                                                textView3.setVisibility(i7);
                                                zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                                zbVar3.z(R.string.dual_screen_fill_area_title);
                                                zbVar3.A(inflate2);
                                                zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: fn7
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i8) {
                                                        boolean z25;
                                                        boolean z26;
                                                        boolean z27;
                                                        boolean z28;
                                                        boolean z29 = z18;
                                                        boolean z30 = true;
                                                        boolean z31 = false;
                                                        if (z29 && switchCompat3.isChecked()) {
                                                            z25 = true;
                                                        } else {
                                                            z25 = false;
                                                        }
                                                        if (!z29 || !switchCompat6.isChecked()) {
                                                            z30 = false;
                                                        }
                                                        if (z25) {
                                                            z26 = switchCompat4.isChecked();
                                                        } else {
                                                            z26 = false;
                                                        }
                                                        Boolean valueOf = Boolean.valueOf(z26);
                                                        if (z25) {
                                                            z27 = switchCompat5.isChecked();
                                                        } else {
                                                            z27 = false;
                                                        }
                                                        Boolean valueOf2 = Boolean.valueOf(z27);
                                                        if (z30) {
                                                            z28 = switchCompat7.isChecked();
                                                        } else {
                                                            z28 = false;
                                                        }
                                                        Boolean valueOf3 = Boolean.valueOf(z28);
                                                        if (z30) {
                                                            z31 = switchCompat8.isChecked();
                                                        }
                                                        jb7Var.l(valueOf, valueOf2, valueOf3, Boolean.valueOf(z31));
                                                    }
                                                });
                                                zbVar3.x(R.string.cancel, null);
                                                zbVar3.B();
                                            }
                                        });
                                        button2.setOnClickListener(new View.OnClickListener() { // from class: ym7
                                            /* JADX WARN: Type inference failed for: r11v6, types: [dh5, java.lang.Object] */
                                            /* JADX WARN: Type inference failed for: r12v3, types: [dh5, java.lang.Object] */
                                            /* JADX WARN: Type inference failed for: r14v2, types: [dh5, java.lang.Object] */
                                            /* JADX WARN: Type inference failed for: r7v4, types: [dh5, java.lang.Object] */
                                            /* JADX WARN: Type inference failed for: r8v2, types: [zg5, java.lang.Object] */
                                            /* JADX WARN: Type inference failed for: r9v2, types: [zg5, java.lang.Object] */
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                p66 p66Var;
                                                p66 p66Var2;
                                                boolean z18;
                                                boolean z19;
                                                int i7;
                                                int i8;
                                                dh5 dh5Var = obj3;
                                                jq1 jq1Var2 = (jq1) dh5Var.A;
                                                dh5 dh5Var2 = obj8;
                                                p66 p66Var3 = (p66) dh5Var2.A;
                                                dh5 dh5Var3 = obj9;
                                                p66 p66Var4 = (p66) dh5Var3.A;
                                                TextView textView3 = textView;
                                                VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                                ne4 ne4Var = new ne4(dh5Var2, dh5Var3, textView3, videoPreferencesFragment5, dh5Var, 8);
                                                View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_vertical_alignment, (ViewGroup) null);
                                                ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_description));
                                                ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDefaults)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_default_hint, videoPreferencesFragment5.m(lb4.r(jq1Var2)), videoPreferencesFragment5.m(lb4.q(jq1Var2))));
                                                final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalAlignmentOverride);
                                                final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalAlignmentOverride);
                                                RadioGroup radioGroup2 = (RadioGroup) inflate2.findViewById(R.id.radioGroupInternalAlignment);
                                                RadioGroup radioGroup3 = (RadioGroup) inflate2.findViewById(R.id.radioGroupExternalAlignment);
                                                p66 p66Var5 = p66.TOP;
                                                vr4 vr4Var = new vr4(p66Var5, inflate2.findViewById(R.id.radioInternalAlignmentTop));
                                                p66 p66Var6 = p66.CENTER;
                                                vr4 vr4Var2 = new vr4(p66Var6, inflate2.findViewById(R.id.radioInternalAlignmentCenter));
                                                p66 p66Var7 = p66.BOTTOM;
                                                final Map m02 = c14.m0(vr4Var, vr4Var2, new vr4(p66Var7, inflate2.findViewById(R.id.radioInternalAlignmentBottom)));
                                                final Map m03 = c14.m0(new vr4(p66Var5, inflate2.findViewById(R.id.radioExternalAlignmentTop)), new vr4(p66Var6, inflate2.findViewById(R.id.radioExternalAlignmentCenter)), new vr4(p66Var7, inflate2.findViewById(R.id.radioExternalAlignmentBottom)));
                                                final dh5 obj10 = new Object();
                                                if (p66Var3 == null) {
                                                    p66Var = lb4.r(jq1Var2);
                                                } else {
                                                    p66Var = p66Var3;
                                                }
                                                obj10.A = p66Var;
                                                final dh5 obj11 = new Object();
                                                if (p66Var4 == null) {
                                                    p66Var2 = lb4.q(jq1Var2);
                                                } else {
                                                    p66Var2 = p66Var4;
                                                }
                                                obj11.A = p66Var2;
                                                final dh5 obj12 = new Object();
                                                obj12.A = p66Var3;
                                                final dh5 obj13 = new Object();
                                                obj13.A = p66Var4;
                                                final zg5 obj14 = new Object();
                                                final zg5 obj15 = new Object();
                                                if (obj12.A != null) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                switchCompat3.setChecked(z18);
                                                if (obj13.A != null) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                switchCompat4.setChecked(z19);
                                                obj14.A = true;
                                                RadioButton radioButton = (RadioButton) m02.get(obj10.A);
                                                if (radioButton != null) {
                                                    i7 = radioButton.getId();
                                                } else {
                                                    i7 = R.id.radioInternalAlignmentTop;
                                                }
                                                radioGroup2.check(i7);
                                                obj14.A = false;
                                                obj15.A = true;
                                                RadioButton radioButton2 = (RadioButton) m03.get(obj11.A);
                                                if (radioButton2 != null) {
                                                    i8 = radioButton2.getId();
                                                } else {
                                                    i8 = R.id.radioExternalAlignmentTop;
                                                }
                                                radioGroup3.check(i8);
                                                obj15.A = false;
                                                VideoPreferencesFragment.C(m02.values(), switchCompat3.isChecked());
                                                VideoPreferencesFragment.C(m03.values(), switchCompat4.isChecked());
                                                switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                        int i9 = r4;
                                                        p66 p66Var8 = null;
                                                        dh5 dh5Var4 = obj10;
                                                        dh5 dh5Var5 = obj12;
                                                        Map map = m02;
                                                        switch (i9) {
                                                            case 0:
                                                                compoundButton.getClass();
                                                                VideoPreferencesFragment.C(map.values(), z20);
                                                                if (z20) {
                                                                    p66Var8 = (p66) dh5Var4.A;
                                                                }
                                                                dh5Var5.A = p66Var8;
                                                                return;
                                                            default:
                                                                compoundButton.getClass();
                                                                VideoPreferencesFragment.C(map.values(), z20);
                                                                if (z20) {
                                                                    p66Var8 = (p66) dh5Var4.A;
                                                                }
                                                                dh5Var5.A = p66Var8;
                                                                return;
                                                        }
                                                    }
                                                });
                                                switchCompat4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                        int i9 = r4;
                                                        p66 p66Var8 = null;
                                                        dh5 dh5Var4 = obj11;
                                                        dh5 dh5Var5 = obj13;
                                                        Map map = m03;
                                                        switch (i9) {
                                                            case 0:
                                                                compoundButton.getClass();
                                                                VideoPreferencesFragment.C(map.values(), z20);
                                                                if (z20) {
                                                                    p66Var8 = (p66) dh5Var4.A;
                                                                }
                                                                dh5Var5.A = p66Var8;
                                                                return;
                                                            default:
                                                                compoundButton.getClass();
                                                                VideoPreferencesFragment.C(map.values(), z20);
                                                                if (z20) {
                                                                    p66Var8 = (p66) dh5Var4.A;
                                                                }
                                                                dh5Var5.A = p66Var8;
                                                                return;
                                                        }
                                                    }
                                                });
                                                radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                    public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                        p66 p66Var8;
                                                        p66 p66Var9;
                                                        int i10 = r5;
                                                        dh5 dh5Var4 = obj12;
                                                        SwitchCompat switchCompat5 = switchCompat3;
                                                        dh5 dh5Var5 = obj10;
                                                        zg5 zg5Var = obj14;
                                                        switch (i10) {
                                                            case 0:
                                                                radioGroup4.getClass();
                                                                if (!zg5Var.A) {
                                                                    if (i9 == R.id.radioInternalAlignmentTop) {
                                                                        p66Var8 = p66.TOP;
                                                                    } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                        p66Var8 = p66.CENTER;
                                                                    } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                        p66Var8 = p66.BOTTOM;
                                                                    } else {
                                                                        p66Var8 = p66.TOP;
                                                                    }
                                                                    dh5Var5.A = p66Var8;
                                                                    if (switchCompat5.isChecked()) {
                                                                        dh5Var4.A = dh5Var5.A;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                radioGroup4.getClass();
                                                                if (!zg5Var.A) {
                                                                    if (i9 == R.id.radioExternalAlignmentTop) {
                                                                        p66Var9 = p66.TOP;
                                                                    } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                        p66Var9 = p66.CENTER;
                                                                    } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                        p66Var9 = p66.BOTTOM;
                                                                    } else {
                                                                        p66Var9 = p66.TOP;
                                                                    }
                                                                    dh5Var5.A = p66Var9;
                                                                    if (switchCompat5.isChecked()) {
                                                                        dh5Var4.A = dh5Var5.A;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                    public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                        p66 p66Var8;
                                                        p66 p66Var9;
                                                        int i10 = r5;
                                                        dh5 dh5Var4 = obj13;
                                                        SwitchCompat switchCompat5 = switchCompat4;
                                                        dh5 dh5Var5 = obj11;
                                                        zg5 zg5Var = obj15;
                                                        switch (i10) {
                                                            case 0:
                                                                radioGroup4.getClass();
                                                                if (!zg5Var.A) {
                                                                    if (i9 == R.id.radioInternalAlignmentTop) {
                                                                        p66Var8 = p66.TOP;
                                                                    } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                        p66Var8 = p66.CENTER;
                                                                    } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                        p66Var8 = p66.BOTTOM;
                                                                    } else {
                                                                        p66Var8 = p66.TOP;
                                                                    }
                                                                    dh5Var5.A = p66Var8;
                                                                    if (switchCompat5.isChecked()) {
                                                                        dh5Var4.A = dh5Var5.A;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                radioGroup4.getClass();
                                                                if (!zg5Var.A) {
                                                                    if (i9 == R.id.radioExternalAlignmentTop) {
                                                                        p66Var9 = p66.TOP;
                                                                    } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                        p66Var9 = p66.CENTER;
                                                                    } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                        p66Var9 = p66.BOTTOM;
                                                                    } else {
                                                                        p66Var9 = p66.TOP;
                                                                    }
                                                                    dh5Var5.A = p66Var9;
                                                                    if (switchCompat5.isChecked()) {
                                                                        dh5Var4.A = dh5Var5.A;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                                zbVar3.z(R.string.dual_screen_vertical_alignment_title);
                                                zbVar3.A(inflate2);
                                                zbVar3.y(R.string.ok, new qu1(ne4Var, obj12, obj13, 6));
                                                zbVar3.x(R.string.cancel, null);
                                                zbVar3.B();
                                            }
                                        });
                                        zb zbVar3 = new zb(videoPreferencesFragment4.requireContext());
                                        zbVar3.z(R.string.dual_screen_presets_settings_title);
                                        zbVar3.A(inflate);
                                        zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: zm7
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i7) {
                                                boolean z18;
                                                VideoPreferencesFragment videoPreferencesFragment5 = VideoPreferencesFragment.this;
                                                kd6 o = videoPreferencesFragment5.o();
                                                dh5 dh5Var = obj3;
                                                jq1 jq1Var2 = (jq1) dh5Var.A;
                                                jq1Var2.getClass();
                                                SharedPreferences.Editor edit = ((ng6) o).b.edit();
                                                String lowerCase = jq1Var2.name().toLowerCase(Locale.ROOT);
                                                lowerCase.getClass();
                                                edit.putString("dual_screen_preset", lowerCase);
                                                edit.apply();
                                                kd6 o2 = videoPreferencesFragment5.o();
                                                boolean z19 = obj22.A;
                                                SharedPreferences.Editor edit2 = ((ng6) o2).b.edit();
                                                edit2.putBoolean("external_display_keep_ratio", z19);
                                                edit2.apply();
                                                kd6 o3 = videoPreferencesFragment5.o();
                                                if (obj32.A && dh5Var.A != jq1.OFF) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                SharedPreferences.Editor edit3 = ((ng6) o3).b.edit();
                                                edit3.putBoolean("dual_screen_integer_scale", z18);
                                                edit3.apply();
                                                kd6 o4 = videoPreferencesFragment5.o();
                                                boolean z20 = obj4.A;
                                                SharedPreferences.Editor edit4 = ((ng6) o4).b.edit();
                                                edit4.putBoolean("dual_screen_internal_fill_height", z20);
                                                edit4.apply();
                                                kd6 o5 = videoPreferencesFragment5.o();
                                                boolean z21 = obj5.A;
                                                SharedPreferences.Editor edit5 = ((ng6) o5).b.edit();
                                                edit5.putBoolean("dual_screen_internal_fill_width", z21);
                                                edit5.apply();
                                                kd6 o6 = videoPreferencesFragment5.o();
                                                boolean z22 = obj6.A;
                                                SharedPreferences.Editor edit6 = ((ng6) o6).b.edit();
                                                edit6.putBoolean("dual_screen_external_fill_height", z22);
                                                edit6.apply();
                                                kd6 o7 = videoPreferencesFragment5.o();
                                                boolean z23 = obj7.A;
                                                SharedPreferences.Editor edit7 = ((ng6) o7).b.edit();
                                                edit7.putBoolean("dual_screen_external_fill_width", z23);
                                                edit7.apply();
                                                ((ng6) videoPreferencesFragment5.o()).N((p66) obj8.A);
                                                ((ng6) videoPreferencesFragment5.o()).M((p66) obj9.A);
                                                videoPreferencesFragment5.E();
                                            }
                                        });
                                        zbVar3.x(R.string.cancel, null);
                                        zbVar3.B();
                                        return;
                                }
                            }
                        });
                    }
                    listPreference3.setPersistent(false);
                    listPreference3.setOnPreferenceClickListener(new y05(this) { // from class: an7
                        public final /* synthetic */ VideoPreferencesFragment B;

                        {
                            this.B = this;
                        }

                        @Override // defpackage.y05
                        public final void i(Preference preference5) {
                            int i6;
                            switch (r4) {
                                case 0:
                                    final VideoPreferencesFragment videoPreferencesFragment = this.B;
                                    List<zq7> n = ((ng6) videoPreferencesFragment.o()).n();
                                    String str4 = "system";
                                    List b0 = hf.b0("system");
                                    ArrayList arrayList8 = new ArrayList(ht0.v0(n, 10));
                                    for (zq7 zq7Var : n) {
                                        arrayList8.add(zq7Var.a);
                                    }
                                    final ArrayList V0 = gt0.V0(b0, arrayList8);
                                    List b02 = hf.b0(videoPreferencesFragment.getString(R.string.video_vulkan_driver_mode_system));
                                    ArrayList arrayList9 = new ArrayList(ht0.v0(n, 10));
                                    for (zq7 zq7Var2 : n) {
                                        arrayList9.add(zq7Var2.b);
                                    }
                                    ArrayList V02 = gt0.V0(b02, arrayList9);
                                    final ListPreference listPreference4 = listPreference3;
                                    String str5 = listPreference4.e0;
                                    if (str5 != null) {
                                        str4 = str5;
                                    }
                                    int indexOf = V0.indexOf(str4);
                                    Integer valueOf = Integer.valueOf(indexOf);
                                    if (indexOf < 0) {
                                        valueOf = null;
                                    }
                                    if (valueOf != null) {
                                        i6 = valueOf.intValue();
                                    } else {
                                        i6 = 0;
                                    }
                                    zb zbVar = new zb(videoPreferencesFragment.requireContext());
                                    zbVar.z(R.string.video_vulkan_driver_mode);
                                    final Preference preference6 = findPreference27;
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: bn7
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i7) {
                                            int i8 = r5;
                                            Preference preference7 = preference6;
                                            ListPreference listPreference5 = listPreference4;
                                            VideoPreferencesFragment videoPreferencesFragment2 = videoPreferencesFragment;
                                            List list = V0;
                                            switch (i8) {
                                                case 0:
                                                    String str6 = (String) ((ArrayList) list).get(i7);
                                                    if (nb3.k(str6, "system")) {
                                                        ((ng6) videoPreferencesFragment2.o()).P(sr7.SYSTEM);
                                                    } else {
                                                        ((ng6) videoPreferencesFragment2.o()).O(str6);
                                                    }
                                                    videoPreferencesFragment2.K(listPreference5, preference7);
                                                    dialogInterface.dismiss();
                                                    return;
                                                default:
                                                    zq7 zq7Var3 = (zq7) list.get(i7);
                                                    u63 u63Var = videoPreferencesFragment2.v0;
                                                    if (u63Var != null) {
                                                        u63Var.D(zq7Var3.a);
                                                        videoPreferencesFragment2.K(listPreference5, preference7);
                                                        Toast.makeText(videoPreferencesFragment2.requireContext(), videoPreferencesFragment2.getString(R.string.video_vulkan_driver_removed, zq7Var3.b), 1).show();
                                                        return;
                                                    }
                                                    nb3.a0("adrenoVulkanDriverManager");
                                                    throw null;
                                            }
                                        }
                                    };
                                    wb wbVar = (wb) zbVar.L;
                                    wbVar.q = (CharSequence[]) V02.toArray(new String[0]);
                                    wbVar.s = onClickListener;
                                    wbVar.y = i6;
                                    wbVar.x = true;
                                    zbVar.x(17039360, null);
                                    zbVar.B();
                                    return;
                                default:
                                    final VideoPreferencesFragment videoPreferencesFragment2 = this.B;
                                    final List<zq7> n2 = ((ng6) videoPreferencesFragment2.o()).n();
                                    if (n2.isEmpty()) {
                                        Toast.makeText(videoPreferencesFragment2.requireContext(), (int) R.string.video_vulkan_driver_no_custom, 0).show();
                                        return;
                                    }
                                    zb zbVar2 = new zb(videoPreferencesFragment2.requireContext());
                                    zbVar2.z(R.string.video_vulkan_driver_remove);
                                    ArrayList arrayList10 = new ArrayList(ht0.v0(n2, 10));
                                    for (zq7 zq7Var3 : n2) {
                                        arrayList10.add(zq7Var3.b);
                                    }
                                    final ListPreference listPreference5 = listPreference3;
                                    final Preference preference7 = findPreference27;
                                    zbVar2.v((CharSequence[]) arrayList10.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: bn7
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i7) {
                                            int i8 = r5;
                                            Preference preference72 = preference7;
                                            ListPreference listPreference52 = listPreference5;
                                            VideoPreferencesFragment videoPreferencesFragment22 = videoPreferencesFragment2;
                                            List list = n2;
                                            switch (i8) {
                                                case 0:
                                                    String str6 = (String) ((ArrayList) list).get(i7);
                                                    if (nb3.k(str6, "system")) {
                                                        ((ng6) videoPreferencesFragment22.o()).P(sr7.SYSTEM);
                                                    } else {
                                                        ((ng6) videoPreferencesFragment22.o()).O(str6);
                                                    }
                                                    videoPreferencesFragment22.K(listPreference52, preference72);
                                                    dialogInterface.dismiss();
                                                    return;
                                                default:
                                                    zq7 zq7Var32 = (zq7) list.get(i7);
                                                    u63 u63Var = videoPreferencesFragment22.v0;
                                                    if (u63Var != null) {
                                                        u63Var.D(zq7Var32.a);
                                                        videoPreferencesFragment22.K(listPreference52, preference72);
                                                        Toast.makeText(videoPreferencesFragment22.requireContext(), videoPreferencesFragment22.getString(R.string.video_vulkan_driver_removed, zq7Var32.b), 1).show();
                                                        return;
                                                    }
                                                    nb3.a0("adrenoVulkanDriverManager");
                                                    throw null;
                                            }
                                        }
                                    });
                                    zbVar2.x(17039360, null);
                                    zbVar2.B();
                                    return;
                            }
                        }
                    });
                    findPreference26.setOnPreferenceClickListener(new y05(this) { // from class: om7
                        public final /* synthetic */ VideoPreferencesFragment B;

                        {
                            this.B = this;
                        }

                        /* JADX WARN: Type inference failed for: r10v4, types: [dh5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r1v15, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r2v28, types: [dh5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r3v14, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v22, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r6v6, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r7v6, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v6, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v5, types: [dh5, java.lang.Object] */
                        @Override // defpackage.y05
                        public final void i(Preference preference32) {
                            RandomAccess randomAccess;
                            final List yt1Var;
                            String P0;
                            boolean z10;
                            switch (r2) {
                                case 0:
                                    this.B.B();
                                    return;
                                case 1:
                                    VideoPreferencesFragment videoPreferencesFragment = this.B;
                                    if (videoPreferencesFragment.p().d() != null) {
                                        Context requireContext3 = videoPreferencesFragment.requireContext();
                                        requireContext3.getClass();
                                        String[] strArr = {videoPreferencesFragment.getString(R.string.video_retroarch_shader_check_updates), videoPreferencesFragment.getString(R.string.video_retroarch_shader_reinstall), videoPreferencesFragment.getString(R.string.video_retroarch_shader_uninstall)};
                                        zb zbVar = new zb(requireContext3);
                                        zbVar.z(R.string.video_retroarch_shader_installed_title);
                                        zbVar.v(strArr, new k(videoPreferencesFragment, 0));
                                        zbVar.x(17039360, null);
                                        zbVar.B();
                                        return;
                                    }
                                    videoPreferencesFragment.D();
                                    return;
                                case 2:
                                    final VideoPreferencesFragment videoPreferencesFragment2 = this.B;
                                    ae6 ae6Var = videoPreferencesFragment2.h0;
                                    if (ae6Var != null) {
                                        synchronized (ae6Var) {
                                            try {
                                                if (ae6Var.a.isFile()) {
                                                    randomAccess = jc2.A0(ae6Var.a);
                                                } else {
                                                    randomAccess = yt1.A;
                                                }
                                                RandomAccess randomAccess2 = yt1.A;
                                                boolean z11 = randomAccess instanceof em5;
                                                RandomAccess randomAccess3 = randomAccess;
                                                if (z11) {
                                                    randomAccess3 = randomAccess2;
                                                }
                                                yt1Var = (List) randomAccess3;
                                            }
                                        }
                                        if (yt1Var.isEmpty()) {
                                            P0 = videoPreferencesFragment2.getString(R.string.shader_compatibility_report_empty);
                                        } else {
                                            P0 = gt0.P0(new l14(yt1Var), "\n\n", null, null, null, 62);
                                        }
                                        P0.getClass();
                                        zb zbVar2 = new zb(videoPreferencesFragment2.requireContext());
                                        zbVar2.z(R.string.shader_compatibility_report_title);
                                        ((wb) zbVar2.L).f = P0;
                                        zbVar2.y(17039370, null);
                                        if (!yt1Var.isEmpty()) {
                                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: me.magnum.melonds.ui.settings.fragments.j
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i52) {
                                                    VideoPreferencesFragment videoPreferencesFragment3 = VideoPreferencesFragment.this;
                                                    Uri uri = (Uri) fv.E0(((ng6) videoPreferencesFragment3.o()).r());
                                                    if (uri == null) {
                                                        Toast.makeText(videoPreferencesFragment3.requireContext(), (int) R.string.shader_compatibility_report_no_rom_folder, 1).show();
                                                    } else {
                                                        hv.L(bl2.C(videoPreferencesFragment3), null, null, new VideoPreferencesFragment$saveShaderCompatibilityLog$1(videoPreferencesFragment3, uri, yt1Var, null), 3);
                                                    }
                                                }
                                            };
                                            wb wbVar = (wb) zbVar2.L;
                                            wbVar.k = wbVar.a.getText(R.string.shader_compatibility_report_save);
                                            wbVar.l = onClickListener;
                                            zbVar2.x(R.string.shader_compatibility_report_clear, new rm7(videoPreferencesFragment2, 2));
                                        }
                                        zbVar2.B();
                                        return;
                                    }
                                    nb3.a0("shaderCompatibilityLog");
                                    throw null;
                                case 3:
                                    VideoPreferencesFragment videoPreferencesFragment3 = this.B;
                                    videoPreferencesFragment3.startActivity(new Intent(videoPreferencesFragment3.requireContext(), VulkanDriverManagerActivity.class));
                                    return;
                                case 4:
                                    this.B.C0.a(new String[]{"application/zip", "application/x-zip-compressed", "application/octet-stream", "application/x-compressed"});
                                    return;
                                default:
                                    final VideoPreferencesFragment videoPreferencesFragment4 = this.B;
                                    jq1 i52 = ((ng6) videoPreferencesFragment4.o()).i();
                                    boolean z12 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("external_display_keep_ratio", true);
                                    boolean z13 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_integer_scale", false);
                                    boolean z14 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_height", false);
                                    boolean z15 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_width", false);
                                    boolean z16 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_height", false);
                                    boolean z17 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_width", false);
                                    p66 h = ((ng6) videoPreferencesFragment4.o()).h();
                                    p66 g = ((ng6) videoPreferencesFragment4.o()).g();
                                    View inflate = LayoutInflater.from(videoPreferencesFragment4.requireContext()).inflate(R.layout.dialog_dual_screen_presets, (ViewGroup) null);
                                    RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupPresets);
                                    final SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.switchKeepAspectRatio);
                                    final SwitchCompat switchCompat2 = (SwitchCompat) inflate.findViewById(R.id.switchIntegerScale);
                                    final Button button = (Button) inflate.findViewById(R.id.buttonFillAreaOptions);
                                    final Button button2 = (Button) inflate.findViewById(R.id.buttonVerticalAlignmentOptions);
                                    final TextView textView = (TextView) inflate.findViewById(R.id.textVerticalAlignmentSummary);
                                    final TextView textView2 = (TextView) inflate.findViewById(R.id.textPresetsDisabledHint);
                                    jq1 jq1Var = jq1.OFF;
                                    int i6 = R.id.radioPresetOff;
                                    final Map m0 = c14.m0(new vr4(jq1Var, Integer.valueOf((int) R.id.radioPresetOff)), new vr4(jq1.INTERNAL_TOP_EXTERNAL_BOTTOM, Integer.valueOf((int) R.id.radioPresetInternalTopExternalBottom)), new vr4(jq1.INTERNAL_BOTTOM_EXTERNAL_TOP, Integer.valueOf((int) R.id.radioPresetInternalBottomExternalTop)));
                                    final dh5 obj3 = new Object();
                                    obj3.A = i52;
                                    final zg5 obj22 = new Object();
                                    obj22.A = z12;
                                    final zg5 obj32 = new Object();
                                    if (z13 && i52 != jq1Var) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    obj32.A = z10;
                                    final zg5 obj4 = new Object();
                                    obj4.A = z14;
                                    final zg5 obj5 = new Object();
                                    obj5.A = z15;
                                    final zg5 obj6 = new Object();
                                    obj6.A = z16;
                                    final zg5 obj7 = new Object();
                                    obj7.A = z17;
                                    final dh5 obj8 = new Object();
                                    obj8.A = h;
                                    final dh5 obj9 = new Object();
                                    obj9.A = g;
                                    Integer num = (Integer) m0.get(i52);
                                    if (num != null) {
                                        i6 = num.intValue();
                                    }
                                    radioGroup.check(i6);
                                    switchCompat.setChecked(obj22.A);
                                    switchCompat2.setChecked(obj32.A);
                                    VideoPreferencesFragment.v(obj3, obj8, obj9, textView, videoPreferencesFragment4);
                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj32, obj22, button, button2);
                                    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: um7
                                        @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                        public final void onCheckedChanged(RadioGroup radioGroup2, int i7) {
                                            Object obj10;
                                            jq1 jq1Var2;
                                            radioGroup2.getClass();
                                            Iterator it = m0.entrySet().iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj10 = it.next();
                                                    if (((Number) ((Map.Entry) obj10).getValue()).intValue() == i7) {
                                                        break;
                                                    }
                                                } else {
                                                    obj10 = null;
                                                    break;
                                                }
                                            }
                                            Map.Entry entry = (Map.Entry) obj10;
                                            if (entry != null && (jq1Var2 = (jq1) entry.getKey()) != null) {
                                                dh5 dh5Var = obj3;
                                                dh5Var.A = jq1Var2;
                                                jq1 jq1Var3 = jq1.OFF;
                                                SwitchCompat switchCompat3 = switchCompat2;
                                                zg5 zg5Var = obj32;
                                                if (jq1Var2 == jq1Var3) {
                                                    switchCompat3.setChecked(false);
                                                    zg5Var.A = false;
                                                }
                                                VideoPreferencesFragment.u(dh5Var, textView2, switchCompat, switchCompat3, zg5Var, obj22, button, button2);
                                                VideoPreferencesFragment.v(dh5Var, obj8, obj9, textView, videoPreferencesFragment4);
                                            }
                                        }
                                    });
                                    switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                            switch (r9) {
                                                case 0:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var = obj22;
                                                    zg5Var.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj32, zg5Var, button, button2);
                                                    return;
                                                default:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var2 = obj22;
                                                    zg5Var2.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, zg5Var2, obj32, button, button2);
                                                    return;
                                            }
                                        }
                                    });
                                    switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                            switch (r9) {
                                                case 0:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var = obj32;
                                                    zg5Var.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj22, zg5Var, button, button2);
                                                    return;
                                                default:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var2 = obj32;
                                                    zg5Var2.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, zg5Var2, obj22, button, button2);
                                                    return;
                                            }
                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() { // from class: xm7
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            final boolean z18;
                                            boolean z19;
                                            boolean z20;
                                            int i7;
                                            if (dh5.this.A != jq1.OFF && (obj32.A || obj22.A)) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            zg5 zg5Var = obj4;
                                            boolean z21 = zg5Var.A;
                                            zg5 zg5Var2 = obj5;
                                            boolean z22 = zg5Var2.A;
                                            zg5 zg5Var3 = obj6;
                                            boolean z23 = zg5Var3.A;
                                            zg5 zg5Var4 = obj7;
                                            boolean z24 = zg5Var4.A;
                                            final jb7 jb7Var = new jb7(zg5Var, zg5Var2, zg5Var3, zg5Var4, 1);
                                            VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                            View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_fill_area, (ViewGroup) null);
                                            TextView textView3 = (TextView) inflate2.findViewById(R.id.textFillAreaDisabled);
                                            final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillEnabled);
                                            final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillHeight);
                                            final SwitchCompat switchCompat5 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillWidth);
                                            final SwitchCompat switchCompat6 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillEnabled);
                                            final SwitchCompat switchCompat7 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillHeight);
                                            final SwitchCompat switchCompat8 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillWidth);
                                            ((TextView) inflate2.findViewById(R.id.textFillAreaDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_fill_area_description));
                                            switchCompat4.setChecked(z21);
                                            switchCompat5.setChecked(z22);
                                            switchCompat7.setChecked(z23);
                                            switchCompat8.setChecked(z24);
                                            if (!z21 && !z22) {
                                                z19 = false;
                                            } else {
                                                z19 = true;
                                            }
                                            switchCompat3.setChecked(z19);
                                            if (!z23 && !z24) {
                                                z20 = false;
                                            } else {
                                                z20 = true;
                                            }
                                            switchCompat6.setChecked(z20);
                                            switchCompat3.setEnabled(z18);
                                            switchCompat6.setEnabled(z18);
                                            VideoPreferencesFragment.x(z18, switchCompat4, switchCompat5, switchCompat3.isChecked(), false);
                                            VideoPreferencesFragment.w(z18, switchCompat7, switchCompat8, switchCompat6.isChecked(), false);
                                            switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                    int i8 = r4;
                                                    SwitchCompat switchCompat9 = switchCompat5;
                                                    SwitchCompat switchCompat10 = switchCompat4;
                                                    boolean z26 = z18;
                                                    switch (i8) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                    }
                                                }
                                            });
                                            switchCompat6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                    int i8 = r4;
                                                    SwitchCompat switchCompat9 = switchCompat8;
                                                    SwitchCompat switchCompat10 = switchCompat7;
                                                    boolean z26 = z18;
                                                    switch (i8) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                    }
                                                }
                                            });
                                            textView3.getClass();
                                            if (!z18) {
                                                i7 = 0;
                                            } else {
                                                i7 = 8;
                                            }
                                            textView3.setVisibility(i7);
                                            zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                            zbVar3.z(R.string.dual_screen_fill_area_title);
                                            zbVar3.A(inflate2);
                                            zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: fn7
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i8) {
                                                    boolean z25;
                                                    boolean z26;
                                                    boolean z27;
                                                    boolean z28;
                                                    boolean z29 = z18;
                                                    boolean z30 = true;
                                                    boolean z31 = false;
                                                    if (z29 && switchCompat3.isChecked()) {
                                                        z25 = true;
                                                    } else {
                                                        z25 = false;
                                                    }
                                                    if (!z29 || !switchCompat6.isChecked()) {
                                                        z30 = false;
                                                    }
                                                    if (z25) {
                                                        z26 = switchCompat4.isChecked();
                                                    } else {
                                                        z26 = false;
                                                    }
                                                    Boolean valueOf = Boolean.valueOf(z26);
                                                    if (z25) {
                                                        z27 = switchCompat5.isChecked();
                                                    } else {
                                                        z27 = false;
                                                    }
                                                    Boolean valueOf2 = Boolean.valueOf(z27);
                                                    if (z30) {
                                                        z28 = switchCompat7.isChecked();
                                                    } else {
                                                        z28 = false;
                                                    }
                                                    Boolean valueOf3 = Boolean.valueOf(z28);
                                                    if (z30) {
                                                        z31 = switchCompat8.isChecked();
                                                    }
                                                    jb7Var.l(valueOf, valueOf2, valueOf3, Boolean.valueOf(z31));
                                                }
                                            });
                                            zbVar3.x(R.string.cancel, null);
                                            zbVar3.B();
                                        }
                                    });
                                    button2.setOnClickListener(new View.OnClickListener() { // from class: ym7
                                        /* JADX WARN: Type inference failed for: r11v6, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r12v3, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r14v2, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r7v4, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r8v2, types: [zg5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r9v2, types: [zg5, java.lang.Object] */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            p66 p66Var;
                                            p66 p66Var2;
                                            boolean z18;
                                            boolean z19;
                                            int i7;
                                            int i8;
                                            dh5 dh5Var = obj3;
                                            jq1 jq1Var2 = (jq1) dh5Var.A;
                                            dh5 dh5Var2 = obj8;
                                            p66 p66Var3 = (p66) dh5Var2.A;
                                            dh5 dh5Var3 = obj9;
                                            p66 p66Var4 = (p66) dh5Var3.A;
                                            TextView textView3 = textView;
                                            VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                            ne4 ne4Var = new ne4(dh5Var2, dh5Var3, textView3, videoPreferencesFragment5, dh5Var, 8);
                                            View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_vertical_alignment, (ViewGroup) null);
                                            ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_description));
                                            ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDefaults)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_default_hint, videoPreferencesFragment5.m(lb4.r(jq1Var2)), videoPreferencesFragment5.m(lb4.q(jq1Var2))));
                                            final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalAlignmentOverride);
                                            final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalAlignmentOverride);
                                            RadioGroup radioGroup2 = (RadioGroup) inflate2.findViewById(R.id.radioGroupInternalAlignment);
                                            RadioGroup radioGroup3 = (RadioGroup) inflate2.findViewById(R.id.radioGroupExternalAlignment);
                                            p66 p66Var5 = p66.TOP;
                                            vr4 vr4Var = new vr4(p66Var5, inflate2.findViewById(R.id.radioInternalAlignmentTop));
                                            p66 p66Var6 = p66.CENTER;
                                            vr4 vr4Var2 = new vr4(p66Var6, inflate2.findViewById(R.id.radioInternalAlignmentCenter));
                                            p66 p66Var7 = p66.BOTTOM;
                                            final Map m02 = c14.m0(vr4Var, vr4Var2, new vr4(p66Var7, inflate2.findViewById(R.id.radioInternalAlignmentBottom)));
                                            final Map m03 = c14.m0(new vr4(p66Var5, inflate2.findViewById(R.id.radioExternalAlignmentTop)), new vr4(p66Var6, inflate2.findViewById(R.id.radioExternalAlignmentCenter)), new vr4(p66Var7, inflate2.findViewById(R.id.radioExternalAlignmentBottom)));
                                            final dh5 obj10 = new Object();
                                            if (p66Var3 == null) {
                                                p66Var = lb4.r(jq1Var2);
                                            } else {
                                                p66Var = p66Var3;
                                            }
                                            obj10.A = p66Var;
                                            final dh5 obj11 = new Object();
                                            if (p66Var4 == null) {
                                                p66Var2 = lb4.q(jq1Var2);
                                            } else {
                                                p66Var2 = p66Var4;
                                            }
                                            obj11.A = p66Var2;
                                            final dh5 obj12 = new Object();
                                            obj12.A = p66Var3;
                                            final dh5 obj13 = new Object();
                                            obj13.A = p66Var4;
                                            final zg5 obj14 = new Object();
                                            final zg5 obj15 = new Object();
                                            if (obj12.A != null) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            switchCompat3.setChecked(z18);
                                            if (obj13.A != null) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            switchCompat4.setChecked(z19);
                                            obj14.A = true;
                                            RadioButton radioButton = (RadioButton) m02.get(obj10.A);
                                            if (radioButton != null) {
                                                i7 = radioButton.getId();
                                            } else {
                                                i7 = R.id.radioInternalAlignmentTop;
                                            }
                                            radioGroup2.check(i7);
                                            obj14.A = false;
                                            obj15.A = true;
                                            RadioButton radioButton2 = (RadioButton) m03.get(obj11.A);
                                            if (radioButton2 != null) {
                                                i8 = radioButton2.getId();
                                            } else {
                                                i8 = R.id.radioExternalAlignmentTop;
                                            }
                                            radioGroup3.check(i8);
                                            obj15.A = false;
                                            VideoPreferencesFragment.C(m02.values(), switchCompat3.isChecked());
                                            VideoPreferencesFragment.C(m03.values(), switchCompat4.isChecked());
                                            switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                    int i9 = r4;
                                                    p66 p66Var8 = null;
                                                    dh5 dh5Var4 = obj10;
                                                    dh5 dh5Var5 = obj12;
                                                    Map map = m02;
                                                    switch (i9) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                    }
                                                }
                                            });
                                            switchCompat4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                    int i9 = r4;
                                                    p66 p66Var8 = null;
                                                    dh5 dh5Var4 = obj11;
                                                    dh5 dh5Var5 = obj13;
                                                    Map map = m03;
                                                    switch (i9) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                    }
                                                }
                                            });
                                            radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                    p66 p66Var8;
                                                    p66 p66Var9;
                                                    int i10 = r5;
                                                    dh5 dh5Var4 = obj12;
                                                    SwitchCompat switchCompat5 = switchCompat3;
                                                    dh5 dh5Var5 = obj10;
                                                    zg5 zg5Var = obj14;
                                                    switch (i10) {
                                                        case 0:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioInternalAlignmentTop) {
                                                                    p66Var8 = p66.TOP;
                                                                } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                    p66Var8 = p66.CENTER;
                                                                } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                    p66Var8 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var8 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var8;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioExternalAlignmentTop) {
                                                                    p66Var9 = p66.TOP;
                                                                } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                    p66Var9 = p66.CENTER;
                                                                } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                    p66Var9 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var9 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var9;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                    p66 p66Var8;
                                                    p66 p66Var9;
                                                    int i10 = r5;
                                                    dh5 dh5Var4 = obj13;
                                                    SwitchCompat switchCompat5 = switchCompat4;
                                                    dh5 dh5Var5 = obj11;
                                                    zg5 zg5Var = obj15;
                                                    switch (i10) {
                                                        case 0:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioInternalAlignmentTop) {
                                                                    p66Var8 = p66.TOP;
                                                                } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                    p66Var8 = p66.CENTER;
                                                                } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                    p66Var8 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var8 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var8;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioExternalAlignmentTop) {
                                                                    p66Var9 = p66.TOP;
                                                                } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                    p66Var9 = p66.CENTER;
                                                                } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                    p66Var9 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var9 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var9;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                            zbVar3.z(R.string.dual_screen_vertical_alignment_title);
                                            zbVar3.A(inflate2);
                                            zbVar3.y(R.string.ok, new qu1(ne4Var, obj12, obj13, 6));
                                            zbVar3.x(R.string.cancel, null);
                                            zbVar3.B();
                                        }
                                    });
                                    zb zbVar3 = new zb(videoPreferencesFragment4.requireContext());
                                    zbVar3.z(R.string.dual_screen_presets_settings_title);
                                    zbVar3.A(inflate);
                                    zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: zm7
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i7) {
                                            boolean z18;
                                            VideoPreferencesFragment videoPreferencesFragment5 = VideoPreferencesFragment.this;
                                            kd6 o = videoPreferencesFragment5.o();
                                            dh5 dh5Var = obj3;
                                            jq1 jq1Var2 = (jq1) dh5Var.A;
                                            jq1Var2.getClass();
                                            SharedPreferences.Editor edit = ((ng6) o).b.edit();
                                            String lowerCase = jq1Var2.name().toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                            edit.putString("dual_screen_preset", lowerCase);
                                            edit.apply();
                                            kd6 o2 = videoPreferencesFragment5.o();
                                            boolean z19 = obj22.A;
                                            SharedPreferences.Editor edit2 = ((ng6) o2).b.edit();
                                            edit2.putBoolean("external_display_keep_ratio", z19);
                                            edit2.apply();
                                            kd6 o3 = videoPreferencesFragment5.o();
                                            if (obj32.A && dh5Var.A != jq1.OFF) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            SharedPreferences.Editor edit3 = ((ng6) o3).b.edit();
                                            edit3.putBoolean("dual_screen_integer_scale", z18);
                                            edit3.apply();
                                            kd6 o4 = videoPreferencesFragment5.o();
                                            boolean z20 = obj4.A;
                                            SharedPreferences.Editor edit4 = ((ng6) o4).b.edit();
                                            edit4.putBoolean("dual_screen_internal_fill_height", z20);
                                            edit4.apply();
                                            kd6 o5 = videoPreferencesFragment5.o();
                                            boolean z21 = obj5.A;
                                            SharedPreferences.Editor edit5 = ((ng6) o5).b.edit();
                                            edit5.putBoolean("dual_screen_internal_fill_width", z21);
                                            edit5.apply();
                                            kd6 o6 = videoPreferencesFragment5.o();
                                            boolean z22 = obj6.A;
                                            SharedPreferences.Editor edit6 = ((ng6) o6).b.edit();
                                            edit6.putBoolean("dual_screen_external_fill_height", z22);
                                            edit6.apply();
                                            kd6 o7 = videoPreferencesFragment5.o();
                                            boolean z23 = obj7.A;
                                            SharedPreferences.Editor edit7 = ((ng6) o7).b.edit();
                                            edit7.putBoolean("dual_screen_external_fill_width", z23);
                                            edit7.apply();
                                            ((ng6) videoPreferencesFragment5.o()).N((p66) obj8.A);
                                            ((ng6) videoPreferencesFragment5.o()).M((p66) obj9.A);
                                            videoPreferencesFragment5.E();
                                        }
                                    });
                                    zbVar3.x(R.string.cancel, null);
                                    zbVar3.B();
                                    return;
                            }
                        }
                    });
                    findPreference27.setOnPreferenceClickListener(new y05(this) { // from class: an7
                        public final /* synthetic */ VideoPreferencesFragment B;

                        {
                            this.B = this;
                        }

                        @Override // defpackage.y05
                        public final void i(Preference preference5) {
                            int i6;
                            switch (r4) {
                                case 0:
                                    final VideoPreferencesFragment videoPreferencesFragment = this.B;
                                    List<zq7> n = ((ng6) videoPreferencesFragment.o()).n();
                                    String str4 = "system";
                                    List b0 = hf.b0("system");
                                    ArrayList arrayList8 = new ArrayList(ht0.v0(n, 10));
                                    for (zq7 zq7Var : n) {
                                        arrayList8.add(zq7Var.a);
                                    }
                                    final List V0 = gt0.V0(b0, arrayList8);
                                    List b02 = hf.b0(videoPreferencesFragment.getString(R.string.video_vulkan_driver_mode_system));
                                    ArrayList arrayList9 = new ArrayList(ht0.v0(n, 10));
                                    for (zq7 zq7Var2 : n) {
                                        arrayList9.add(zq7Var2.b);
                                    }
                                    ArrayList V02 = gt0.V0(b02, arrayList9);
                                    final ListPreference listPreference4 = listPreference3;
                                    String str5 = listPreference4.e0;
                                    if (str5 != null) {
                                        str4 = str5;
                                    }
                                    int indexOf = V0.indexOf(str4);
                                    Integer valueOf = Integer.valueOf(indexOf);
                                    if (indexOf < 0) {
                                        valueOf = null;
                                    }
                                    if (valueOf != null) {
                                        i6 = valueOf.intValue();
                                    } else {
                                        i6 = 0;
                                    }
                                    zb zbVar = new zb(videoPreferencesFragment.requireContext());
                                    zbVar.z(R.string.video_vulkan_driver_mode);
                                    final Preference preference6 = findPreference27;
                                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: bn7
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i7) {
                                            int i8 = r5;
                                            Preference preference72 = preference6;
                                            ListPreference listPreference52 = listPreference4;
                                            VideoPreferencesFragment videoPreferencesFragment22 = videoPreferencesFragment;
                                            List list = V0;
                                            switch (i8) {
                                                case 0:
                                                    String str6 = (String) ((ArrayList) list).get(i7);
                                                    if (nb3.k(str6, "system")) {
                                                        ((ng6) videoPreferencesFragment22.o()).P(sr7.SYSTEM);
                                                    } else {
                                                        ((ng6) videoPreferencesFragment22.o()).O(str6);
                                                    }
                                                    videoPreferencesFragment22.K(listPreference52, preference72);
                                                    dialogInterface.dismiss();
                                                    return;
                                                default:
                                                    zq7 zq7Var32 = (zq7) list.get(i7);
                                                    u63 u63Var = videoPreferencesFragment22.v0;
                                                    if (u63Var != null) {
                                                        u63Var.D(zq7Var32.a);
                                                        videoPreferencesFragment22.K(listPreference52, preference72);
                                                        Toast.makeText(videoPreferencesFragment22.requireContext(), videoPreferencesFragment22.getString(R.string.video_vulkan_driver_removed, zq7Var32.b), 1).show();
                                                        return;
                                                    }
                                                    nb3.a0("adrenoVulkanDriverManager");
                                                    throw null;
                                            }
                                        }
                                    };
                                    wb wbVar = (wb) zbVar.L;
                                    wbVar.q = (CharSequence[]) V02.toArray(new String[0]);
                                    wbVar.s = onClickListener;
                                    wbVar.y = i6;
                                    wbVar.x = true;
                                    zbVar.x(17039360, null);
                                    zbVar.B();
                                    return;
                                default:
                                    final VideoPreferencesFragment videoPreferencesFragment2 = this.B;
                                    final List n2 = ((ng6) videoPreferencesFragment2.o()).n();
                                    if (n2.isEmpty()) {
                                        Toast.makeText(videoPreferencesFragment2.requireContext(), (int) R.string.video_vulkan_driver_no_custom, 0).show();
                                        return;
                                    }
                                    zb zbVar2 = new zb(videoPreferencesFragment2.requireContext());
                                    zbVar2.z(R.string.video_vulkan_driver_remove);
                                    ArrayList arrayList10 = new ArrayList(ht0.v0(n2, 10));
                                    for (zq7 zq7Var3 : n2) {
                                        arrayList10.add(zq7Var3.b);
                                    }
                                    final ListPreference listPreference5 = listPreference3;
                                    final Preference preference7 = findPreference27;
                                    zbVar2.v((CharSequence[]) arrayList10.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: bn7
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i7) {
                                            int i8 = r5;
                                            Preference preference72 = preference7;
                                            ListPreference listPreference52 = listPreference5;
                                            VideoPreferencesFragment videoPreferencesFragment22 = videoPreferencesFragment2;
                                            List list = n2;
                                            switch (i8) {
                                                case 0:
                                                    String str6 = (String) ((ArrayList) list).get(i7);
                                                    if (nb3.k(str6, "system")) {
                                                        ((ng6) videoPreferencesFragment22.o()).P(sr7.SYSTEM);
                                                    } else {
                                                        ((ng6) videoPreferencesFragment22.o()).O(str6);
                                                    }
                                                    videoPreferencesFragment22.K(listPreference52, preference72);
                                                    dialogInterface.dismiss();
                                                    return;
                                                default:
                                                    zq7 zq7Var32 = (zq7) list.get(i7);
                                                    u63 u63Var = videoPreferencesFragment22.v0;
                                                    if (u63Var != null) {
                                                        u63Var.D(zq7Var32.a);
                                                        videoPreferencesFragment22.K(listPreference52, preference72);
                                                        Toast.makeText(videoPreferencesFragment22.requireContext(), videoPreferencesFragment22.getString(R.string.video_vulkan_driver_removed, zq7Var32.b), 1).show();
                                                        return;
                                                    }
                                                    nb3.a0("adrenoVulkanDriverManager");
                                                    throw null;
                                            }
                                        }
                                    });
                                    zbVar2.x(17039360, null);
                                    zbVar2.B();
                                    return;
                            }
                        }
                    });
                    J(videoRenderer, preferenceCategory3, preference4, listPreference3, findPreference27, booleanExtra);
                    yh2.g(storagePickerPreference5, new qm7(this, listPreference2));
                    G(this, listPreference2, null, false, 6);
                    this.r0 = storagePickerPreference5;
                    this.s0 = listPreference2;
                    Preference findPreference29 = findPreference("video_retroarch_shader_source");
                    findPreference29.getClass();
                    this.o0 = findPreference29;
                    findPreference29.setOnPreferenceClickListener(new y05(this) { // from class: om7
                        public final /* synthetic */ VideoPreferencesFragment B;

                        {
                            this.B = this;
                        }

                        /* JADX WARN: Type inference failed for: r10v4, types: [dh5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r1v15, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r2v28, types: [dh5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r3v14, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r4v22, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r6v6, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r7v6, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r8v6, types: [zg5, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r9v5, types: [dh5, java.lang.Object] */
                        @Override // defpackage.y05
                        public final void i(Preference preference32) {
                            RandomAccess randomAccess;
                            final List yt1Var;
                            String P0;
                            boolean z10;
                            switch (r2) {
                                case 0:
                                    this.B.B();
                                    return;
                                case 1:
                                    VideoPreferencesFragment videoPreferencesFragment = this.B;
                                    if (videoPreferencesFragment.p().d() != null) {
                                        Context requireContext3 = videoPreferencesFragment.requireContext();
                                        requireContext3.getClass();
                                        String[] strArr = {videoPreferencesFragment.getString(R.string.video_retroarch_shader_check_updates), videoPreferencesFragment.getString(R.string.video_retroarch_shader_reinstall), videoPreferencesFragment.getString(R.string.video_retroarch_shader_uninstall)};
                                        zb zbVar = new zb(requireContext3);
                                        zbVar.z(R.string.video_retroarch_shader_installed_title);
                                        zbVar.v(strArr, new k(videoPreferencesFragment, 0));
                                        zbVar.x(17039360, null);
                                        zbVar.B();
                                        return;
                                    }
                                    videoPreferencesFragment.D();
                                    return;
                                case 2:
                                    final VideoPreferencesFragment videoPreferencesFragment2 = this.B;
                                    ae6 ae6Var = videoPreferencesFragment2.h0;
                                    if (ae6Var != null) {
                                        synchronized (ae6Var) {
                                            try {
                                                if (ae6Var.a.isFile()) {
                                                    randomAccess = jc2.A0(ae6Var.a);
                                                } else {
                                                    randomAccess = yt1.A;
                                                }
                                                RandomAccess randomAccess2 = yt1.A;
                                                boolean z11 = randomAccess instanceof em5;
                                                RandomAccess randomAccess3 = randomAccess;
                                                if (z11) {
                                                    randomAccess3 = randomAccess2;
                                                }
                                                yt1Var = (List) randomAccess3;
                                            }
                                        }
                                        if (yt1Var.isEmpty()) {
                                            P0 = videoPreferencesFragment2.getString(R.string.shader_compatibility_report_empty);
                                        } else {
                                            P0 = gt0.P0(new l14(yt1Var), "\n\n", null, null, null, 62);
                                        }
                                        P0.getClass();
                                        zb zbVar2 = new zb(videoPreferencesFragment2.requireContext());
                                        zbVar2.z(R.string.shader_compatibility_report_title);
                                        ((wb) zbVar2.L).f = P0;
                                        zbVar2.y(17039370, null);
                                        if (!yt1Var.isEmpty()) {
                                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: me.magnum.melonds.ui.settings.fragments.j
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i52) {
                                                    VideoPreferencesFragment videoPreferencesFragment3 = VideoPreferencesFragment.this;
                                                    Uri uri = (Uri) fv.E0(((ng6) videoPreferencesFragment3.o()).r());
                                                    if (uri == null) {
                                                        Toast.makeText(videoPreferencesFragment3.requireContext(), (int) R.string.shader_compatibility_report_no_rom_folder, 1).show();
                                                    } else {
                                                        hv.L(bl2.C(videoPreferencesFragment3), null, null, new VideoPreferencesFragment$saveShaderCompatibilityLog$1(videoPreferencesFragment3, uri, yt1Var, null), 3);
                                                    }
                                                }
                                            };
                                            wb wbVar = (wb) zbVar2.L;
                                            wbVar.k = wbVar.a.getText(R.string.shader_compatibility_report_save);
                                            wbVar.l = onClickListener;
                                            zbVar2.x(R.string.shader_compatibility_report_clear, new rm7(videoPreferencesFragment2, 2));
                                        }
                                        zbVar2.B();
                                        return;
                                    }
                                    nb3.a0("shaderCompatibilityLog");
                                    throw null;
                                case 3:
                                    VideoPreferencesFragment videoPreferencesFragment3 = this.B;
                                    videoPreferencesFragment3.startActivity(new Intent(videoPreferencesFragment3.requireContext(), VulkanDriverManagerActivity.class));
                                    return;
                                case 4:
                                    this.B.C0.a(new String[]{"application/zip", "application/x-zip-compressed", "application/octet-stream", "application/x-compressed"});
                                    return;
                                default:
                                    final VideoPreferencesFragment videoPreferencesFragment4 = this.B;
                                    jq1 i52 = ((ng6) videoPreferencesFragment4.o()).i();
                                    boolean z12 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("external_display_keep_ratio", true);
                                    boolean z13 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_integer_scale", false);
                                    boolean z14 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_height", false);
                                    boolean z15 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_internal_fill_width", false);
                                    boolean z16 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_height", false);
                                    boolean z17 = ((ng6) videoPreferencesFragment4.o()).b.getBoolean("dual_screen_external_fill_width", false);
                                    p66 h = ((ng6) videoPreferencesFragment4.o()).h();
                                    p66 g = ((ng6) videoPreferencesFragment4.o()).g();
                                    View inflate = LayoutInflater.from(videoPreferencesFragment4.requireContext()).inflate(R.layout.dialog_dual_screen_presets, (ViewGroup) null);
                                    RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radioGroupPresets);
                                    final SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.switchKeepAspectRatio);
                                    final SwitchCompat switchCompat2 = (SwitchCompat) inflate.findViewById(R.id.switchIntegerScale);
                                    final Button button = (Button) inflate.findViewById(R.id.buttonFillAreaOptions);
                                    final Button button2 = (Button) inflate.findViewById(R.id.buttonVerticalAlignmentOptions);
                                    final TextView textView = (TextView) inflate.findViewById(R.id.textVerticalAlignmentSummary);
                                    final TextView textView2 = (TextView) inflate.findViewById(R.id.textPresetsDisabledHint);
                                    jq1 jq1Var = jq1.OFF;
                                    int i6 = R.id.radioPresetOff;
                                    final Map m0 = c14.m0(new vr4(jq1Var, Integer.valueOf((int) R.id.radioPresetOff)), new vr4(jq1.INTERNAL_TOP_EXTERNAL_BOTTOM, Integer.valueOf((int) R.id.radioPresetInternalTopExternalBottom)), new vr4(jq1.INTERNAL_BOTTOM_EXTERNAL_TOP, Integer.valueOf((int) R.id.radioPresetInternalBottomExternalTop)));
                                    final dh5 obj3 = new Object();
                                    obj3.A = i52;
                                    final zg5 obj22 = new Object();
                                    obj22.A = z12;
                                    final zg5 obj32 = new Object();
                                    if (z13 && i52 != jq1Var) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    obj32.A = z10;
                                    final zg5 obj4 = new Object();
                                    obj4.A = z14;
                                    final zg5 obj5 = new Object();
                                    obj5.A = z15;
                                    final zg5 obj6 = new Object();
                                    obj6.A = z16;
                                    final zg5 obj7 = new Object();
                                    obj7.A = z17;
                                    final dh5 obj8 = new Object();
                                    obj8.A = h;
                                    final dh5 obj9 = new Object();
                                    obj9.A = g;
                                    Integer num = (Integer) m0.get(i52);
                                    if (num != null) {
                                        i6 = num.intValue();
                                    }
                                    radioGroup.check(i6);
                                    switchCompat.setChecked(obj22.A);
                                    switchCompat2.setChecked(obj32.A);
                                    VideoPreferencesFragment.v(obj3, obj8, obj9, textView, videoPreferencesFragment4);
                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj32, obj22, button, button2);
                                    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: um7
                                        @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                        public final void onCheckedChanged(RadioGroup radioGroup2, int i7) {
                                            Object obj10;
                                            jq1 jq1Var2;
                                            radioGroup2.getClass();
                                            Iterator it = m0.entrySet().iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    obj10 = it.next();
                                                    if (((Number) ((Map.Entry) obj10).getValue()).intValue() == i7) {
                                                        break;
                                                    }
                                                } else {
                                                    obj10 = null;
                                                    break;
                                                }
                                            }
                                            Map.Entry entry = (Map.Entry) obj10;
                                            if (entry != null && (jq1Var2 = (jq1) entry.getKey()) != null) {
                                                dh5 dh5Var = obj3;
                                                dh5Var.A = jq1Var2;
                                                jq1 jq1Var3 = jq1.OFF;
                                                SwitchCompat switchCompat3 = switchCompat2;
                                                zg5 zg5Var = obj32;
                                                if (jq1Var2 == jq1Var3) {
                                                    switchCompat3.setChecked(false);
                                                    zg5Var.A = false;
                                                }
                                                VideoPreferencesFragment.u(dh5Var, textView2, switchCompat, switchCompat3, zg5Var, obj22, button, button2);
                                                VideoPreferencesFragment.v(dh5Var, obj8, obj9, textView, videoPreferencesFragment4);
                                            }
                                        }
                                    });
                                    switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                            switch (r9) {
                                                case 0:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var = obj22;
                                                    zg5Var.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj32, zg5Var, button, button2);
                                                    return;
                                                default:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var2 = obj22;
                                                    zg5Var2.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, zg5Var2, obj32, button, button2);
                                                    return;
                                            }
                                        }
                                    });
                                    switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vm7
                                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z18) {
                                            switch (r9) {
                                                case 0:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var = obj32;
                                                    zg5Var.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, obj22, zg5Var, button, button2);
                                                    return;
                                                default:
                                                    compoundButton.getClass();
                                                    zg5 zg5Var2 = obj32;
                                                    zg5Var2.A = z18;
                                                    VideoPreferencesFragment.u(obj3, textView2, switchCompat, switchCompat2, zg5Var2, obj22, button, button2);
                                                    return;
                                            }
                                        }
                                    });
                                    button.setOnClickListener(new View.OnClickListener() { // from class: xm7
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            final boolean z18;
                                            boolean z19;
                                            boolean z20;
                                            int i7;
                                            if (dh5.this.A != jq1.OFF && (obj32.A || obj22.A)) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            zg5 zg5Var = obj4;
                                            boolean z21 = zg5Var.A;
                                            zg5 zg5Var2 = obj5;
                                            boolean z22 = zg5Var2.A;
                                            zg5 zg5Var3 = obj6;
                                            boolean z23 = zg5Var3.A;
                                            zg5 zg5Var4 = obj7;
                                            boolean z24 = zg5Var4.A;
                                            final jb7 jb7Var = new jb7(zg5Var, zg5Var2, zg5Var3, zg5Var4, 1);
                                            VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                            View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_fill_area, (ViewGroup) null);
                                            TextView textView3 = (TextView) inflate2.findViewById(R.id.textFillAreaDisabled);
                                            final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillEnabled);
                                            final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillHeight);
                                            final SwitchCompat switchCompat5 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalFillWidth);
                                            final SwitchCompat switchCompat6 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillEnabled);
                                            final SwitchCompat switchCompat7 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillHeight);
                                            final SwitchCompat switchCompat8 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalFillWidth);
                                            ((TextView) inflate2.findViewById(R.id.textFillAreaDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_fill_area_description));
                                            switchCompat4.setChecked(z21);
                                            switchCompat5.setChecked(z22);
                                            switchCompat7.setChecked(z23);
                                            switchCompat8.setChecked(z24);
                                            if (!z21 && !z22) {
                                                z19 = false;
                                            } else {
                                                z19 = true;
                                            }
                                            switchCompat3.setChecked(z19);
                                            if (!z23 && !z24) {
                                                z20 = false;
                                            } else {
                                                z20 = true;
                                            }
                                            switchCompat6.setChecked(z20);
                                            switchCompat3.setEnabled(z18);
                                            switchCompat6.setEnabled(z18);
                                            VideoPreferencesFragment.x(z18, switchCompat4, switchCompat5, switchCompat3.isChecked(), false);
                                            VideoPreferencesFragment.w(z18, switchCompat7, switchCompat8, switchCompat6.isChecked(), false);
                                            switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                    int i8 = r4;
                                                    SwitchCompat switchCompat9 = switchCompat5;
                                                    SwitchCompat switchCompat10 = switchCompat4;
                                                    boolean z26 = z18;
                                                    switch (i8) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                    }
                                                }
                                            });
                                            switchCompat6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: en7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z25) {
                                                    int i8 = r4;
                                                    SwitchCompat switchCompat9 = switchCompat8;
                                                    SwitchCompat switchCompat10 = switchCompat7;
                                                    boolean z26 = z18;
                                                    switch (i8) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.x(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.w(z26, switchCompat10, switchCompat9, z25, true);
                                                            return;
                                                    }
                                                }
                                            });
                                            textView3.getClass();
                                            if (!z18) {
                                                i7 = 0;
                                            } else {
                                                i7 = 8;
                                            }
                                            textView3.setVisibility(i7);
                                            zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                            zbVar3.z(R.string.dual_screen_fill_area_title);
                                            zbVar3.A(inflate2);
                                            zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: fn7
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i8) {
                                                    boolean z25;
                                                    boolean z26;
                                                    boolean z27;
                                                    boolean z28;
                                                    boolean z29 = z18;
                                                    boolean z30 = true;
                                                    boolean z31 = false;
                                                    if (z29 && switchCompat3.isChecked()) {
                                                        z25 = true;
                                                    } else {
                                                        z25 = false;
                                                    }
                                                    if (!z29 || !switchCompat6.isChecked()) {
                                                        z30 = false;
                                                    }
                                                    if (z25) {
                                                        z26 = switchCompat4.isChecked();
                                                    } else {
                                                        z26 = false;
                                                    }
                                                    Boolean valueOf = Boolean.valueOf(z26);
                                                    if (z25) {
                                                        z27 = switchCompat5.isChecked();
                                                    } else {
                                                        z27 = false;
                                                    }
                                                    Boolean valueOf2 = Boolean.valueOf(z27);
                                                    if (z30) {
                                                        z28 = switchCompat7.isChecked();
                                                    } else {
                                                        z28 = false;
                                                    }
                                                    Boolean valueOf3 = Boolean.valueOf(z28);
                                                    if (z30) {
                                                        z31 = switchCompat8.isChecked();
                                                    }
                                                    jb7Var.l(valueOf, valueOf2, valueOf3, Boolean.valueOf(z31));
                                                }
                                            });
                                            zbVar3.x(R.string.cancel, null);
                                            zbVar3.B();
                                        }
                                    });
                                    button2.setOnClickListener(new View.OnClickListener() { // from class: ym7
                                        /* JADX WARN: Type inference failed for: r11v6, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r12v3, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r14v2, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r7v4, types: [dh5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r8v2, types: [zg5, java.lang.Object] */
                                        /* JADX WARN: Type inference failed for: r9v2, types: [zg5, java.lang.Object] */
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            p66 p66Var;
                                            p66 p66Var2;
                                            boolean z18;
                                            boolean z19;
                                            int i7;
                                            int i8;
                                            dh5 dh5Var = obj3;
                                            jq1 jq1Var2 = (jq1) dh5Var.A;
                                            dh5 dh5Var2 = obj8;
                                            p66 p66Var3 = (p66) dh5Var2.A;
                                            dh5 dh5Var3 = obj9;
                                            p66 p66Var4 = (p66) dh5Var3.A;
                                            TextView textView3 = textView;
                                            VideoPreferencesFragment videoPreferencesFragment5 = videoPreferencesFragment4;
                                            ne4 ne4Var = new ne4(dh5Var2, dh5Var3, textView3, videoPreferencesFragment5, dh5Var, 8);
                                            View inflate2 = LayoutInflater.from(videoPreferencesFragment5.requireContext()).inflate(R.layout.dialog_dual_screen_vertical_alignment, (ViewGroup) null);
                                            ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDescription)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_description));
                                            ((TextView) inflate2.findViewById(R.id.textVerticalAlignmentDefaults)).setText(videoPreferencesFragment5.getString(R.string.dual_screen_vertical_alignment_default_hint, videoPreferencesFragment5.m(lb4.r(jq1Var2)), videoPreferencesFragment5.m(lb4.q(jq1Var2))));
                                            final SwitchCompat switchCompat3 = (SwitchCompat) inflate2.findViewById(R.id.switchInternalAlignmentOverride);
                                            final SwitchCompat switchCompat4 = (SwitchCompat) inflate2.findViewById(R.id.switchExternalAlignmentOverride);
                                            RadioGroup radioGroup2 = (RadioGroup) inflate2.findViewById(R.id.radioGroupInternalAlignment);
                                            RadioGroup radioGroup3 = (RadioGroup) inflate2.findViewById(R.id.radioGroupExternalAlignment);
                                            p66 p66Var5 = p66.TOP;
                                            vr4 vr4Var = new vr4(p66Var5, inflate2.findViewById(R.id.radioInternalAlignmentTop));
                                            p66 p66Var6 = p66.CENTER;
                                            vr4 vr4Var2 = new vr4(p66Var6, inflate2.findViewById(R.id.radioInternalAlignmentCenter));
                                            p66 p66Var7 = p66.BOTTOM;
                                            final Map m02 = c14.m0(vr4Var, vr4Var2, new vr4(p66Var7, inflate2.findViewById(R.id.radioInternalAlignmentBottom)));
                                            final Map m03 = c14.m0(new vr4(p66Var5, inflate2.findViewById(R.id.radioExternalAlignmentTop)), new vr4(p66Var6, inflate2.findViewById(R.id.radioExternalAlignmentCenter)), new vr4(p66Var7, inflate2.findViewById(R.id.radioExternalAlignmentBottom)));
                                            final dh5 obj10 = new Object();
                                            if (p66Var3 == null) {
                                                p66Var = lb4.r(jq1Var2);
                                            } else {
                                                p66Var = p66Var3;
                                            }
                                            obj10.A = p66Var;
                                            final dh5 obj11 = new Object();
                                            if (p66Var4 == null) {
                                                p66Var2 = lb4.q(jq1Var2);
                                            } else {
                                                p66Var2 = p66Var4;
                                            }
                                            obj11.A = p66Var2;
                                            final dh5 obj12 = new Object();
                                            obj12.A = p66Var3;
                                            final dh5 obj13 = new Object();
                                            obj13.A = p66Var4;
                                            final zg5 obj14 = new Object();
                                            final zg5 obj15 = new Object();
                                            if (obj12.A != null) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            switchCompat3.setChecked(z18);
                                            if (obj13.A != null) {
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            switchCompat4.setChecked(z19);
                                            obj14.A = true;
                                            RadioButton radioButton = (RadioButton) m02.get(obj10.A);
                                            if (radioButton != null) {
                                                i7 = radioButton.getId();
                                            } else {
                                                i7 = R.id.radioInternalAlignmentTop;
                                            }
                                            radioGroup2.check(i7);
                                            obj14.A = false;
                                            obj15.A = true;
                                            RadioButton radioButton2 = (RadioButton) m03.get(obj11.A);
                                            if (radioButton2 != null) {
                                                i8 = radioButton2.getId();
                                            } else {
                                                i8 = R.id.radioExternalAlignmentTop;
                                            }
                                            radioGroup3.check(i8);
                                            obj15.A = false;
                                            VideoPreferencesFragment.C(m02.values(), switchCompat3.isChecked());
                                            VideoPreferencesFragment.C(m03.values(), switchCompat4.isChecked());
                                            switchCompat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                    int i9 = r4;
                                                    p66 p66Var8 = null;
                                                    dh5 dh5Var4 = obj10;
                                                    dh5 dh5Var5 = obj12;
                                                    Map map = m02;
                                                    switch (i9) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                    }
                                                }
                                            });
                                            switchCompat4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cn7
                                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z20) {
                                                    int i9 = r4;
                                                    p66 p66Var8 = null;
                                                    dh5 dh5Var4 = obj11;
                                                    dh5 dh5Var5 = obj13;
                                                    Map map = m03;
                                                    switch (i9) {
                                                        case 0:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                        default:
                                                            compoundButton.getClass();
                                                            VideoPreferencesFragment.C(map.values(), z20);
                                                            if (z20) {
                                                                p66Var8 = (p66) dh5Var4.A;
                                                            }
                                                            dh5Var5.A = p66Var8;
                                                            return;
                                                    }
                                                }
                                            });
                                            radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                    p66 p66Var8;
                                                    p66 p66Var9;
                                                    int i10 = r5;
                                                    dh5 dh5Var4 = obj12;
                                                    SwitchCompat switchCompat5 = switchCompat3;
                                                    dh5 dh5Var5 = obj10;
                                                    zg5 zg5Var = obj14;
                                                    switch (i10) {
                                                        case 0:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioInternalAlignmentTop) {
                                                                    p66Var8 = p66.TOP;
                                                                } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                    p66Var8 = p66.CENTER;
                                                                } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                    p66Var8 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var8 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var8;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioExternalAlignmentTop) {
                                                                    p66Var9 = p66.TOP;
                                                                } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                    p66Var9 = p66.CENTER;
                                                                } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                    p66Var9 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var9 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var9;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: dn7
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup4, int i9) {
                                                    p66 p66Var8;
                                                    p66 p66Var9;
                                                    int i10 = r5;
                                                    dh5 dh5Var4 = obj13;
                                                    SwitchCompat switchCompat5 = switchCompat4;
                                                    dh5 dh5Var5 = obj11;
                                                    zg5 zg5Var = obj15;
                                                    switch (i10) {
                                                        case 0:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioInternalAlignmentTop) {
                                                                    p66Var8 = p66.TOP;
                                                                } else if (i9 == R.id.radioInternalAlignmentCenter) {
                                                                    p66Var8 = p66.CENTER;
                                                                } else if (i9 == R.id.radioInternalAlignmentBottom) {
                                                                    p66Var8 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var8 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var8;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            radioGroup4.getClass();
                                                            if (!zg5Var.A) {
                                                                if (i9 == R.id.radioExternalAlignmentTop) {
                                                                    p66Var9 = p66.TOP;
                                                                } else if (i9 == R.id.radioExternalAlignmentCenter) {
                                                                    p66Var9 = p66.CENTER;
                                                                } else if (i9 == R.id.radioExternalAlignmentBottom) {
                                                                    p66Var9 = p66.BOTTOM;
                                                                } else {
                                                                    p66Var9 = p66.TOP;
                                                                }
                                                                dh5Var5.A = p66Var9;
                                                                if (switchCompat5.isChecked()) {
                                                                    dh5Var4.A = dh5Var5.A;
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            zb zbVar3 = new zb(videoPreferencesFragment5.requireContext());
                                            zbVar3.z(R.string.dual_screen_vertical_alignment_title);
                                            zbVar3.A(inflate2);
                                            zbVar3.y(R.string.ok, new qu1(ne4Var, obj12, obj13, 6));
                                            zbVar3.x(R.string.cancel, null);
                                            zbVar3.B();
                                        }
                                    });
                                    zb zbVar3 = new zb(videoPreferencesFragment4.requireContext());
                                    zbVar3.z(R.string.dual_screen_presets_settings_title);
                                    zbVar3.A(inflate);
                                    zbVar3.y(R.string.ok, new DialogInterface.OnClickListener() { // from class: zm7
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i7) {
                                            boolean z18;
                                            VideoPreferencesFragment videoPreferencesFragment5 = VideoPreferencesFragment.this;
                                            kd6 o = videoPreferencesFragment5.o();
                                            dh5 dh5Var = obj3;
                                            jq1 jq1Var2 = (jq1) dh5Var.A;
                                            jq1Var2.getClass();
                                            SharedPreferences.Editor edit = ((ng6) o).b.edit();
                                            String lowerCase = jq1Var2.name().toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                            edit.putString("dual_screen_preset", lowerCase);
                                            edit.apply();
                                            kd6 o2 = videoPreferencesFragment5.o();
                                            boolean z19 = obj22.A;
                                            SharedPreferences.Editor edit2 = ((ng6) o2).b.edit();
                                            edit2.putBoolean("external_display_keep_ratio", z19);
                                            edit2.apply();
                                            kd6 o3 = videoPreferencesFragment5.o();
                                            if (obj32.A && dh5Var.A != jq1.OFF) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            SharedPreferences.Editor edit3 = ((ng6) o3).b.edit();
                                            edit3.putBoolean("dual_screen_integer_scale", z18);
                                            edit3.apply();
                                            kd6 o4 = videoPreferencesFragment5.o();
                                            boolean z20 = obj4.A;
                                            SharedPreferences.Editor edit4 = ((ng6) o4).b.edit();
                                            edit4.putBoolean("dual_screen_internal_fill_height", z20);
                                            edit4.apply();
                                            kd6 o5 = videoPreferencesFragment5.o();
                                            boolean z21 = obj5.A;
                                            SharedPreferences.Editor edit5 = ((ng6) o5).b.edit();
                                            edit5.putBoolean("dual_screen_internal_fill_width", z21);
                                            edit5.apply();
                                            kd6 o6 = videoPreferencesFragment5.o();
                                            boolean z22 = obj6.A;
                                            SharedPreferences.Editor edit6 = ((ng6) o6).b.edit();
                                            edit6.putBoolean("dual_screen_external_fill_height", z22);
                                            edit6.apply();
                                            kd6 o7 = videoPreferencesFragment5.o();
                                            boolean z23 = obj7.A;
                                            SharedPreferences.Editor edit7 = ((ng6) o7).b.edit();
                                            edit7.putBoolean("dual_screen_external_fill_width", z23);
                                            edit7.apply();
                                            ((ng6) videoPreferencesFragment5.o()).N((p66) obj8.A);
                                            ((ng6) videoPreferencesFragment5.o()).M((p66) obj9.A);
                                            videoPreferencesFragment5.E();
                                        }
                                    });
                                    zbVar3.x(R.string.cancel, null);
                                    zbVar3.B();
                                    return;
                            }
                        }
                    });
                    this.t0 = findPreference("video_retroarch_shader_settings");
                    ap6 ap6Var2 = this.x0;
                    if (ap6Var2 != null) {
                        ap6Var2.h(null);
                    }
                    this.x0 = hv.L(bl2.C(this), null, null, new VideoPreferencesFragment$observeShaderInstallWork$1(this, null), 3);
                    String str4 = inGameLockedListPreference2.e0;
                    str4.getClass();
                    InGameLockedListPreference inGameLockedListPreference7 = inGameLockedListPreference;
                    F((VideoRenderer) jw2.o(str4, VideoRenderer.values()), inGameLockedListPreference7, storagePickerPreference5, listPreference2, editTextPreference, switchPreference3, stringArray, stringArray2);
                    inGameLockedListPreference7.setOnPreferenceChangeListener(new x05() { // from class: pm7
                        @Override // defpackage.x05
                        public final boolean a(Preference preference5, Object obj3) {
                            preference5.getClass();
                            String str5 = inGameLockedListPreference2.e0;
                            str5.getClass();
                            VideoRenderer videoRenderer2 = (VideoRenderer) jw2.o(str5, VideoRenderer.values());
                            obj3.getClass();
                            String str6 = (String) obj3;
                            VideoPreferencesFragment videoPreferencesFragment = VideoPreferencesFragment.this;
                            videoPreferencesFragment.I(str6, storagePickerPreference5, listPreference2, editTextPreference, switchPreference3);
                            if (VideoPreferencesFragment.L(str6) == VideoFiltering.RETROARCH && videoPreferencesFragment.t() == null) {
                                videoPreferencesFragment.B();
                                return true;
                            }
                            return true;
                        }
                    });
                    String str5 = inGameLockedListPreference2.e0;
                    str5.getClass();
                    q(str5, inGameLockedListPreference7, storagePickerPreference5, listPreference2, editTextPreference, switchPreference3, stringArray, stringArray2);
                    String str6 = listPreference.e0;
                    str6.getClass();
                    if (((h91) jw2.o(str6, h91.values())) == h91.STATIC_IMAGE) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    storagePickerPreference3.setVisible(z7);
                    E();
                    ListPreference listPreference4 = (ListPreference) findPreference("fps_counter_position");
                    ListPreference listPreference5 = (ListPreference) findPreference("resolution_hud_position");
                    if (listPreference4 != null && listPreference5 != null) {
                        n().getClass();
                        p15.a(listPreference4);
                        n().getClass();
                        p15.a(listPreference5);
                        yh2.g(listPreference4, new qm7(listPreference5, this, 0));
                        yh2.g(listPreference5, new qm7(listPreference4, this, 1));
                        return;
                    }
                    return;
                }
                nb3.a0("dualScreenPresetsPreference");
                throw null;
            }
        } else {
            z3 = z2;
            inGameLockedListPreference = inGameLockedListPreference5;
        }
        z4 = false;
        if (!z3) {
        }
        String[] stringArray32 = inGameLockedListPreference2.getContext().getResources().getStringArray(R.array.video_renderer_values);
        stringArray32.getClass();
        z5 = z4;
        String[] stringArray42 = inGameLockedListPreference2.getContext().getResources().getStringArray(R.array.video_renderer_options);
        stringArray42.getClass();
        X0 = fv.X0(stringArray32, stringArray42);
        ArrayList arrayList42 = new ArrayList();
        size = X0.size();
        preferenceCategory = preferenceCategory2;
        preference = findPreference24;
        i2 = 0;
        while (true) {
            storagePickerPreference = storagePickerPreference4;
            if (i2 < size) {
            }
            storagePickerPreference4 = storagePickerPreference;
            size = i5;
            X0 = arrayList5;
        }
        ArrayList arrayList62 = new ArrayList(ht0.v0(arrayList42, 10));
        size2 = arrayList42.size();
        while (i3 < size2) {
        }
        inGameLockedListPreference2.d0 = (CharSequence[]) arrayList62.toArray(new String[0]);
        ArrayList arrayList72 = new ArrayList(ht0.v0(arrayList42, 10));
        size3 = arrayList42.size();
        i4 = 0;
        while (i4 < size3) {
        }
        inGameLockedListPreference2.Z = (CharSequence[]) arrayList72.toArray(new String[0]);
        if (z3) {
        }
        if (!z5) {
            inGameLockedListPreference2.h("software");
        }
        final InGameLockedListPreference inGameLockedListPreference62 = inGameLockedListPreference;
        final PreferenceCategory preferenceCategory32 = preferenceCategory;
        final Preference preference42 = preference;
        final StoragePickerPreference storagePickerPreference52 = storagePickerPreference;
        inGameLockedListPreference2.setOnPreferenceChangeListener(new x05(inGameLockedListPreference62, storagePickerPreference52, listPreference2, editTextPreference, switchPreference3, stringArray, stringArray2, preferenceCategory32, preference42, listPreference3, findPreference26, findPreference27, booleanExtra, inGameLockedSwitchPreference) { // from class: gn7
            public final /* synthetic */ InGameLockedListPreference b;
            public final /* synthetic */ StoragePickerPreference c;
            public final /* synthetic */ ListPreference d;
            public final /* synthetic */ EditTextPreference e;
            public final /* synthetic */ SwitchPreference f;
            public final /* synthetic */ String[] g;
            public final /* synthetic */ String[] h;
            public final /* synthetic */ PreferenceCategory i;
            public final /* synthetic */ Preference j;
            public final /* synthetic */ ListPreference k;
            public final /* synthetic */ Preference l;
            public final /* synthetic */ boolean m;
            public final /* synthetic */ InGameLockedSwitchPreference n;

            {
                this.l = findPreference27;
                this.m = booleanExtra;
                this.n = inGameLockedSwitchPreference;
            }

            @Override // defpackage.x05
            public final boolean a(Preference preference5, Object obj3) {
                preference5.getClass();
                obj3.getClass();
                String str32 = (String) obj3;
                VideoRenderer videoRenderer2 = (VideoRenderer) jw2.o(str32, VideoRenderer.values());
                VideoRenderer videoRenderer22 = VideoRenderer.VULKAN;
                VideoPreferencesFragment videoPreferencesFragment = VideoPreferencesFragment.this;
                if (videoRenderer2 == videoRenderer22) {
                    kd6 o = videoPreferencesFragment.o();
                    String str42 = videoPreferencesFragment.requireContext().getApplicationInfo().nativeLibraryDir;
                    str42.getClass();
                    yq7 z10 = ((ng6) o).z(str42);
                    MelonDSAndroidInterface melonDSAndroidInterface = MelonDSAndroidInterface.a;
                    melonDSAndroidInterface.b(z10);
                    if (!melonDSAndroidInterface.c()) {
                        zb zbVar = new zb(videoPreferencesFragment.requireContext());
                        zbVar.z(R.string.renderer_init_failed_title);
                        ((wb) zbVar.L).f = videoPreferencesFragment.getString(R.string.renderer_init_failed_message, "Vulkan");
                        zbVar.y(R.string.ok, null);
                        zbVar.B();
                        return false;
                    }
                }
                videoPreferencesFragment.q(str32, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
                videoPreferencesFragment.J(videoRenderer2, this.i, this.j, this.k, this.l, this.m);
                if (videoRenderer2 != videoRenderer22) {
                    InGameLockedSwitchPreference inGameLockedSwitchPreference2 = this.n;
                    if (inGameLockedSwitchPreference2.A) {
                        inGameLockedSwitchPreference2.e(false);
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });
        listPreference.setOnPreferenceChangeListener(new zw(this, storagePickerPreference3));
        preference2 = this.n0;
        if (preference2 == null) {
        }
    }

    @Override // defpackage.k15
    public final void onDisplayPreferenceDialog(Preference preference) {
        preference.getClass();
        if (nb3.k(preference.getKey(), "video_retroarch_shader_preset")) {
            y((ListPreference) preference);
        } else {
            super.onDisplayPreferenceDialog(preference);
        }
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        E();
        ListPreference listPreference = this.s0;
        boolean z = false;
        String str = null;
        if (listPreference != null) {
            G(this, listPreference, null, false, 2);
            s();
        }
        ListPreference listPreference2 = (ListPreference) findPreference("video_vulkan_driver_mode");
        Preference findPreference = findPreference("video_vulkan_driver_remove");
        Preference findPreference2 = findPreference("video_vulkan_driver_manager");
        if (listPreference2 != null && findPreference != null) {
            K(listPreference2, findPreference);
            hm4 b = new jm4().b(q60.H());
            zq7 w = ((ng6) o()).w();
            if (w != null) {
                str = w.b;
            }
            if (((ng6) o()).A() == sr7.CUSTOM && str != null && b != null && qs6.j0(str, b.c, true)) {
                z = true;
            }
            if (b != null && !z) {
                if (findPreference2 != null) {
                    findPreference2.setSummary("⭐ Доступен рекомендуемый: ".concat(b.b));
                }
            } else if (findPreference2 != null) {
                findPreference2.setSummary(getString(R.string.video_vulkan_driver_manager_summary));
            }
        }
    }

    public final cp5 p() {
        cp5 cp5Var = this.g0;
        if (cp5Var != null) {
            return cp5Var;
        }
        nb3.a0("shaderLibraryManager");
        throw null;
    }

    public final void q(String str, ListPreference listPreference, StoragePickerPreference storagePickerPreference, ListPreference listPreference2, EditTextPreference editTextPreference, SwitchPreference switchPreference, String[] strArr, String[] strArr2) {
        boolean z;
        boolean z2;
        VideoRenderer videoRenderer = (VideoRenderer) jw2.o(str, VideoRenderer.values());
        int i = WhenMappings.b[videoRenderer.ordinal()];
        ArrayList arrayList = this.k0;
        ArrayList arrayList2 = this.l0;
        ArrayList arrayList3 = this.m0;
        ArrayList arrayList4 = this.j0;
        ArrayList arrayList5 = this.i0;
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
                        defpackage.i.d();
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
        for (String str2 : hf.c0("video_renderer_debug_bgobj_enabled", "video_renderer_debug_latch_trace_enabled")) {
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
        for (String str3 : hf.c0("video_conservative_coverage_px", "video_conservative_coverage_apply_repeat", "video_conservative_coverage_apply_clamp", "video_conservative_coverage_depth_bias")) {
            Preference findPreference2 = findPreference(str3);
            if (findPreference2 != null) {
                findPreference2.setVisible(z2);
            }
        }
        F(videoRenderer, listPreference, storagePickerPreference, listPreference2, editTextPreference, switchPreference, strArr, strArr2);
    }

    public final void r(RetroArchShaderSource retroArchShaderSource) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        SharedPreferences d = getPreferenceManager().d();
        if (d != null && (edit = d.edit()) != null && (putString = edit.putString("video_retroarch_shader_source", retroArchShaderSource.getPreferenceValue())) != null) {
            putString.apply();
        }
    }

    public final void s() {
        String str;
        String string;
        String string2;
        boolean z;
        if (this.s0 == null) {
            RetroArchShaderSource t = t();
            Preference preference = this.p0;
            boolean z2 = false;
            if (preference != null) {
                if (t == RetroArchShaderSource.INTERNAL) {
                    z = true;
                } else {
                    z = false;
                }
                preference.setVisible(z);
                H();
            }
            StoragePickerPreference storagePickerPreference = this.r0;
            if (storagePickerPreference != null) {
                if (t == RetroArchShaderSource.FOLDER) {
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
        VideoRenderer videoRenderer = (VideoRenderer) jw2.o(str2, VideoRenderer.values());
        if (d == null || (string = d.getString("video_filtering", "none")) == null) {
            str = "none";
        } else {
            str = string;
        }
        StoragePickerPreference storagePickerPreference2 = this.r0;
        if (storagePickerPreference2 != null) {
            ListPreference listPreference = this.s0;
            if (listPreference != null) {
                I(str, storagePickerPreference2, listPreference, (EditTextPreference) findPreference("video_retroarch_shader_parameters"), (SwitchPreference) findPreference("video_retroarch_shader_clear_history"));
                return;
            } else {
                nb3.a0("shaderPresetPreference");
                throw null;
            }
        }
        nb3.a0("shaderRootPreference");
        throw null;
    }

    public final RetroArchShaderSource t() {
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
        if (p().d() != null) {
            z2 = true;
        }
        RetroArchShaderSource.Companion.getClass();
        Iterator<E> it = RetroArchShaderSource.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (xs6.Z(((RetroArchShaderSource) obj).getPreferenceValue(), str, true)) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Type inference failed for: r0v17, types: [me.magnum.melonds.ui.settings.fragments.e] */
    /* JADX WARN: Type inference failed for: r4v11, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [dh5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(ListPreference listPreference) {
        int i;
        ShaderDirectoryLister shaderDirectoryLister;
        ac acVar;
        dh5 dh5Var;
        final LinkedHashMap linkedHashMap;
        final TextView textView;
        final ShaderDirectoryLister shaderDirectoryLister2;
        ShaderDirectoryLister shaderDirectoryLister3;
        Set<String> stringSet;
        String str;
        Uri parse;
        RetroArchShaderSource t = t();
        if (t == null) {
            i = -1;
        } else {
            i = WhenMappings.a[t.ordinal()];
        }
        e eVar = null;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    SharedPreferences d = getPreferenceManager().d();
                    if (d != null && (stringSet = d.getStringSet("video_retroarch_shader_root", null)) != null && (str = (String) gt0.I0(stringSet)) != null && (parse = Uri.parse(str)) != null) {
                        Context requireContext = requireContext();
                        requireContext.getClass();
                        shaderDirectoryLister3 = new a(requireContext, parse, 2);
                        shaderDirectoryLister = shaderDirectoryLister3;
                    }
                } else {
                    defpackage.i.d();
                    return;
                }
            } else {
                final File d2 = p().d();
                if (d2 != null) {
                    shaderDirectoryLister3 = new ShaderDirectoryLister() { // from class: me.magnum.melonds.ui.settings.fragments.i
                        @Override // me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment.ShaderDirectoryLister
                        public final List a(String str2) {
                            ArrayList arrayList;
                            str2.getClass();
                            File canonicalFile = d2.getCanonicalFile();
                            File canonicalFile2 = new File(canonicalFile, str2).getCanonicalFile();
                            String path = canonicalFile2.getPath();
                            path.getClass();
                            String path2 = canonicalFile.getPath();
                            path2.getClass();
                            if (xs6.g0(path, path2, false) && canonicalFile2.isDirectory()) {
                                File[] listFiles = canonicalFile2.listFiles();
                                if (listFiles != null) {
                                    arrayList = new ArrayList(listFiles.length);
                                    for (File file : listFiles) {
                                        String name = file.getName();
                                        name.getClass();
                                        arrayList.add(new VideoPreferencesFragment.ShaderBrowserEntry(name, file.isDirectory()));
                                    }
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    return arrayList;
                                }
                            }
                            return yt1.A;
                        }
                    };
                    shaderDirectoryLister = shaderDirectoryLister3;
                }
            }
            if (shaderDirectoryLister != null) {
                listPreference.setSummary(getString(R.string.video_retroarch_shader_preset_summary));
                Toast.makeText(requireContext(), (int) R.string.retroarch_shader_root_not_valid, 1).show();
                return;
            }
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            View inflate = getLayoutInflater().inflate(R.layout.dialog_shader_browser, (ViewGroup) null);
            final TextView textView2 = (TextView) inflate.findViewById(R.id.textShaderBrowserPath);
            final TextView textView3 = (TextView) inflate.findViewById(R.id.textShaderBrowserEmpty);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.listShaderBrowser);
            View findViewById = inflate.findViewById(R.id.containerShaderBrowserList);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = Math.min(layoutParams.height, (int) (getResources().getDisplayMetrics().heightPixels * 0.45f));
            findViewById.setLayoutParams(layoutParams);
            final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            ?? obj = new Object();
            obj.A = "";
            zb zbVar = new zb(requireContext2);
            ((wb) zbVar.L).d = listPreference.getTitle();
            zbVar.A(inflate);
            zbVar.x(17039360, null);
            final ac l = zbVar.l();
            final ?? obj2 = new Object();
            final dh5 dh5Var2 = obj;
            obj2.A = new ShaderBrowserAdapter(new t46(listPreference, 22), new d(this, listPreference, l, obj, shaderDirectoryLister, linkedHashMap2, textView2, textView3, obj2));
            recyclerView.setLayoutManager(new LinearLayoutManager());
            Object obj3 = obj2.A;
            if (obj3 != null) {
                recyclerView.setAdapter((ShaderBrowserAdapter) obj3);
                if (Build.VERSION.SDK_INT >= 33) {
                    final ShaderDirectoryLister shaderDirectoryLister4 = shaderDirectoryLister;
                    ?? r0 = new OnBackInvokedCallback() { // from class: me.magnum.melonds.ui.settings.fragments.e
                        public final void onBackInvoked() {
                            dh5 dh5Var3 = dh5Var2;
                            if (qs6.v0((CharSequence) dh5Var3.A)) {
                                ac.this.dismiss();
                                return;
                            }
                            VideoPreferencesFragment.z(dh5Var3, this, shaderDirectoryLister4, linkedHashMap2, textView2, textView3, obj2, qs6.R0('/', (String) dh5Var3.A, ""));
                        }
                    };
                    acVar = l;
                    eVar = r0;
                    dh5Var = obj2;
                    textView3 = textView3;
                    textView = textView2;
                    linkedHashMap = linkedHashMap2;
                    shaderDirectoryLister2 = shaderDirectoryLister4;
                } else {
                    acVar = l;
                    final ShaderDirectoryLister shaderDirectoryLister5 = shaderDirectoryLister;
                    DialogInterface.OnKeyListener onKeyListener = new DialogInterface.OnKeyListener() { // from class: me.magnum.melonds.ui.settings.fragments.f
                        @Override // android.content.DialogInterface.OnKeyListener
                        public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                            if (i2 == 4 && keyEvent.getAction() == 1) {
                                dh5 dh5Var3 = dh5.this;
                                if (!qs6.v0((CharSequence) dh5Var3.A)) {
                                    VideoPreferencesFragment.z(dh5Var3, this, shaderDirectoryLister5, linkedHashMap2, textView2, textView3, obj2, qs6.R0('/', (String) dh5Var3.A, ""));
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                    };
                    dh5Var2 = dh5Var2;
                    dh5Var = obj2;
                    linkedHashMap = linkedHashMap2;
                    textView = textView2;
                    shaderDirectoryLister2 = shaderDirectoryLister5;
                    acVar.setOnKeyListener(onKeyListener);
                }
                final dh5 dh5Var3 = dh5Var2;
                final ac acVar2 = acVar;
                final dh5 dh5Var4 = dh5Var;
                final e eVar2 = eVar;
                acVar2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: me.magnum.melonds.ui.settings.fragments.g
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        OnBackInvokedDispatcher onBackInvokedDispatcher;
                        OnBackInvokedCallback onBackInvokedCallback = eVar2;
                        if (onBackInvokedCallback != null && Build.VERSION.SDK_INT >= 33) {
                            onBackInvokedDispatcher = acVar2.getOnBackInvokedDispatcher();
                            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
                        }
                        VideoPreferencesFragment.z(dh5Var3, this, shaderDirectoryLister2, linkedHashMap, textView, textView3, dh5Var4, "");
                    }
                });
                acVar2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: sm7
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        OnBackInvokedDispatcher onBackInvokedDispatcher;
                        OnBackInvokedCallback onBackInvokedCallback = eVar2;
                        if (onBackInvokedCallback != null && Build.VERSION.SDK_INT >= 33) {
                            onBackInvokedDispatcher = acVar2.getOnBackInvokedDispatcher();
                            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                        }
                        VideoPreferencesFragment videoPreferencesFragment = this;
                        ap6 ap6Var = videoPreferencesFragment.w0;
                        if (ap6Var != null) {
                            ap6Var.h(null);
                        }
                        videoPreferencesFragment.w0 = null;
                    }
                });
                acVar2.show();
                return;
            }
            nb3.a0("adapter");
            throw null;
        }
        shaderDirectoryLister = null;
        if (shaderDirectoryLister != null) {
        }
    }
}
