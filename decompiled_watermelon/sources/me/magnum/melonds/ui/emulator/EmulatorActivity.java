package me.magnum.melonds.ui.emulator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Display;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class EmulatorActivity extends rr2 {
    public static final /* synthetic */ int P1 = 0;
    public r8 A0;
    public final tj4 A1;
    public final gh3 B0;
    public final tj4 B1;
    public lx5 C0;
    public final tj4 C1;
    public le1 D0;
    public final tj4 D1;
    public pm4 E0;
    public final tj4 E1;
    public gn3 F0;
    public final tj4 F1;
    public ns G0;
    public final tj4 G1;
    public w16 H0;
    public final tj4 H1;
    public a50 I0;
    public final xa6 I1;
    public k42 J0;
    public jc2 J1;
    public Handler K0;
    public float K1;
    public final vg1 L0;
    public float L1;
    public final ow0 M0;
    public kl4 M1;
    public r9 N0;
    public boolean N1;
    public os O0;
    public final os O1;
    public oh2 P0;
    public eo0 Q0;
    public o51 R0;
    public mx2 S0;
    public a13 T0;
    public js5 U0;
    public String V0;
    public String W0;
    public es4 X0;
    public o26 Y0;
    public q26 Z0;
    public bs5 a1;
    public a b1;
    public b c1;
    public int d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public c42 i1;
    public final fr1 j1;
    public final h9 k1;
    public final h9 l1;
    public final h9 m1;
    public final h9 n1;
    public final h9 o1;
    public final my p1;
    public tb q1;
    public tb r1;
    public tb s1;
    public tb t1;
    public tb u1;
    public final yf5 v1;
    public final tj4 w1;
    public final tj4 x1;
    public final tj4 y1;
    public final tj4 z1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ e12 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a OPEN_GL = new a("OPEN_GL", 0);
        public static final a VULKAN = new a("VULKAN", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{OPEN_GL, VULKAN};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l.C($values);
        }

        private a(String str, int i) {
        }

        public static e12 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [g65, yf5] */
    public EmulatorActivity() {
        super(0);
        iq1 iq1Var = new iq1(this, 17);
        this.B0 = new va7(q75.a(hv1.class), new qr1(this, 1), new qr1(this, 0), new jz(iq1Var, this));
        this.L0 = new vg1(1, this);
        this.M0 = new ow0();
        this.a1 = bs5.c;
        this.b1 = a.OPEN_GL;
        this.e1 = true;
        this.i1 = c42.MELON_DUAL_DS;
        this.j1 = new fr1(this);
        this.k1 = (h9) s(new b9(4), new z8(this) { // from class: rq1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                Intent intent;
                st1 st1Var;
                rg5 rg5Var;
                String stringExtra;
                st1 st1Var2;
                rg5 rg5Var2;
                wm5 wm5Var;
                int i = r2;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        y8 y8Var = (y8) obj;
                        int i2 = EmulatorActivity.P1;
                        y8Var.getClass();
                        boolean z = true;
                        if (y8Var.A == -1 && (intent = y8Var.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            hv1 U = emulatorActivity.U();
                            U.j0.incrementAndGet();
                            tq5.w(U.z, null, s31.UNDISPATCHED, new dy1(U, null), 1);
                        } else {
                            if (emulatorActivity.z1.getValue() == null && !emulatorActivity.O1.G()) {
                                z = false;
                            }
                            emulatorActivity.U().N0(!z);
                            if (z) {
                                emulatorActivity.h0(0);
                            }
                        }
                        emulatorActivity.getWindow().setSustainedPerformanceMode(((b56) emulatorActivity.U().c).b.getBoolean("enable_sustained_performance", false));
                        emulatorActivity.n0();
                        w16 w16Var = emulatorActivity.H0;
                        if (w16Var != null) {
                            emulatorActivity.i1 = ((b56) w16Var).l();
                            emulatorActivity.N0();
                            return;
                        }
                        b53.g0("settingsRepository");
                        throw null;
                    case 1:
                        int i3 = EmulatorActivity.P1;
                        ((y8) obj).getClass();
                        hv1 U2 = emulatorActivity.U();
                        Object value = U2.p0.getValue();
                        if (value instanceof st1) {
                            st1Var = (st1) value;
                        } else {
                            st1Var = null;
                        }
                        if (st1Var != null && (rg5Var = st1Var.a) != null) {
                            tq5.w(U2.z, null, null, new uv1(U2, rg5Var, null, 2), 3);
                        }
                        if (!emulatorActivity.d0()) {
                            emulatorActivity.U().V0();
                            return;
                        } else {
                            emulatorActivity.h0(0);
                            return;
                        }
                    case 2:
                        y8 y8Var2 = (y8) obj;
                        int i4 = EmulatorActivity.P1;
                        y8Var2.getClass();
                        if (y8Var2.A == -1) {
                            Intent intent2 = y8Var2.B;
                            if (intent2 != null && (stringExtra = intent2.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            hv1 U3 = emulatorActivity.U();
                            U3.getClass();
                            U3.l1(new j0(26, uuid));
                        }
                        if (!emulatorActivity.d0()) {
                            emulatorActivity.U().V0();
                            return;
                        } else {
                            emulatorActivity.h0(0);
                            return;
                        }
                    case 3:
                        int i5 = EmulatorActivity.P1;
                        ((y8) obj).getClass();
                        hv1 U4 = emulatorActivity.U();
                        Object value2 = U4.p0.getValue();
                        if (value2 instanceof st1) {
                            st1Var2 = (st1) value2;
                        } else {
                            st1Var2 = null;
                        }
                        if (st1Var2 != null && (rg5Var2 = st1Var2.a) != null) {
                            ap apVar = U4.p;
                            Uri uri = rg5Var2.d;
                            apVar.getClass();
                            uri.getClass();
                            am5 a2 = apVar.a(uh1.g(apVar.a, uri));
                            if (a2 != null) {
                                wm5Var = a2.b(rg5Var2);
                            } else {
                                wm5Var = null;
                            }
                            if (wm5Var != null) {
                                tq5.w(U4.z, null, null, new ba1(U4, wm5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.U().V0();
                        return;
                    default:
                        Map map = (Map) obj;
                        int i6 = EmulatorActivity.P1;
                        map.getClass();
                        tq5.w(hk2.y(emulatorActivity), null, null, new nr1(map, emulatorActivity, null), 3);
                        return;
                }
            }
        });
        this.l1 = (h9) s(new b9(4), new z8(this) { // from class: rq1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                Intent intent;
                st1 st1Var;
                rg5 rg5Var;
                String stringExtra;
                st1 st1Var2;
                rg5 rg5Var2;
                wm5 wm5Var;
                int i = r2;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        y8 y8Var = (y8) obj;
                        int i2 = EmulatorActivity.P1;
                        y8Var.getClass();
                        boolean z = true;
                        if (y8Var.A == -1 && (intent = y8Var.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            hv1 U = emulatorActivity.U();
                            U.j0.incrementAndGet();
                            tq5.w(U.z, null, s31.UNDISPATCHED, new dy1(U, null), 1);
                        } else {
                            if (emulatorActivity.z1.getValue() == null && !emulatorActivity.O1.G()) {
                                z = false;
                            }
                            emulatorActivity.U().N0(!z);
                            if (z) {
                                emulatorActivity.h0(0);
                            }
                        }
                        emulatorActivity.getWindow().setSustainedPerformanceMode(((b56) emulatorActivity.U().c).b.getBoolean("enable_sustained_performance", false));
                        emulatorActivity.n0();
                        w16 w16Var = emulatorActivity.H0;
                        if (w16Var != null) {
                            emulatorActivity.i1 = ((b56) w16Var).l();
                            emulatorActivity.N0();
                            return;
                        }
                        b53.g0("settingsRepository");
                        throw null;
                    case 1:
                        int i3 = EmulatorActivity.P1;
                        ((y8) obj).getClass();
                        hv1 U2 = emulatorActivity.U();
                        Object value = U2.p0.getValue();
                        if (value instanceof st1) {
                            st1Var = (st1) value;
                        } else {
                            st1Var = null;
                        }
                        if (st1Var != null && (rg5Var = st1Var.a) != null) {
                            tq5.w(U2.z, null, null, new uv1(U2, rg5Var, null, 2), 3);
                        }
                        if (!emulatorActivity.d0()) {
                            emulatorActivity.U().V0();
                            return;
                        } else {
                            emulatorActivity.h0(0);
                            return;
                        }
                    case 2:
                        y8 y8Var2 = (y8) obj;
                        int i4 = EmulatorActivity.P1;
                        y8Var2.getClass();
                        if (y8Var2.A == -1) {
                            Intent intent2 = y8Var2.B;
                            if (intent2 != null && (stringExtra = intent2.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            hv1 U3 = emulatorActivity.U();
                            U3.getClass();
                            U3.l1(new j0(26, uuid));
                        }
                        if (!emulatorActivity.d0()) {
                            emulatorActivity.U().V0();
                            return;
                        } else {
                            emulatorActivity.h0(0);
                            return;
                        }
                    case 3:
                        int i5 = EmulatorActivity.P1;
                        ((y8) obj).getClass();
                        hv1 U4 = emulatorActivity.U();
                        Object value2 = U4.p0.getValue();
                        if (value2 instanceof st1) {
                            st1Var2 = (st1) value2;
                        } else {
                            st1Var2 = null;
                        }
                        if (st1Var2 != null && (rg5Var2 = st1Var2.a) != null) {
                            ap apVar = U4.p;
                            Uri uri = rg5Var2.d;
                            apVar.getClass();
                            uri.getClass();
                            am5 a2 = apVar.a(uh1.g(apVar.a, uri));
                            if (a2 != null) {
                                wm5Var = a2.b(rg5Var2);
                            } else {
                                wm5Var = null;
                            }
                            if (wm5Var != null) {
                                tq5.w(U4.z, null, null, new ba1(U4, wm5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.U().V0();
                        return;
                    default:
                        Map map = (Map) obj;
                        int i6 = EmulatorActivity.P1;
                        map.getClass();
                        tq5.w(hk2.y(emulatorActivity), null, null, new nr1(map, emulatorActivity, null), 3);
                        return;
                }
            }
        });
        this.m1 = (h9) s(new b9(4), new z8(this) { // from class: rq1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                Intent intent;
                st1 st1Var;
                rg5 rg5Var;
                String stringExtra;
                st1 st1Var2;
                rg5 rg5Var2;
                wm5 wm5Var;
                int i = r2;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        y8 y8Var = (y8) obj;
                        int i2 = EmulatorActivity.P1;
                        y8Var.getClass();
                        boolean z = true;
                        if (y8Var.A == -1 && (intent = y8Var.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            hv1 U = emulatorActivity.U();
                            U.j0.incrementAndGet();
                            tq5.w(U.z, null, s31.UNDISPATCHED, new dy1(U, null), 1);
                        } else {
                            if (emulatorActivity.z1.getValue() == null && !emulatorActivity.O1.G()) {
                                z = false;
                            }
                            emulatorActivity.U().N0(!z);
                            if (z) {
                                emulatorActivity.h0(0);
                            }
                        }
                        emulatorActivity.getWindow().setSustainedPerformanceMode(((b56) emulatorActivity.U().c).b.getBoolean("enable_sustained_performance", false));
                        emulatorActivity.n0();
                        w16 w16Var = emulatorActivity.H0;
                        if (w16Var != null) {
                            emulatorActivity.i1 = ((b56) w16Var).l();
                            emulatorActivity.N0();
                            return;
                        }
                        b53.g0("settingsRepository");
                        throw null;
                    case 1:
                        int i3 = EmulatorActivity.P1;
                        ((y8) obj).getClass();
                        hv1 U2 = emulatorActivity.U();
                        Object value = U2.p0.getValue();
                        if (value instanceof st1) {
                            st1Var = (st1) value;
                        } else {
                            st1Var = null;
                        }
                        if (st1Var != null && (rg5Var = st1Var.a) != null) {
                            tq5.w(U2.z, null, null, new uv1(U2, rg5Var, null, 2), 3);
                        }
                        if (!emulatorActivity.d0()) {
                            emulatorActivity.U().V0();
                            return;
                        } else {
                            emulatorActivity.h0(0);
                            return;
                        }
                    case 2:
                        y8 y8Var2 = (y8) obj;
                        int i4 = EmulatorActivity.P1;
                        y8Var2.getClass();
                        if (y8Var2.A == -1) {
                            Intent intent2 = y8Var2.B;
                            if (intent2 != null && (stringExtra = intent2.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            hv1 U3 = emulatorActivity.U();
                            U3.getClass();
                            U3.l1(new j0(26, uuid));
                        }
                        if (!emulatorActivity.d0()) {
                            emulatorActivity.U().V0();
                            return;
                        } else {
                            emulatorActivity.h0(0);
                            return;
                        }
                    case 3:
                        int i5 = EmulatorActivity.P1;
                        ((y8) obj).getClass();
                        hv1 U4 = emulatorActivity.U();
                        Object value2 = U4.p0.getValue();
                        if (value2 instanceof st1) {
                            st1Var2 = (st1) value2;
                        } else {
                            st1Var2 = null;
                        }
                        if (st1Var2 != null && (rg5Var2 = st1Var2.a) != null) {
                            ap apVar = U4.p;
                            Uri uri = rg5Var2.d;
                            apVar.getClass();
                            uri.getClass();
                            am5 a2 = apVar.a(uh1.g(apVar.a, uri));
                            if (a2 != null) {
                                wm5Var = a2.b(rg5Var2);
                            } else {
                                wm5Var = null;
                            }
                            if (wm5Var != null) {
                                tq5.w(U4.z, null, null, new ba1(U4, wm5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.U().V0();
                        return;
                    default:
                        Map map = (Map) obj;
                        int i6 = EmulatorActivity.P1;
                        map.getClass();
                        tq5.w(hk2.y(emulatorActivity), null, null, new nr1(map, emulatorActivity, null), 3);
                        return;
                }
            }
        });
        this.n1 = (h9) s(new b9(4), new z8(this) { // from class: rq1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                Intent intent;
                st1 st1Var;
                rg5 rg5Var;
                String stringExtra;
                st1 st1Var2;
                rg5 rg5Var2;
                wm5 wm5Var;
                int i = r2;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        y8 y8Var = (y8) obj;
                        int i2 = EmulatorActivity.P1;
                        y8Var.getClass();
                        boolean z = true;
                        if (y8Var.A == -1 && (intent = y8Var.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            hv1 U = emulatorActivity.U();
                            U.j0.incrementAndGet();
                            tq5.w(U.z, null, s31.UNDISPATCHED, new dy1(U, null), 1);
                        } else {
                            if (emulatorActivity.z1.getValue() == null && !emulatorActivity.O1.G()) {
                                z = false;
                            }
                            emulatorActivity.U().N0(!z);
                            if (z) {
                                emulatorActivity.h0(0);
                            }
                        }
                        emulatorActivity.getWindow().setSustainedPerformanceMode(((b56) emulatorActivity.U().c).b.getBoolean("enable_sustained_performance", false));
                        emulatorActivity.n0();
                        w16 w16Var = emulatorActivity.H0;
                        if (w16Var != null) {
                            emulatorActivity.i1 = ((b56) w16Var).l();
                            emulatorActivity.N0();
                            return;
                        }
                        b53.g0("settingsRepository");
                        throw null;
                    case 1:
                        int i3 = EmulatorActivity.P1;
                        ((y8) obj).getClass();
                        hv1 U2 = emulatorActivity.U();
                        Object value = U2.p0.getValue();
                        if (value instanceof st1) {
                            st1Var = (st1) value;
                        } else {
                            st1Var = null;
                        }
                        if (st1Var != null && (rg5Var = st1Var.a) != null) {
                            tq5.w(U2.z, null, null, new uv1(U2, rg5Var, null, 2), 3);
                        }
                        if (!emulatorActivity.d0()) {
                            emulatorActivity.U().V0();
                            return;
                        } else {
                            emulatorActivity.h0(0);
                            return;
                        }
                    case 2:
                        y8 y8Var2 = (y8) obj;
                        int i4 = EmulatorActivity.P1;
                        y8Var2.getClass();
                        if (y8Var2.A == -1) {
                            Intent intent2 = y8Var2.B;
                            if (intent2 != null && (stringExtra = intent2.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            hv1 U3 = emulatorActivity.U();
                            U3.getClass();
                            U3.l1(new j0(26, uuid));
                        }
                        if (!emulatorActivity.d0()) {
                            emulatorActivity.U().V0();
                            return;
                        } else {
                            emulatorActivity.h0(0);
                            return;
                        }
                    case 3:
                        int i5 = EmulatorActivity.P1;
                        ((y8) obj).getClass();
                        hv1 U4 = emulatorActivity.U();
                        Object value2 = U4.p0.getValue();
                        if (value2 instanceof st1) {
                            st1Var2 = (st1) value2;
                        } else {
                            st1Var2 = null;
                        }
                        if (st1Var2 != null && (rg5Var2 = st1Var2.a) != null) {
                            ap apVar = U4.p;
                            Uri uri = rg5Var2.d;
                            apVar.getClass();
                            uri.getClass();
                            am5 a2 = apVar.a(uh1.g(apVar.a, uri));
                            if (a2 != null) {
                                wm5Var = a2.b(rg5Var2);
                            } else {
                                wm5Var = null;
                            }
                            if (wm5Var != null) {
                                tq5.w(U4.z, null, null, new ba1(U4, wm5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.U().V0();
                        return;
                    default:
                        Map map = (Map) obj;
                        int i6 = EmulatorActivity.P1;
                        map.getClass();
                        tq5.w(hk2.y(emulatorActivity), null, null, new nr1(map, emulatorActivity, null), 3);
                        return;
                }
            }
        });
        this.o1 = (h9) s(new b9(2), new z8(this) { // from class: rq1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                Intent intent;
                st1 st1Var;
                rg5 rg5Var;
                String stringExtra;
                st1 st1Var2;
                rg5 rg5Var2;
                wm5 wm5Var;
                int i = r2;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        y8 y8Var = (y8) obj;
                        int i2 = EmulatorActivity.P1;
                        y8Var.getClass();
                        boolean z = true;
                        if (y8Var.A == -1 && (intent = y8Var.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            hv1 U = emulatorActivity.U();
                            U.j0.incrementAndGet();
                            tq5.w(U.z, null, s31.UNDISPATCHED, new dy1(U, null), 1);
                        } else {
                            if (emulatorActivity.z1.getValue() == null && !emulatorActivity.O1.G()) {
                                z = false;
                            }
                            emulatorActivity.U().N0(!z);
                            if (z) {
                                emulatorActivity.h0(0);
                            }
                        }
                        emulatorActivity.getWindow().setSustainedPerformanceMode(((b56) emulatorActivity.U().c).b.getBoolean("enable_sustained_performance", false));
                        emulatorActivity.n0();
                        w16 w16Var = emulatorActivity.H0;
                        if (w16Var != null) {
                            emulatorActivity.i1 = ((b56) w16Var).l();
                            emulatorActivity.N0();
                            return;
                        }
                        b53.g0("settingsRepository");
                        throw null;
                    case 1:
                        int i3 = EmulatorActivity.P1;
                        ((y8) obj).getClass();
                        hv1 U2 = emulatorActivity.U();
                        Object value = U2.p0.getValue();
                        if (value instanceof st1) {
                            st1Var = (st1) value;
                        } else {
                            st1Var = null;
                        }
                        if (st1Var != null && (rg5Var = st1Var.a) != null) {
                            tq5.w(U2.z, null, null, new uv1(U2, rg5Var, null, 2), 3);
                        }
                        if (!emulatorActivity.d0()) {
                            emulatorActivity.U().V0();
                            return;
                        } else {
                            emulatorActivity.h0(0);
                            return;
                        }
                    case 2:
                        y8 y8Var2 = (y8) obj;
                        int i4 = EmulatorActivity.P1;
                        y8Var2.getClass();
                        if (y8Var2.A == -1) {
                            Intent intent2 = y8Var2.B;
                            if (intent2 != null && (stringExtra = intent2.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            hv1 U3 = emulatorActivity.U();
                            U3.getClass();
                            U3.l1(new j0(26, uuid));
                        }
                        if (!emulatorActivity.d0()) {
                            emulatorActivity.U().V0();
                            return;
                        } else {
                            emulatorActivity.h0(0);
                            return;
                        }
                    case 3:
                        int i5 = EmulatorActivity.P1;
                        ((y8) obj).getClass();
                        hv1 U4 = emulatorActivity.U();
                        Object value2 = U4.p0.getValue();
                        if (value2 instanceof st1) {
                            st1Var2 = (st1) value2;
                        } else {
                            st1Var2 = null;
                        }
                        if (st1Var2 != null && (rg5Var2 = st1Var2.a) != null) {
                            ap apVar = U4.p;
                            Uri uri = rg5Var2.d;
                            apVar.getClass();
                            uri.getClass();
                            am5 a2 = apVar.a(uh1.g(apVar.a, uri));
                            if (a2 != null) {
                                wm5Var = a2.b(rg5Var2);
                            } else {
                                wm5Var = null;
                            }
                            if (wm5Var != null) {
                                tq5.w(U4.z, null, null, new ba1(U4, wm5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.U().V0();
                        return;
                    default:
                        Map map = (Map) obj;
                        int i6 = EmulatorActivity.P1;
                        map.getClass();
                        tq5.w(hk2.y(emulatorActivity), null, null, new nr1(map, emulatorActivity, null), 3);
                        return;
                }
            }
        });
        this.p1 = new my(1, this);
        new xq1(this, 6);
        this.v1 = new g65();
        Boolean bool = Boolean.FALSE;
        this.w1 = me2.G(bool);
        this.x1 = me2.G(bool);
        this.y1 = me2.G(bool);
        this.z1 = me2.G(null);
        this.A1 = me2.G(Boolean.TRUE);
        this.B1 = me2.G(bool);
        this.C1 = me2.G(null);
        this.D1 = me2.G(null);
        this.E1 = me2.G(null);
        this.F1 = me2.G(null);
        this.G1 = me2.G(null);
        this.H1 = me2.G(null);
        this.I1 = new xa6();
        this.O1 = new os(new nq1(this, 26), new nq1(this, 28));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
        if (defpackage.ln2.W(2000, r15, r1) == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(me.magnum.melonds.ui.emulator.EmulatorActivity r14, defpackage.k11 r15) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.emulator.EmulatorActivity.B(me.magnum.melonds.ui.emulator.EmulatorActivity, k11):java.lang.Object");
    }

    public static final void C(EmulatorActivity emulatorActivity) {
        tj4 tj4Var = emulatorActivity.G1;
        r8 r8Var = emulatorActivity.A0;
        if (r8Var != null) {
            ((RuntimeLayoutView) r8Var.k).setVisibility(4);
            r8 r8Var2 = emulatorActivity.A0;
            if (r8Var2 != null) {
                ((TextView) r8Var2.h).setVisibility(8);
                r8 r8Var3 = emulatorActivity.A0;
                if (r8Var3 != null) {
                    ((TextView) r8Var3.i).setVisibility(0);
                    if (tj4Var.getValue() == null) {
                        tj4Var.setValue(emulatorActivity.getString(R.string.info_loading));
                        return;
                    }
                    return;
                }
                b53.g0("binding");
                throw null;
            }
            b53.g0("binding");
            throw null;
        }
        b53.g0("binding");
        throw null;
    }

    public static final void k0(l75 l75Var, l75 l75Var2, Rect rect, float f) {
        if (rect != null && f > RecyclerView.A1) {
            l75Var.A = Math.max(l75Var.A, rect.getWidth());
            l75Var2.A = Math.max(l75Var2.A, rect.getHeight());
        }
    }

    public static String l0(String str, String str2) {
        return wh1.l(str, ": ", str2);
    }

    public final void A0() {
        G0("OBJ priority enables", l07.c0(new ja5("Engine A (Main) OBJ priorities", new iq1(this, 2)), new ja5("Engine B (Sub) OBJ priorities", new iq1(this, 3))), new iq1(this, 4));
    }

    public final void B0(boolean z) {
        String str;
        v95 b0 = b0();
        ti4 P = P();
        LinearLayout linearLayout = (LinearLayout) P.A;
        ScrollView scrollView = (ScrollView) P.B;
        if (z) {
            str = "Engine A (Main) OBJ priorities";
        } else {
            str = "Engine B (Sub) OBJ priorities";
        }
        String str2 = str;
        G(linearLayout, "OBJ priority enables");
        D(linearLayout, "Disables sprite layers by OAM Attribute 2 priority bits 10-11. Priority 0 is closest to the viewer; priority 3 is furthest back.");
        F(linearLayout, str2, new jq1(z, b0, 2), new gq1(z, b0, this, 4), "OBJ priority", "Code gate: `attrib[2] & 0x0C00`, then `InterleaveSprites(0x40000 | priority << 16)`.");
        I0(str2, scrollView, new nq1(this, 2));
    }

    public final void C0() {
        if (!W()) {
            return;
        }
        String string = getString(R.string.renderer_3d_debug_controls);
        string.getClass();
        ip3 C = l07.C();
        C.add(new ja5("Renderer output and primitive buckets", new bq1(this, 22)));
        C.add(new ja5("Polygon material and effects", new bq1(this, 23)));
        C.add(new ja5("Depth, fog and screen bands", new bq1(this, 24)));
        String string2 = getString(R.string.renderer_3d_debug_controls_reset);
        string2.getClass();
        C.add(new ja5(string2, new bq1(this, 25)));
        G0(string, l07.t(C), new bq1(this, 26));
    }

    public final void D(LinearLayout linearLayout, String str) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(2, 13.0f);
        textView.setPadding(0, 0, 0, R(4));
        linearLayout.addView(textView);
    }

    public final void D0() {
        G0("Depth, fog and screen bands", l07.c0(new ja5("Depth and fog mode", new bq1(this, 29)), new ja5("Screen bands", new iq1(this, 0))), new iq1(this, 1));
    }

    public final void E(LinearLayout linearLayout, v95 v95Var, int i, String str, String str2, ki2 ki2Var) {
        boolean z;
        if ((v95Var.m & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        I(linearLayout, str, str2, z, new lq1(i, 0, v95Var, ki2Var));
    }

    public final void E0() {
        G0("Polygon material and effects", l07.c0(new ja5("Texture state", new iq1(this, 19)), new ja5("Polygon mode", new iq1(this, 20))), new iq1(this, 21));
    }

    public final void F(LinearLayout linearLayout, String str, ki2 ki2Var, mi2 mi2Var, String str2, String str3) {
        H(linearLayout, str);
        for (y95 y95Var : rr1.c) {
            String str4 = y95Var.b;
            int i = y95Var.a;
            String str5 = y95Var.c;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" ");
            sb.append(i);
            sb.append(". ");
            sb.append(str5);
            String q = b31.q(sb, " ", str3);
            boolean z = true;
            if (((1 << i) & ((Number) ki2Var.c()).intValue()) != 0) {
                z = false;
            }
            I(linearLayout, str4, q, z, new cz(y95Var, ki2Var, mi2Var, 12));
        }
    }

    public final void F0() {
        G0("Renderer output and primitives", l07.c0(new ja5("3D renderer output", new iq1(this, 13)), new ja5("Primitive buckets", new iq1(this, 14)), new ja5("Blend buckets", new iq1(this, 15))), new iq1(this, 16));
    }

    public final void G(LinearLayout linearLayout, String str) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setTextSize(2, 16.0f);
        textView.setPadding(0, R(12), 0, R(4));
        linearLayout.addView(textView);
    }

    public final void G0(String str, List list, ki2 ki2Var) {
        boolean z;
        if (W() && ki2Var != null) {
            z = true;
        } else {
            z = false;
        }
        this.O1.l(ts1.PAUSE_MENU);
        sb sbVar = new sb(this);
        pb pbVar = (pb) sbVar.L;
        pbVar.d = str;
        ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ja5) it.next()).a);
        }
        sbVar.v((CharSequence[]) arrayList.toArray(new String[0]), new iw(1, list));
        if (ki2Var != null) {
            sbVar.x(R.string.navigate_back, null);
        }
        if (z) {
            pbVar.k = f0();
            pbVar.l = null;
            pbVar.g = "+1 Frame";
            pbVar.h = null;
        }
        pbVar.o = new xp1(this, 0);
        pbVar.n = new yp1(this, 0);
        tb l = sbVar.l();
        l.setOnShowListener(new zp1(ki2Var, l, this));
        l.show();
    }

    public final void H(LinearLayout linearLayout, String str) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setTextSize(2, 14.0f);
        textView.setPadding(0, R(8), 0, R(2));
        linearLayout.addView(textView);
    }

    public final void H0() {
        String string = getString(R.string.renderer_debug_menu);
        string.getClass();
        ip3 C = l07.C();
        String string2 = getString(R.string.renderer_debug_capture);
        string2.getClass();
        C.add(new ja5(string2, new nq1(this, 12)));
        if (W()) {
            C.add(new ja5(f0(), new nq1(this, 13)));
            String string3 = getString(R.string.renderer_2d_debug_controls);
            string3.getClass();
            C.add(new ja5(string3, new nq1(this, 14)));
            String string4 = getString(R.string.renderer_3d_debug_controls);
            string4.getClass();
            C.add(new ja5(string4, new nq1(this, 15)));
        }
        G0(string, l07.t(C), null);
    }

    public final void I(LinearLayout linearLayout, String str, String str2, boolean z, mi2 mi2Var) {
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(0, R(6), 0, R(6));
        SwitchCompat switchCompat = new SwitchCompat(this, null);
        switchCompat.setText(str);
        switchCompat.setChecked(z);
        switchCompat.setGravity(16);
        switchCompat.setTextSize(2, 14.0f);
        switchCompat.setSingleLine(false);
        switchCompat.setEllipsize(null);
        switchCompat.setOnCheckedChangeListener(new zn0(1, mi2Var));
        linearLayout2.addView(switchCompat, new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(this);
        textView.setText(str2);
        textView.setTextSize(2, 12.0f);
        textView.setPadding(R(4), 0, 0, 0);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
    }

    public final void I0(String str, ScrollView scrollView, ki2 ki2Var) {
        if (!W()) {
            return;
        }
        this.O1.l(ts1.PAUSE_MENU);
        sb sbVar = new sb(this);
        pb pbVar = (pb) sbVar.L;
        pbVar.d = str;
        sbVar.B(scrollView);
        sbVar.x(R.string.navigate_back, null);
        pbVar.k = f0();
        pbVar.l = null;
        pbVar.g = "+1 Frame";
        pbVar.h = null;
        pbVar.o = new xp1(this, 2);
        pbVar.n = new yp1(this, 2);
        tb l = sbVar.l();
        l.setOnShowListener(new zp1(l, this, ki2Var));
        l.show();
    }

    public final void J(LinearLayout linearLayout, z95 z95Var, int i, String str, String str2) {
        boolean z;
        if ((z95Var.a & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        I(linearLayout, str, str2, z, new lq1(i, 1, z95Var, this));
    }

    public final void J0(int i, boolean z, String str, mi2 mi2Var) {
        if (!z) {
            Toast.makeText(this, (int) R.string.retroarch_shader_root_not_valid, 1).show();
            return;
        }
        EditText editText = new EditText(this);
        editText.setInputType(524289);
        editText.setSingleLine(false);
        if (str == null) {
            str = "";
        }
        editText.setText(str);
        editText.setSelection(editText.getText().length());
        sb sbVar = new sb(this);
        sbVar.A(i);
        sbVar.B(editText);
        sbVar.z(R.string.ok, new aq1(0, mi2Var, editText));
        sbVar.x(R.string.cancel, null);
        sbVar.C();
    }

    public final void K(cm1 cm1Var) {
        vc3 vc3Var;
        boolean z;
        boolean z2;
        RuntimeLayoutView runtimeLayoutView;
        boolean z3;
        if (cm1Var != cm1.OFF) {
            int i = me.magnum.melonds.ui.emulator.a.c[cm1Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        i.c();
                        return;
                    }
                    return;
                }
                vc3Var = vc3.BOTTOM_SCREEN;
            } else {
                vc3Var = vc3.TOP_SCREEN;
            }
            r8 r8Var = this.A0;
            if (r8Var != null) {
                vc3 vc3Var2 = vc3.TOP_SCREEN;
                boolean z4 = false;
                if (((RuntimeLayoutView) r8Var.k).c(vc3Var2) != null) {
                    z = true;
                } else {
                    z = false;
                }
                r8 r8Var2 = this.A0;
                if (r8Var2 != null) {
                    vc3 vc3Var3 = vc3.BOTTOM_SCREEN;
                    if (((RuntimeLayoutView) r8Var2.k).c(vc3Var3) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z || z2) {
                        if ((z2 && !z) || z2) {
                            vc3Var2 = vc3Var3;
                        } else if (!z) {
                            vc3Var2 = null;
                        }
                    }
                    if (vc3Var2 != null) {
                        if (vc3Var2 != vc3Var) {
                            z4 = true;
                        }
                        r8 r8Var3 = this.A0;
                        if (r8Var3 != null) {
                            RuntimeLayoutView runtimeLayoutView2 = (RuntimeLayoutView) r8Var3.k;
                            boolean z5 = runtimeLayoutView2.i0;
                            if (z5 != z4) {
                                runtimeLayoutView2.i0 = !z5;
                                runtimeLayoutView2.i();
                            }
                            k42 k42Var = this.J0;
                            if (k42Var != null && (runtimeLayoutView = k42Var.L) != null && (z3 = runtimeLayoutView.i0) != z4) {
                                runtimeLayoutView.i0 = !z3;
                                runtimeLayoutView.i();
                                return;
                            }
                            return;
                        }
                        b53.g0("binding");
                        throw null;
                    }
                    return;
                }
                b53.g0("binding");
                throw null;
            }
            b53.g0("binding");
            throw null;
        }
    }

    public final void K0() {
        if (!W() || !this.e1) {
            return;
        }
        hv1 U = U();
        tq5.w(U.z, null, null, new wu1(11, null, U), 3);
    }

    public final void L(v95 v95Var) {
        if (!W()) {
            return;
        }
        RendererDebugBridge.INSTANCE.setRenderer2DDebugControls(v95Var.a, v95Var.b, v95Var.c, v95Var.d, v95Var.e, v95Var.f, v95Var.g, v95Var.h, v95Var.i, v95Var.j, v95Var.k, v95Var.l, v95Var.m);
        Y();
    }

    public final void L0() {
        if (this.e1) {
            U().O0(false);
        } else {
            U().V0();
        }
    }

    public final void M() {
        b bVar = this.c1;
        if (bVar != null) {
            Handler handler = this.K0;
            if (handler != null) {
                handler.removeCallbacks(bVar);
            } else {
                b53.g0("handler");
                throw null;
            }
        }
        this.c1 = null;
        this.d1 = 0;
    }

    public final void M0() {
        if (!W()) {
            return;
        }
        this.e1 = !this.e1;
        L0();
    }

    public final void N() {
        this.O1.M(ts1.REWIND_WINDOW);
        this.F1.setValue(null);
        if (this.N1) {
            this.N1 = false;
            g0();
            return;
        }
        U().V0();
    }

    public final void N0() {
        Integer num;
        Integer num2;
        k42 k42Var;
        Display display;
        if (!this.f1) {
            Display y = jv3.y(this);
            y.getClass();
            if (this.C0 != null) {
                Display a2 = lx5.a(this);
                if (this.i1 != c42.MELON_DUAL_DS) {
                    a2 = null;
                }
                le1 le1Var = this.D0;
                if (le1Var != null) {
                    wd3 b = le1Var.b(y, a2);
                    hv1 U = U();
                    U.getClass();
                    ee6 ee6Var = (ee6) U.u.Y;
                    ee6Var.getClass();
                    ee6Var.l(null, b);
                    fr1 fr1Var = this.j1;
                    if (!this.f1) {
                        k42 k42Var2 = this.J0;
                        if (k42Var2 != null && (display = k42Var2.getDisplay()) != null) {
                            num = Integer.valueOf(display.getDisplayId());
                        } else {
                            num = null;
                        }
                        if (a2 != null) {
                            num2 = Integer.valueOf(a2.getDisplayId());
                        } else {
                            num2 = null;
                        }
                        if (!b53.x(num, num2)) {
                            k42 k42Var3 = this.J0;
                            if (k42Var3 != null) {
                                k42Var3.dismiss();
                            }
                            this.J0 = null;
                            if (a2 != null) {
                                oh2 oh2Var = this.P0;
                                if (oh2Var != null) {
                                    k42 k42Var4 = new k42(this, a2, oh2Var, this.h1);
                                    RuntimeLayoutView runtimeLayoutView = k42Var4.L;
                                    runtimeLayoutView.setLayoutComponentViewBuilderFactory(new e81(8, (byte) 0));
                                    runtimeLayoutView.setFrontendInputHandler(fr1Var);
                                    mx2 mx2Var = this.S0;
                                    if (mx2Var != null) {
                                        runtimeLayoutView.setSystemInputHandler(mx2Var);
                                        es5 es5Var = (es5) U().u0.A.getValue();
                                        if (es5Var != null) {
                                            RuntimeLayoutView runtimeLayoutView2 = k42Var4.L;
                                            ug3 ug3Var = ug3.SECONDARY_SCREEN;
                                            runtimeLayoutView2.getClass();
                                            ug3Var.getClass();
                                            runtimeLayoutView2.e0 = es5Var;
                                            runtimeLayoutView2.e(es5Var.e, ug3Var);
                                            runtimeLayoutView2.h();
                                            runtimeLayoutView2.j();
                                            runtimeLayoutView2.g(vc3.BUTTON_TOGGLE_SOFT_INPUT, runtimeLayoutView2.h0);
                                            k42Var4.b();
                                        }
                                        runtimeLayoutView.g(vc3.BUTTON_FAST_FORWARD_TOGGLE, fr1Var.A);
                                        runtimeLayoutView.g(vc3.BUTTON_MICROPHONE_TOGGLE, fr1Var.L);
                                        runtimeLayoutView.setConnectedControllersState((rw0) this.M0.f.A.getValue());
                                        js5 js5Var = (js5) U().y0.A.getValue();
                                        k42Var4.d0 = js5Var;
                                        us1 us1Var = k42Var4.Z.e0;
                                        if (us1Var != null) {
                                            o51 o51Var = (o51) us1Var;
                                            synchronized (o51Var.b) {
                                                o51Var.c = js5Var;
                                                o51Var.d = true;
                                            }
                                        }
                                        k42Var4.b();
                                        bs5 bs5Var = (bs5) U().C0.A.getValue();
                                        bs5Var.getClass();
                                        k42Var4.c0 = bs5Var;
                                        o51 o51Var2 = k42Var4.Y;
                                        o51Var2.getClass();
                                        synchronized (o51Var2.o) {
                                            o51Var2.p = bs5Var;
                                            o51Var2.q = true;
                                            o51Var2.e = true;
                                            o51Var2.f = false;
                                        }
                                        k42Var4.b();
                                        r8 r8Var = this.A0;
                                        if (r8Var != null) {
                                            if (((RuntimeLayoutView) r8Var.k).i0) {
                                                RuntimeLayoutView runtimeLayoutView3 = k42Var4.L;
                                                runtimeLayoutView3.i0 = !runtimeLayoutView3.i0;
                                                runtimeLayoutView3.i();
                                                k42Var4.b();
                                            }
                                            if (this.O1.G()) {
                                                k42Var4.R.setVisibility(0);
                                            }
                                            k42Var4.show();
                                            this.J0 = k42Var4;
                                            if (((Boolean) this.A1.getValue()).booleanValue() && (k42Var = this.J0) != null) {
                                                k42Var.a(new et0(-1623931774, true, new sq1(this, 3)));
                                            }
                                            m0();
                                            return;
                                        }
                                        b53.g0("binding");
                                        throw null;
                                    }
                                    b53.g0("melonTouchHandler");
                                    throw null;
                                }
                                b53.g0("frameRenderCoordinator");
                                throw null;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                b53.g0("deviceLayoutDisplayMapper");
                throw null;
            }
            b53.g0("secondaryDisplaySelector");
            throw null;
        }
    }

    public final oh2 O(a aVar) {
        int i = me.magnum.melonds.ui.emulator.a.d[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new dd7(this);
            }
            i.c();
            return null;
        }
        return new od4();
    }

    public final void O0(js5 js5Var) {
        VideoFiltering videoFiltering;
        boolean z;
        String str;
        String str2;
        boolean z2;
        String str3;
        ti4 ti4Var;
        ue5 ue5Var;
        ue5 ue5Var2;
        lf5 lf5Var;
        String name;
        ue5 ue5Var3;
        ue5 ue5Var4;
        Map map;
        Set entrySet;
        ue5 ue5Var5;
        int i = 0;
        String str4 = null;
        if (js5Var != null) {
            videoFiltering = js5Var.b;
        } else {
            videoFiltering = null;
        }
        if (videoFiltering == VideoFiltering.RETROARCH && js5Var.a != VideoRenderer.VULKAN) {
            z = true;
        } else {
            z = false;
        }
        if (js5Var != null && (ue5Var5 = js5Var.d) != null) {
            str = ue5Var5.a;
        } else {
            str = null;
        }
        if (z) {
            str2 = str;
        } else {
            str2 = null;
        }
        if (z && js5Var != null && (ue5Var4 = js5Var.d) != null && (map = ue5Var4.e) != null && (entrySet = map.entrySet()) != null) {
            str4 = tq0.S0(entrySet, ",", null, null, new nl0(24), 30);
        }
        String str5 = str4;
        if (z && js5Var != null && (ue5Var3 = js5Var.d) != null && ue5Var3.f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (js5Var != null && (ue5Var2 = js5Var.d) != null && (lf5Var = ue5Var2.b) != null && (name = lf5Var.name()) != null) {
            str3 = name.toLowerCase(Locale.ROOT);
            str3.getClass();
        } else {
            str3 = "vulkan_ir";
        }
        String str6 = str3;
        if (z) {
            ti4Var = j0();
        } else {
            ti4Var = new ti4(0, 0);
        }
        Object obj = ti4Var.B;
        Object obj2 = ti4Var.A;
        if (z && js5Var != null && (ue5Var = js5Var.d) != null) {
            i = ue5Var.c;
        }
        String str7 = z + "|" + str2 + "|" + str5 + "|" + str6 + "|" + obj2 + "x" + obj + "|" + i;
        if (!str7.equals(this.V0) || z2) {
            this.V0 = str7;
            try {
                MelonEmulator.a.configureOpenGlRetroArchFilter(z, str2, str5, z2, str6, ((Number) obj2).intValue(), ((Number) obj).intValue(), i);
            } catch (Throwable unused) {
            }
        }
    }

    public final ti4 P() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(R(24), R(12), R(24), R(8));
        ScrollView scrollView = new ScrollView(this);
        scrollView.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        return new ti4(linearLayout, scrollView);
    }

    public final void P0(tb tbVar) {
        Button f = tbVar.f(-3);
        if (f != null) {
            f.setText(f0());
        }
        Button f2 = tbVar.f(-1);
        if (f2 != null) {
            f2.setEnabled(this.e1);
        }
    }

    public final void Q() {
        tj4 tj4Var = this.H1;
        if (tj4Var.getValue() != null) {
            tj4Var.setValue(null);
            this.O1.M(ts1.SAVE_STATES_DIALOG);
            k42 k42Var = this.J0;
            if (k42Var != null) {
                k42Var.a(null);
            }
        }
    }

    public final void Q0() {
        boolean z;
        int i;
        Rect rect;
        Rect rect2;
        boolean z2;
        Rect rect3;
        boolean z3;
        ti4 ti4Var;
        Rect rect4;
        Rect rect5;
        boolean z4;
        VulkanPresentationConfig vulkanPresentationConfig;
        Window window;
        View decorView;
        ArrayList arrayList;
        if (!this.f1 && !this.g1) {
            er1 i0 = i0();
            Rect rect6 = i0.h;
            Rect rect7 = i0.b;
            O0(this.U0);
            o51 o51Var = this.R0;
            if (o51Var != null) {
                o51Var.e(i0.a, i0.b, i0.c, i0.d, i0.f, i0.g, i0.h, i0.i, i0.j);
                oh2 oh2Var = this.P0;
                if (oh2Var != null) {
                    r8 r8Var = this.A0;
                    if (r8Var != null) {
                        EmulatorSurfaceView emulatorSurfaceView = (EmulatorSurfaceView) r8Var.g;
                        Rect rect8 = i0.a;
                        float f = i0.c;
                        float f2 = i0.d;
                        boolean z5 = i0.e;
                        boolean z6 = i0.f;
                        Rect rect9 = i0.g;
                        float f3 = i0.i;
                        boolean z7 = i0.j;
                        js5 js5Var = this.U0;
                        if (js5Var != null) {
                            ue5 ue5Var = js5Var.d;
                            if (js5Var.a == VideoRenderer.VULKAN) {
                                if (r8Var != null) {
                                    ti4 currentSurfaceSize = emulatorSurfaceView.getCurrentSurfaceSize();
                                    int intValue = ((Number) currentSurfaceSize.A).intValue();
                                    int intValue2 = ((Number) currentSurfaceSize.B).intValue();
                                    if (intValue <= 0) {
                                        r8 r8Var2 = this.A0;
                                        if (r8Var2 != null) {
                                            intValue = ((EmulatorSurfaceView) r8Var2.g).getWidth();
                                        } else {
                                            b53.g0("binding");
                                            throw null;
                                        }
                                    }
                                    if (intValue2 <= 0) {
                                        r8 r8Var3 = this.A0;
                                        if (r8Var3 != null) {
                                            intValue2 = ((EmulatorSurfaceView) r8Var3.g).getHeight();
                                        } else {
                                            b53.g0("binding");
                                            throw null;
                                        }
                                    }
                                    if (rect9 == null && rect6 == null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    rect8 = (rect8 == null || rect8.getWidth() <= 0 || rect8.getHeight() <= 0) ? null : null;
                                    if (rect7 != null && rect7.getWidth() > 0 && rect7.getHeight() > 0) {
                                        i = intValue2;
                                        rect = rect7;
                                    } else {
                                        i = intValue2;
                                        rect = null;
                                    }
                                    if (rect8 != null || rect != null || !z) {
                                        rect2 = rect6;
                                        z2 = z6;
                                        rect3 = rect9;
                                        z3 = false;
                                        ti4Var = new ti4(rect8, rect);
                                    } else if (intValue <= 0 || i <= 0) {
                                        rect2 = rect6;
                                        z2 = z6;
                                        rect3 = rect9;
                                        z3 = false;
                                        ti4Var = new ti4(null, null);
                                    } else {
                                        int max = Math.max(1, i / 2);
                                        z2 = z6;
                                        rect2 = rect6;
                                        z3 = false;
                                        rect3 = rect9;
                                        ti4Var = new ti4(new Rect(0, 0, intValue, max), new Rect(0, max, intValue, Math.max(1, i - max)));
                                    }
                                    Rect rect10 = (Rect) ti4Var.A;
                                    Rect rect11 = (Rect) ti4Var.B;
                                    if (rect3 != null && rect3.getWidth() > 0 && rect3.getHeight() > 0) {
                                        rect4 = rect3;
                                    } else {
                                        rect4 = null;
                                    }
                                    if (rect2 != null && rect2.getWidth() > 0 && rect2.getHeight() > 0) {
                                        rect5 = rect2;
                                    } else {
                                        rect5 = null;
                                    }
                                    BackgroundMode backgroundMode = this.a1.b;
                                    VideoFiltering videoFiltering = js5Var.b;
                                    if (videoFiltering == VideoFiltering.RETROARCH) {
                                        z4 = true;
                                    } else {
                                        z4 = z3;
                                    }
                                    String str = ue5Var.a;
                                    String lowerCase = ue5Var.b.name().toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    vulkanPresentationConfig = new VulkanPresentationConfig(rect10, rect11, f, f2, z5, z2, rect4, rect5, f3, z7, backgroundMode, videoFiltering, z4, str, lowerCase, ue5Var.c, ue5Var.e, ue5Var.f);
                                    oh2Var.d(emulatorSurfaceView, vulkanPresentationConfig, this.a1);
                                    if (Build.VERSION.SDK_INT < 29 && (window = getWindow()) != null && (decorView = window.getDecorView()) != null && decorView.isAttachedToWindow()) {
                                        if (this.h1) {
                                            ArrayList o0 = nu.o0(new Rect[]{rect7, rect2});
                                            arrayList = new ArrayList(uq0.y0(o0, 10));
                                            int size = o0.size();
                                            int i2 = 0;
                                            while (i2 < size) {
                                                Object obj = o0.get(i2);
                                                i2++;
                                                Rect rect12 = (Rect) obj;
                                                arrayList.add(new android.graphics.Rect(rect12.getX(), rect12.getY(), rect12.getRight(), rect12.getBottom()));
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        Window window2 = getWindow();
                                        List list = arrayList;
                                        if (window2 != null) {
                                            if (arrayList == null) {
                                                list = pp1.A;
                                            }
                                            window2.setSystemGestureExclusionRects(list);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                b53.g0("binding");
                                throw null;
                            }
                        }
                        rect2 = rect6;
                        vulkanPresentationConfig = null;
                        oh2Var.d(emulatorSurfaceView, vulkanPresentationConfig, this.a1);
                        if (Build.VERSION.SDK_INT < 29) {
                            return;
                        }
                        return;
                    }
                    b53.g0("binding");
                    throw null;
                }
                b53.g0("frameRenderCoordinator");
                throw null;
            }
            b53.g0("mainScreenRenderer");
            throw null;
        }
    }

    public final int R(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    public final void S() {
        String[] kc5Var;
        String str;
        Iterable iterable;
        Collection collection;
        String str2;
        n26 n26Var;
        int i;
        int i2;
        int i3;
        Object obj;
        String str3;
        try {
            kc5Var = MelonEmulator.a.consumeShaderDiagnostics();
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        boolean z = kc5Var instanceof kc5;
        kc5 kc5Var2 = kc5Var;
        if (z) {
            kc5Var2 = null;
        }
        String[] strArr = (String[]) kc5Var2;
        if (strArr != null && strArr.length != 0) {
            o26 o26Var = this.Y0;
            if (o26Var != null) {
                synchronized (o26Var) {
                    int i4 = 1;
                    if (strArr.length == 0) {
                        iterable = pp1.A;
                        str = null;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i6 < length) {
                            String str4 = strArr[i6];
                            char[] cArr = new char[i4];
                            cArr[i5] = '\t';
                            List P0 = zg6.P0(str4, cArr, 6);
                            if (P0.size() < 5) {
                                i3 = length;
                                i2 = i5;
                                i = i6;
                                n26Var = null;
                            } else {
                                int i7 = length;
                                String str5 = (String) P0.get(i5);
                                boolean x = b53.x(P0.get(i4), "OK");
                                String str6 = (String) P0.get(2);
                                String str7 = (String) P0.get(3);
                                String str8 = (String) P0.get(4);
                                String str9 = (String) tq0.N0(5, P0);
                                if (str9 == null) {
                                    str9 = "";
                                }
                                i = i6;
                                i2 = 0;
                                i3 = i7;
                                n26Var = new n26(currentTimeMillis, str5, x, str6, str7, str8, str9);
                            }
                            if (n26Var != null) {
                                arrayList.add(n26Var);
                            }
                            i6 = i + 1;
                            length = i3;
                            i5 = i2;
                            i4 = 1;
                        }
                        int i8 = i5;
                        str = null;
                        if (arrayList.isEmpty()) {
                            iterable = pp1.A;
                        } else {
                            try {
                                if (o26Var.a.isFile()) {
                                    collection = q72.K(o26Var.a);
                                } else {
                                    collection = pp1.A;
                                }
                                ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
                                int size = arrayList.size();
                                int i9 = i8;
                                while (i9 < size) {
                                    Object obj2 = arrayList.get(i9);
                                    i9++;
                                    n26 n26Var2 = (n26) obj2;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(o26Var.b.format(new Date(n26Var2.a)));
                                    sb.append('\t');
                                    sb.append(n26Var2.b);
                                    sb.append('\t');
                                    if (n26Var2.c) {
                                        str2 = "OK";
                                    } else {
                                        str2 = "FAIL";
                                    }
                                    sb.append(str2);
                                    sb.append('\t');
                                    String str10 = n26Var2.d;
                                    sb.append(zg6.T0(str10, "retroarch-shaders/installed/", zg6.U0('/', str10, str10)));
                                    sb.append('\t');
                                    sb.append(n26Var2.e);
                                    sb.append(" -> ");
                                    sb.append(n26Var2.f);
                                    if (!zg6.B0(n26Var2.g)) {
                                        sb.append('\t');
                                        String replace = n26Var2.g.replace('\n', ' ');
                                        replace.getClass();
                                        String replace2 = replace.replace('\r', ' ');
                                        replace2.getClass();
                                        sb.append(replace2);
                                    }
                                    arrayList2.add(sb.toString());
                                }
                                q72.O(o26Var.a, tq0.S0(tq0.i1(200, tq0.X0(collection, arrayList2)), "\n", null, "\n", null, 58));
                            } catch (Throwable unused) {
                            }
                            iterable = arrayList;
                        }
                    }
                }
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (!((n26) obj).c) {
                            break;
                        }
                    } else {
                        obj = str;
                        break;
                    }
                }
                n26 n26Var3 = (n26) obj;
                if (n26Var3 == null) {
                    return;
                }
                io3 io3Var = new io3(n26Var3.g);
                while (true) {
                    if (io3Var.hasNext()) {
                        Object next = io3Var.next();
                        if (!zg6.B0((String) next)) {
                            str3 = next;
                            break;
                        }
                    } else {
                        str3 = str;
                        break;
                    }
                }
                String str11 = str3;
                if (str11 == null) {
                    str11 = "";
                }
                String str12 = n26Var3.d;
                Toast.makeText(this, getString(R.string.shader_compatibility_preset_failed, zg6.T0(str12, "retroarch-shaders/installed/", zg6.U0('/', str12, str12)), str11), 1).show();
                return;
            }
            b53.g0("shaderCompatibilityLog");
            throw null;
        }
    }

    public final String T(Long l) {
        if (l == null) {
            return null;
        }
        if (l.longValue() <= 0) {
            return getString(R.string.offline_ra_ledger_expired);
        }
        long longValue = (l.longValue() + 86399999) / 86400000;
        if (longValue < 1) {
            longValue = 1;
        }
        int i = (int) longValue;
        return getResources().getQuantityString(R.plurals.offline_ra_ledger_expires_days, i, Integer.valueOf(i));
    }

    public final hv1 U() {
        return (hv1) this.B0.getValue();
    }

    public final boolean V() {
        if (this.z1.getValue() == null && this.H1.getValue() == null && this.I1.isEmpty() && !((Boolean) this.y1.getValue()).booleanValue() && this.F1.getValue() == null) {
            return false;
        }
        return true;
    }

    public final boolean W() {
        if ((getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean X(int i) {
        boolean z;
        jc2 jc2Var = this.J1;
        r8 r8Var = this.A0;
        if (r8Var != null) {
            if (!((ComposeView) r8Var.c).hasFocus()) {
                r8 r8Var2 = this.A0;
                if (r8Var2 != null) {
                    ((ComposeView) r8Var2.c).requestFocus();
                } else {
                    b53.g0("binding");
                    throw null;
                }
            }
            if (jc2Var != null) {
                z = ((nc2) jc2Var).g(i, true);
            } else {
                z = false;
            }
            if (!z) {
                if (jc2Var == null) {
                    return false;
                }
                return ((nc2) jc2Var).g(7, true);
            }
            return z;
        }
        b53.g0("binding");
        throw null;
    }

    public final void Y() {
        if (!W() || !this.e1) {
            return;
        }
        K0();
    }

    public final void Z() {
        xa6 xa6Var = this.I1;
        if (!xa6Var.isEmpty()) {
            xa6Var.remove(xa6Var.size() - 1);
        }
        if (xa6Var.isEmpty() && this.z1.getValue() == null) {
            g0();
        }
    }

    public final void a0(cr1 cr1Var) {
        this.O1.l(ts1.PAUSE_MENU);
        this.I1.add(cr1Var);
        h0(0);
    }

    public final v95 b0() {
        if (!W()) {
            return new v95();
        }
        int[] renderer2DDebugControls = RendererDebugBridge.INSTANCE.getRenderer2DDebugControls();
        if (renderer2DDebugControls != null && renderer2DDebugControls.length >= 13) {
            return new v95(renderer2DDebugControls[0], renderer2DDebugControls[1], renderer2DDebugControls[2], renderer2DDebugControls[3], renderer2DDebugControls[4], renderer2DDebugControls[5], renderer2DDebugControls[6], renderer2DDebugControls[7], renderer2DDebugControls[8], renderer2DDebugControls[9], renderer2DDebugControls[10], renderer2DDebugControls[11], renderer2DDebugControls[12]);
        }
        return new v95();
    }

    public final z95 c0() {
        if (!W()) {
            return new z95();
        }
        int[] renderer3DDebugControls = RendererDebugBridge.INSTANCE.getRenderer3DDebugControls();
        if (renderer3DDebugControls != null && renderer3DDebugControls.length >= 1) {
            return new z95(renderer3DDebugControls[0]);
        }
        return new z95();
    }

    public final boolean d0() {
        cr1 cr1Var = (cr1) tq0.U0(this.I1);
        if ((cr1Var instanceof br1) && ((br1) cr1Var).a.equals(getString(R.string.rom_settings))) {
            U().M0(cp5.ROM_SETTINGS);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b4, code lost:
        r0 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bb, code lost:
        r20 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bd, code lost:
        r0 = (defpackage.f03) r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c1, code lost:
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c3, code lost:
        r0 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c6, code lost:
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c8, code lost:
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cc, code lost:
        if (r12.b == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ce, code lost:
        r12.b = false;
        r2.c(r0, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d9, code lost:
        if (r0.isSystemInput() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01db, code lost:
        r11.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01df, code lost:
        r6.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e3, code lost:
        r12.b = true;
        r2.c(r0, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ed, code lost:
        if (r0.isSystemInput() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ef, code lost:
        r11.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f3, code lost:
        r6.c(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f6, code lost:
        r12.a = r14;
        r10 = r16;
        r9 = r18;
        r7 = 2;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013e, code lost:
        if (r14 > androidx.recyclerview.widget.RecyclerView.A1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0140, code lost:
        r14 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
        if (r14 < androidx.recyclerview.widget.RecyclerView.A1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014e, code lost:
        if (r12.b == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0156, code lost:
        if (java.lang.Math.abs(r14) >= r16) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:
        if (java.lang.Math.abs(r14) < r16) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
        r9 = r2.a;
        r13 = r13.b;
        r9.getClass();
        r9 = r9.b;
        r7 = r9.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016f, code lost:
        if (r8 >= r7) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0171, code lost:
        r20 = r9.get(r8);
        r8 = r8 + 1;
        r10 = (defpackage.f03) r20;
        r0 = defpackage.l07.c0(r10.b, r10.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018b, code lost:
        if (r0.isEmpty() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018e, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0196, code lost:
        if (r0.hasNext() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0198, code lost:
        r10 = (defpackage.e03) r0.next();
        r21 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a2, code lost:
        if ((r10 instanceof defpackage.b03) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a4, code lost:
        r10 = (defpackage.b03) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a7, code lost:
        r10 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a9, code lost:
        if (r10 == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ad, code lost:
        if (r10.b != r13) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b1, code lost:
        if (r10.c != r15) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.emulator.EmulatorActivity.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.xp, defpackage.xs0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        zb2 zb2Var;
        yz2 yz2Var;
        boolean z;
        InputDevice device;
        InputDevice device2;
        c03 c03Var;
        keyEvent.getClass();
        if (!this.O1.G()) {
            a13 a13Var = this.T0;
            if (a13Var != null) {
                qu2 qu2Var = a13Var.c;
                qu2 qu2Var2 = a13Var.b;
                m11 m11Var = a13Var.a;
                int keyCode = keyEvent.getKeyCode();
                ArrayList arrayList = m11Var.b;
                int size = arrayList.size();
                int i = 0;
                loop0: while (true) {
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        f03 f03Var = (f03) obj;
                        List<e03> c0 = l07.c0(f03Var.b, f03Var.c);
                        if (!c0.isEmpty()) {
                            for (e03 e03Var : c0) {
                                if (e03Var instanceof c03) {
                                    c03Var = (c03) e03Var;
                                } else {
                                    c03Var = null;
                                }
                                if (c03Var != null && c03Var.b == keyCode) {
                                    yz2Var = f03Var.a;
                                    break loop0;
                                }
                            }
                            continue;
                        }
                    } else {
                        yz2Var = null;
                        break;
                    }
                }
                if (yz2Var != null) {
                    if (!keyEvent.isFromSource(16) && !keyEvent.isFromSource(16777232) && !keyEvent.isFromSource(1025) && !keyEvent.isFromSource(513) && (((device = keyEvent.getDevice()) == null || !device.supportsSource(16777232)) && ((device2 = keyEvent.getDevice()) == null || !device2.supportsSource(1025)))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        if (action == 1) {
                            a13Var.c(yz2Var, false, z);
                            if (yz2Var.isSystemInput()) {
                                qu2Var2.b(yz2Var);
                                return true;
                            }
                            qu2Var.b(yz2Var);
                            return true;
                        }
                    } else {
                        a13Var.c(yz2Var, true, z);
                        if (yz2Var.isSystemInput()) {
                            qu2Var2.c(yz2Var);
                            return true;
                        }
                        qu2Var.c(yz2Var);
                        return true;
                    }
                }
            } else {
                b53.g0("nativeInputListener");
                throw null;
            }
        }
        if (V() && keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 19:
                    zb2Var = new zb2(5);
                    break;
                case 20:
                    zb2Var = new zb2(6);
                    break;
                case 21:
                    zb2Var = new zb2(3);
                    break;
                case 22:
                    zb2Var = new zb2(4);
                    break;
                default:
                    zb2Var = null;
                    break;
            }
            if (zb2Var != null) {
                if (X(zb2Var.a)) {
                    return true;
                }
                r8 r8Var = this.A0;
                if (r8Var != null) {
                    ((ComposeView) r8Var.c).dispatchKeyEvent(keyEvent);
                    return true;
                }
                b53.g0("binding");
                throw null;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e0() {
        oh2 oh2Var;
        M();
        tb tbVar = this.q1;
        if (tbVar != null) {
            tbVar.dismiss();
        }
        this.q1 = null;
        tb tbVar2 = this.r1;
        if (tbVar2 != null) {
            tbVar2.dismiss();
        }
        this.r1 = null;
        tb tbVar3 = this.s1;
        if (tbVar3 != null) {
            tbVar3.dismiss();
        }
        this.s1 = null;
        tb tbVar4 = this.t1;
        if (tbVar4 != null) {
            tbVar4.dismiss();
        }
        this.t1 = null;
        tb tbVar5 = this.u1;
        if (tbVar5 != null) {
            tbVar5.dismiss();
        }
        this.u1 = null;
        Boolean bool = Boolean.FALSE;
        this.w1.setValue(bool);
        this.x1.setValue(bool);
        this.y1.setValue(bool);
        eo0 eo0Var = this.Q0;
        if (eo0Var != null) {
            eo0Var.a();
        }
        k42 k42Var = this.J0;
        if (k42Var != null) {
            try {
                k42Var.dismiss();
            } catch (Throwable unused) {
            }
        }
        this.J0 = null;
        if (!this.g1 && (oh2Var = this.P0) != null) {
            r8 r8Var = this.A0;
            if (r8Var != null) {
                oh2Var.b((EmulatorSurfaceView) r8Var.g);
            }
            oh2 oh2Var2 = this.P0;
            if (oh2Var2 != null) {
                oh2Var2.stop();
                this.g1 = true;
                return;
            }
            b53.g0("frameRenderCoordinator");
            throw null;
        }
    }

    public final String f0() {
        int i;
        if (this.e1) {
            i = R.string.on;
        } else {
            i = R.string.off;
        }
        return b31.p("Pause Emulation: ", getString(i));
    }

    public final void g0() {
        kl4 kl4Var = this.M1;
        if (kl4Var != null) {
            this.z1.setValue(kl4Var);
        } else {
            U().V0();
        }
    }

    public final void h0(int i) {
        ComposeView composeView;
        View view;
        r8 r8Var = this.A0;
        View view2 = null;
        if (r8Var != null) {
            ComposeView composeView2 = (ComposeView) r8Var.c;
            composeView2.setFocusable(false);
            composeView2.setFocusableInTouchMode(false);
            composeView2.setDescendantFocusability(262144);
            if (composeView2.getChildCount() > 0) {
                composeView = composeView2;
            } else {
                composeView = null;
            }
            if (composeView == null || (view = composeView.getChildAt(0)) == null) {
                view = composeView2;
            }
            view.setFocusableInTouchMode(true);
            if (!view.requestFocusFromTouch()) {
                view.requestFocus();
            }
            View findFocus = composeView2.findFocus();
            if (findFocus != null && findFocus != composeView2) {
                view2 = findFocus;
            }
            if (view2 == null && i < 12) {
                composeView2.postDelayed(new cm(i, 3, this), 32L);
                return;
            }
            return;
        }
        b53.g0("binding");
        throw null;
    }

    public final er1 i0() {
        ti4 ti4Var;
        ti4 ti4Var2;
        Rect rect;
        float f;
        float f2;
        boolean z;
        boolean z2;
        r8 r8Var = this.A0;
        Rect rect2 = null;
        if (r8Var != null) {
            RuntimeLayoutView runtimeLayoutView = (RuntimeLayoutView) r8Var.k;
            if (runtimeLayoutView.i0) {
                ti4Var = new ti4(vc3.BOTTOM_SCREEN, vc3.TOP_SCREEN);
            } else {
                ti4Var = new ti4(vc3.TOP_SCREEN, vc3.BOTTOM_SCREEN);
            }
            vc3 vc3Var = (vc3) ti4Var.B;
            hd3 c = runtimeLayoutView.c((vc3) ti4Var.A);
            r8 r8Var2 = this.A0;
            if (r8Var2 != null) {
                hd3 c2 = ((RuntimeLayoutView) r8Var2.k).c(vc3Var);
                r8 r8Var3 = this.A0;
                if (r8Var3 != null) {
                    hd3 c3 = ((RuntimeLayoutView) r8Var3.k).c(vc3.HYBRID_SCREEN);
                    if (c3 != null) {
                        Rect b = c3.b();
                        int max = Math.max(1, b.getHeight() / 2);
                        ti4Var2 = new ti4(new Rect(b.getX(), b.getY(), b.getWidth(), max), new Rect(b.getX(), b.getY() + max, b.getWidth(), Math.max(1, b.getHeight() - max)));
                    } else {
                        ti4Var2 = new ti4(null, null);
                    }
                    Rect rect3 = (Rect) ti4Var2.A;
                    Rect rect4 = (Rect) ti4Var2.B;
                    if (c != null) {
                        rect = c.b();
                    } else {
                        rect = null;
                    }
                    if (c2 != null) {
                        rect2 = c2.b();
                    }
                    Rect rect5 = rect2;
                    float f3 = 1.0f;
                    if (c != null) {
                        f = c.c;
                    } else {
                        f = 1.0f;
                    }
                    if (c2 != null) {
                        f2 = c2.c;
                    } else {
                        f2 = 1.0f;
                    }
                    boolean z3 = false;
                    if (c != null) {
                        z = c.d;
                    } else {
                        z = false;
                    }
                    if (c2 != null) {
                        z2 = c2.d;
                    } else {
                        z2 = false;
                    }
                    if (c3 != null) {
                        f3 = c3.c;
                    }
                    float f4 = f3;
                    if (c3 != null) {
                        z3 = c3.d;
                    }
                    return new er1(rect, rect5, f, f2, z, z2, rect3, rect4, f4, z3);
                }
                b53.g0("binding");
                throw null;
            }
            b53.g0("binding");
            throw null;
        }
        b53.g0("binding");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l75] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l75] */
    public final ti4 j0() {
        ?? obj = new Object();
        ?? obj2 = new Object();
        try {
            er1 i0 = i0();
            float f = i0.i;
            k0(obj, obj2, i0.a, i0.c);
            k0(obj, obj2, i0.b, i0.d);
            k0(obj, obj2, i0.g, f);
            k0(obj, obj2, i0.h, f);
        } catch (Throwable unused) {
        }
        return new ti4(Integer.valueOf(obj.A), Integer.valueOf(obj2.A));
    }

    public final void m0() {
        M();
        if (this.f1 || this.b1 != a.VULKAN) {
            return;
        }
        this.d1 = 0;
        b bVar = new b(this);
        this.c1 = bVar;
        Handler handler = this.K0;
        if (handler != null) {
            handler.post(bVar);
        } else {
            b53.g0("handler");
            throw null;
        }
    }

    public final void n0() {
        Object kc5Var;
        b56 b56Var = (b56) U().c;
        b56Var.getClass();
        Enum r1 = nf2.HIDDEN;
        SharedPreferences sharedPreferences = b56Var.b;
        String lowerCase = r1.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = sharedPreferences.getString("fps_counter_position", lowerCase);
        if (string != null) {
            try {
                kc5Var = se.t(string, nf2.values());
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            if (nc5.a(kc5Var) != null) {
                wh1.y("Invalid enum preference fps_counter_position=", string, "; using ", r1.name(), "SPSettingsRepository");
            }
            Enum r12 = r1;
            if (!(kc5Var instanceof kc5)) {
                r12 = kc5Var;
            }
            r1 = r12;
        }
        nf2 nf2Var = (nf2) r1;
        nf2 nf2Var2 = nf2.HIDDEN;
        r8 r8Var = this.A0;
        if (nf2Var == nf2Var2) {
            if (r8Var != null) {
                ((TextView) r8Var.h).setVisibility(8);
            } else {
                b53.g0("binding");
                throw null;
            }
        } else if (r8Var != null) {
            ((TextView) r8Var.h).setVisibility(0);
            r8 r8Var2 = this.A0;
            if (r8Var2 != null) {
                ViewGroup.LayoutParams layoutParams = ((TextView) r8Var2.h).getLayoutParams();
                layoutParams.getClass();
                jy0 jy0Var = (jy0) layoutParams;
                switch (me.magnum.melonds.ui.emulator.a.b[nf2Var.ordinal()]) {
                    case 1:
                        jy0Var.i = 0;
                        jy0Var.e = 0;
                        break;
                    case 2:
                        jy0Var.i = 0;
                        jy0Var.e = 0;
                        jy0Var.h = 0;
                        break;
                    case 3:
                        jy0Var.i = 0;
                        jy0Var.h = 0;
                        break;
                    case 4:
                        jy0Var.l = 0;
                        jy0Var.e = 0;
                        break;
                    case 5:
                        jy0Var.l = 0;
                        jy0Var.e = 0;
                        jy0Var.h = 0;
                        break;
                    case ig7.b /* 6 */:
                        jy0Var.l = 0;
                        jy0Var.h = 0;
                        break;
                    case 7:
                        break;
                    default:
                        i.c();
                        return;
                }
                r8 r8Var3 = this.A0;
                if (r8Var3 != null) {
                    ((TextView) r8Var3.h).setLayoutParams(jy0Var);
                    return;
                } else {
                    b53.g0("binding");
                    throw null;
                }
            }
            b53.g0("binding");
            throw null;
        } else {
            b53.g0("binding");
            throw null;
        }
    }

    public final void o0() {
        G0("Background type enables", l07.c0(new ja5("Tile background types", new bq1(this, 15)), new ja5("Bitmap background types", new bq1(this, 16)), new ja5("Special background types", new bq1(this, 17))), new bq1(this, 18));
    }

    @Override // defpackage.xp, defpackage.ys0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if4 if4Var;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            if4Var = if4.PORTRAIT;
        } else {
            if4Var = if4.LANDSCAPE;
        }
        hv1 U = U();
        U.getClass();
        if4Var.getClass();
        ee6 ee6Var = (ee6) U.u.R;
        ee6Var.getClass();
        ee6Var.l(null, if4Var);
        Handler handler = this.K0;
        if (handler != null) {
            handler.post(new wp1(this, 26));
        } else {
            b53.g0("handler");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [mx2, java.lang.Object] */
    @Override // defpackage.rr2, androidx.fragment.app.p, defpackage.ys0, defpackage.xs0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        bg7 wf7Var;
        a aVar;
        eo0 fo0Var;
        if4 if4Var;
        super.onCreate(bundle);
        this.K0 = new Handler(getMainLooper());
        w16 w16Var = this.H0;
        if (w16Var != null) {
            this.i1 = ((b56) w16Var).l();
            gn3 gn3Var = this.F0;
            if (gn3Var != null) {
                gn3Var.a = this;
                this.A.a(new w55(3, gn3Var));
                View inflate = getLayoutInflater().inflate(R.layout.activity_emulator, (ViewGroup) null, false);
                int i = R.id.layout_achievement;
                ComposeView composeView = (ComposeView) ep2.r(inflate, R.id.layout_achievement);
                if (composeView != null) {
                    i = R.id.layout_pause_menu;
                    ComposeView composeView2 = (ComposeView) ep2.r(inflate, R.id.layout_pause_menu);
                    if (composeView2 != null) {
                        i = R.id.layout_rewind;
                        RelativeLayout relativeLayout = (RelativeLayout) ep2.r(inflate, R.id.layout_rewind);
                        if (relativeLayout != null) {
                            MotionLayout motionLayout = (MotionLayout) inflate;
                            i = R.id.list_rewind;
                            RecyclerView recyclerView = (RecyclerView) ep2.r(inflate, R.id.list_rewind);
                            if (recyclerView != null) {
                                i = R.id.progressLoading;
                                ProgressBar progressBar = (ProgressBar) ep2.r(inflate, R.id.progressLoading);
                                if (progressBar != null) {
                                    i = R.id.surfaceMain;
                                    EmulatorSurfaceView emulatorSurfaceView = (EmulatorSurfaceView) ep2.r(inflate, R.id.surfaceMain);
                                    if (emulatorSurfaceView != null) {
                                        i = R.id.textFps;
                                        TextView textView = (TextView) ep2.r(inflate, R.id.textFps);
                                        if (textView != null) {
                                            i = R.id.textLoading;
                                            TextView textView2 = (TextView) ep2.r(inflate, R.id.textLoading);
                                            if (textView2 != null) {
                                                i = R.id.textLoadingDetail;
                                                TextView textView3 = (TextView) ep2.r(inflate, R.id.textLoadingDetail);
                                                if (textView3 != null) {
                                                    i = R.id.view_layout_controls;
                                                    RuntimeLayoutView runtimeLayoutView = (RuntimeLayoutView) ep2.r(inflate, R.id.view_layout_controls);
                                                    if (runtimeLayoutView != null) {
                                                        this.A0 = new r8(motionLayout, composeView, composeView2, relativeLayout, recyclerView, progressBar, emulatorSurfaceView, textView, textView2, textView3, runtimeLayoutView);
                                                        v().g(1);
                                                        r8 r8Var = this.A0;
                                                        if (r8Var != null) {
                                                            setContentView((MotionLayout) r8Var.a);
                                                            Window window = getWindow();
                                                            window.getClass();
                                                            dz4 dz4Var = new dz4(window.getDecorView());
                                                            int i2 = Build.VERSION.SDK_INT;
                                                            if (i2 >= 35) {
                                                                wf7Var = new zf7(window, dz4Var);
                                                            } else if (i2 >= 30) {
                                                                wf7Var = new zf7(window, dz4Var);
                                                            } else if (i2 >= 26) {
                                                                wf7Var = new wf7(window, dz4Var);
                                                            } else {
                                                                wf7Var = new wf7(window, dz4Var);
                                                            }
                                                            wf7Var.b(2);
                                                            wf7Var.f();
                                                            r8 r8Var2 = this.A0;
                                                            if (r8Var2 != null) {
                                                                a31 a31Var = new a31(8, this);
                                                                WeakHashMap weakHashMap = aa7.a;
                                                                s97.c((MotionLayout) r8Var2.a, a31Var);
                                                                b().b(this.p1);
                                                                this.N0 = new r9(this, new t71(16, this));
                                                                this.O0 = new os(this, hk2.y(this), this.M0);
                                                                if (((b56) U().c).e() == VideoRenderer.VULKAN) {
                                                                    aVar = a.VULKAN;
                                                                } else {
                                                                    aVar = a.OPEN_GL;
                                                                }
                                                                this.b1 = aVar;
                                                                oh2 O = O(aVar);
                                                                this.P0 = O;
                                                                if (i2 >= 33) {
                                                                    fo0Var = new go0(O);
                                                                } else {
                                                                    fo0Var = new fo0(O);
                                                                }
                                                                this.Q0 = fo0Var;
                                                                this.S0 = new Object();
                                                                o51 o51Var = new o51(this);
                                                                this.R0 = o51Var;
                                                                r8 r8Var3 = this.A0;
                                                                if (r8Var3 != null) {
                                                                    ((EmulatorSurfaceView) r8Var3.g).setRenderer(o51Var);
                                                                    r8 r8Var4 = this.A0;
                                                                    if (r8Var4 != null) {
                                                                        ((TextView) r8Var4.h).setVisibility(4);
                                                                        r8 r8Var5 = this.A0;
                                                                        if (r8Var5 != null) {
                                                                            ((RuntimeLayoutView) r8Var5.k).setLayoutComponentViewBuilderFactory(new e81(8, (byte) 0));
                                                                            r8 r8Var6 = this.A0;
                                                                            if (r8Var6 != null) {
                                                                                ((RelativeLayout) r8Var6.d).setOnClickListener(new fq1(this, 1));
                                                                                r8 r8Var7 = this.A0;
                                                                                if (r8Var7 != null) {
                                                                                    RecyclerView recyclerView2 = (RecyclerView) r8Var7.e;
                                                                                    recyclerView2.getContext();
                                                                                    recyclerView2.setLayoutManager(new LinearLayoutManager(0, true));
                                                                                    recyclerView2.i(new hn1());
                                                                                    recyclerView2.setAdapter(this.v1);
                                                                                    r8 r8Var8 = this.A0;
                                                                                    if (r8Var8 != null) {
                                                                                        RuntimeLayoutView runtimeLayoutView2 = (RuntimeLayoutView) r8Var8.k;
                                                                                        runtimeLayoutView2.setFrontendInputHandler(this.j1);
                                                                                        mx2 mx2Var = this.S0;
                                                                                        if (mx2Var != null) {
                                                                                            runtimeLayoutView2.setSystemInputHandler(mx2Var);
                                                                                            si0 si0Var = new si0(1, this);
                                                                                            r8 r8Var9 = this.A0;
                                                                                            if (r8Var9 != null) {
                                                                                                ((RuntimeLayoutView) r8Var9.k).addOnLayoutChangeListener(si0Var);
                                                                                                Configuration configuration = getResources().getConfiguration();
                                                                                                configuration.getClass();
                                                                                                if (configuration.orientation == 1) {
                                                                                                    if4Var = if4.PORTRAIT;
                                                                                                } else {
                                                                                                    if4Var = if4.LANDSCAPE;
                                                                                                }
                                                                                                hv1 U = U();
                                                                                                U.getClass();
                                                                                                if4Var.getClass();
                                                                                                ee6 ee6Var = (ee6) U.u.R;
                                                                                                ee6Var.getClass();
                                                                                                ee6Var.l(null, if4Var);
                                                                                                getWindow().addFlags(128);
                                                                                                r8 r8Var10 = this.A0;
                                                                                                if (r8Var10 != null) {
                                                                                                    ((ComposeView) r8Var10.b).setContent(new et0(553795587, true, new sq1(this, 1)));
                                                                                                    r8 r8Var11 = this.A0;
                                                                                                    if (r8Var11 != null) {
                                                                                                        ((ComposeView) r8Var11.c).setContent(new et0(47377708, true, new sq1(this, 2)));
                                                                                                        r8 r8Var12 = this.A0;
                                                                                                        if (r8Var12 != null) {
                                                                                                            ((ComposeView) r8Var12.c).setFocusable(true);
                                                                                                            r8 r8Var13 = this.A0;
                                                                                                            if (r8Var13 != null) {
                                                                                                                ((ComposeView) r8Var13.c).setFocusableInTouchMode(true);
                                                                                                                tq5.w(hk2.y(this), null, null, new kr1(this, null, 5), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 1), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 3), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 5), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 7), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 9), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 11), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 13), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 15), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 17), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 19), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 21), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 23), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 25), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 27), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new hr1(this, null, 29), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new kr1(this, null, 1), 3);
                                                                                                                tq5.w(hk2.y(this), null, null, new kr1(this, null, 3), 3);
                                                                                                                return;
                                                                                                            }
                                                                                                            b53.g0("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        b53.g0("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    b53.g0("binding");
                                                                                                    throw null;
                                                                                                }
                                                                                                b53.g0("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            b53.g0("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        b53.g0("melonTouchHandler");
                                                                                        throw null;
                                                                                    }
                                                                                    b53.g0("binding");
                                                                                    throw null;
                                                                                }
                                                                                b53.g0("binding");
                                                                                throw null;
                                                                            }
                                                                            b53.g0("binding");
                                                                            throw null;
                                                                        }
                                                                        b53.g0("binding");
                                                                        throw null;
                                                                    }
                                                                    b53.g0("binding");
                                                                    throw null;
                                                                }
                                                                b53.g0("binding");
                                                                throw null;
                                                            }
                                                            b53.g0("binding");
                                                            throw null;
                                                        }
                                                        b53.g0("binding");
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return;
            }
            b53.g0("lifecycleOwnerProvider");
            throw null;
        }
        b53.g0("settingsRepository");
        throw null;
    }

    @Override // defpackage.rr2, defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        e0();
    }

    @Override // defpackage.ys0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        boolean z;
        bp5 bp5Var;
        rg5 rg5Var;
        Uri uri;
        intent.getClass();
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            z = extras.getBoolean("boot_firmware_only");
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            int i = extras.getInt("boot_firmware_console", -1);
            if (i != -1) {
                obj = new jc3((ConsoleType) ((f12) ConsoleType.getEntries()).get(i));
            }
        } else {
            if (extras != null) {
                bp5Var = (bp5) ((Parcelable) mh7.O(extras, "rom", bp5.class));
            } else {
                bp5Var = null;
            }
            if (bp5Var != null) {
                rg5Var = bp5Var.A;
            } else {
                rg5Var = null;
            }
            if (rg5Var != null) {
                obj = new kc3(bp5Var.A);
            } else if (intent.getData() != null) {
                Uri data = intent.getData();
                data.getClass();
                obj = new mc3(data);
            } else if (extras != null && extras.containsKey("PATH")) {
                String string = extras.getString("PATH");
                string.getClass();
                obj = new lc3(string);
            } else if (extras != null && extras.containsKey("uri")) {
                Object obj2 = extras.get("uri");
                if (obj2 instanceof String) {
                    uri = Uri.parse((String) obj2);
                } else if (obj2 instanceof Uri) {
                    uri = (Uri) obj2;
                } else {
                    uri = null;
                }
                if (uri != null) {
                    obj = new mc3(uri);
                }
            }
        }
        if (obj != null && ((wt1) U().q0.A.getValue()).a()) {
            U().O0(false);
            this.O1.l(ts1.SWITCH_NEW_ROM_DIALOG);
            sb sbVar = new sb(this);
            pb pbVar = (pb) sbVar.L;
            pbVar.d = getString(R.string.title_emulator_running);
            pbVar.f = getString(R.string.message_stop_emulation);
            sbVar.z(R.string.ok, new cq1(this, intent, obj, 0));
            sbVar.x(R.string.no, new hm0(1));
            pbVar.o = new xp1(this, 1);
            pbVar.n = new yp1(this, 1);
            sbVar.C();
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
        super.onPause();
        M();
        es4 es4Var = this.X0;
        if (es4Var != null) {
            Handler handler = this.K0;
            if (handler != null) {
                handler.removeCallbacks(es4Var);
            } else {
                b53.g0("handler");
                throw null;
            }
        }
        this.X0 = null;
        fr1 fr1Var = this.j1;
        if (fr1Var.B) {
            fr1Var.B = false;
            fr1Var.d();
        }
        getWindow().clearFlags(128);
        eo0 eo0Var = this.Q0;
        if (eo0Var != null) {
            eo0Var.a();
            if (!this.f1 && !isFinishing()) {
                U().O0(false);
                return;
            }
            return;
        }
        b53.g0("choreographerFrameRenderer");
        throw null;
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        eo0 eo0Var = this.Q0;
        if (eo0Var != null) {
            eo0Var.b();
            es4 es4Var = this.X0;
            if (es4Var != null) {
                Handler handler = this.K0;
                if (handler != null) {
                    handler.removeCallbacks(es4Var);
                } else {
                    b53.g0("handler");
                    throw null;
                }
            }
            es4 es4Var2 = new es4(7, this);
            this.X0 = es4Var2;
            Handler handler2 = this.K0;
            if (handler2 != null) {
                handler2.postDelayed(es4Var2, 1500L);
                if (!this.O1.G()) {
                    hv1 U = U();
                    if (U.j0.get() == 0 && b53.x(((ee6) U.h0.R).getValue(), k35.a) && !((AtomicBoolean) U.V.A).get()) {
                        getWindow().addFlags(128);
                        U().V0();
                        return;
                    }
                    return;
                }
                return;
            }
            b53.g0("handler");
            throw null;
        }
        b53.g0("choreographerFrameRenderer");
        throw null;
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        Object value;
        ArrayList arrayList;
        super.onStart();
        if (this.f1) {
            return;
        }
        N0();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.L0, null);
        }
        InputManager inputManager = (InputManager) getSystemService(InputManager.class);
        ow0 ow0Var = this.M0;
        if (inputManager != null) {
            inputManager.registerInputDeviceListener(ow0Var, null);
        }
        g11 g11Var = ow0Var.a;
        if (g11Var != null) {
            iq2.f(g11Var, null);
        }
        bb1 bb1Var = tg1.a;
        g11 c = iq2.c(bt3.a.Y);
        tq5.w(c, null, null, new a6(ow0Var, null, 11), 3);
        ow0Var.a = c;
        ee6 ee6Var = ow0Var.c;
        do {
            value = ee6Var.getValue();
            List list = (List) value;
            arrayList = new ArrayList();
            int[] deviceIds = InputDevice.getDeviceIds();
            deviceIds.getClass();
            for (int i : deviceIds) {
                InputDevice device = InputDevice.getDevice(i);
                if (device != null && ow0.a(device)) {
                    arrayList.add(device);
                }
            }
        } while (!ee6Var.j(value, arrayList));
        oh2 oh2Var = this.P0;
        if (oh2Var != null) {
            r8 r8Var = this.A0;
            if (r8Var != null) {
                oh2Var.e((EmulatorSurfaceView) r8Var.g);
                return;
            } else {
                b53.g0("binding");
                throw null;
            }
        }
        b53.g0("frameRenderCoordinator");
        throw null;
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        super.onStop();
        M();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.L0);
        }
        InputManager inputManager = (InputManager) getSystemService(InputManager.class);
        ow0 ow0Var = this.M0;
        if (inputManager != null) {
            inputManager.unregisterInputDeviceListener(ow0Var);
        }
        g11 g11Var = ow0Var.a;
        if (g11Var != null) {
            iq2.f(g11Var, null);
        }
        ee6 ee6Var = ow0Var.c;
        ee6Var.getClass();
        ee6Var.l(null, pp1.A);
        if (!this.g1) {
            oh2 oh2Var = this.P0;
            if (oh2Var != null) {
                r8 r8Var = this.A0;
                if (r8Var != null) {
                    oh2Var.b((EmulatorSurfaceView) r8Var.g);
                    return;
                } else {
                    b53.g0("binding");
                    throw null;
                }
            }
            b53.g0("frameRenderCoordinator");
            throw null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        bg7 wf7Var;
        super.onWindowFocusChanged(z);
        Window window = getWindow();
        window.getClass();
        dz4 dz4Var = new dz4(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            wf7Var = new zf7(window, dz4Var);
        } else if (i >= 30) {
            wf7Var = new zf7(window, dz4Var);
        } else if (i >= 26) {
            wf7Var = new wf7(window, dz4Var);
        } else {
            wf7Var = new wf7(window, dz4Var);
        }
        wf7Var.b(2);
        wf7Var.f();
    }

    public final void p0() {
        G0("BG layers and priorities", l07.c0(new ja5("Engine A (Main) BG layers", new bq1(this, 10)), new ja5("Engine B (Sub) BG layers", new bq1(this, 11)), new ja5("Engine A (Main) BG priorities", new bq1(this, 12)), new ja5("Engine B (Sub) BG priorities", new bq1(this, 13))), new bq1(this, 14));
    }

    public final void q0(boolean z) {
        String str;
        boolean z2;
        v95 b0 = b0();
        ti4 P = P();
        LinearLayout linearLayout = (LinearLayout) P.A;
        ScrollView scrollView = (ScrollView) P.B;
        if (z) {
            str = "Engine A (Main) BG layers";
        } else {
            str = "Engine B (Sub) BG layers";
        }
        G(linearLayout, str);
        D(linearLayout, "Disables individual BG0-BG3 draw gates before `DrawBG_*` or `DrawBG_3D`; this is independent from the game's DISPCNT enable bits.");
        jq1 jq1Var = new jq1(z, b0, 0);
        gq1 gq1Var = new gq1(z, b0, this, 1);
        H(linearLayout, str);
        for (t95 t95Var : rr1.b) {
            String str2 = t95Var.b;
            String str3 = t95Var.c;
            if ((((Number) jq1Var.c()).intValue() & (1 << t95Var.a)) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            I(linearLayout, str2, str3, z2, new cz(t95Var, jq1Var, gq1Var, 10));
        }
        I0(str, scrollView, new iq1(this, 6));
    }

    public final void r0(boolean z) {
        String str;
        v95 b0 = b0();
        ti4 P = P();
        LinearLayout linearLayout = (LinearLayout) P.A;
        ScrollView scrollView = (ScrollView) P.B;
        if (z) {
            str = "Engine A (Main) BG priorities";
        } else {
            str = "Engine B (Sub) BG priorities";
        }
        String str2 = str;
        G(linearLayout, str2);
        D(linearLayout, "Disables BG layers by Nintendo DS BGCNT priority bits 0-1. Priority 0 is closest to the viewer; priority 3 is furthest back.");
        F(linearLayout, str2, new jq1(z, b0, 1), new gq1(z, b0, this, 3), "BGCNT priority", "Code gate: `bgCnt[n] & 0x3` inside `DrawScanlineBGMode`.");
        I0(str2, scrollView, new iq1(this, 23));
    }

    public final void s0() {
        G0("Packed compMode override", l07.c0(new ja5("Top screen compMode", new bq1(this, 7)), new ja5("Bottom screen compMode", new bq1(this, 8))), new bq1(this, 9));
    }

    public final void t0(boolean z) {
        String str;
        int i;
        Object obj;
        int intValue;
        v95 b0 = b0();
        ti4 P = P();
        LinearLayout linearLayout = (LinearLayout) P.A;
        ScrollView scrollView = (ScrollView) P.B;
        if (z) {
            str = "Top screen compMode";
        } else {
            str = "Bottom screen compMode";
        }
        G(linearLayout, str);
        D(linearLayout, "Forces the compositor mode stored in the packed control plane. Native keeps the value produced by `DrawScanline_BGOBJ`; the override is applied independently to top and bottom snapshots before Vulkan consumes them.");
        if (z) {
            i = b0.c;
        } else {
            i = b0.d;
        }
        gq1 gq1Var = new gq1(z, b0, this, 0);
        H(linearLayout, str);
        List list = rr1.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RadioGroup radioGroup = new RadioGroup(this);
        radioGroup.setOrientation(1);
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            u95 u95Var = (u95) it.next();
            RadioButton radioButton = new RadioButton(this);
            radioButton.setId(View.generateViewId());
            radioButton.setText(u95Var.b);
            radioButton.setTextSize(2, 14.0f);
            radioButton.setSingleLine(false);
            radioButton.setEllipsize(null);
            radioButton.setMaxLines(4);
            linkedHashMap.put(Integer.valueOf(radioButton.getId()), Integer.valueOf(u95Var.a));
            radioGroup.addView(radioButton, new RadioGroup.LayoutParams(-1, -2));
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Number) ((Map.Entry) next).getValue()).intValue() == i) {
                obj = next;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            intValue = ((Number) entry.getKey()).intValue();
        } else {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((Number) entry2.getValue()).intValue() == -1) {
                    intValue = ((Number) entry2.getKey()).intValue();
                }
            }
            vd6.e("Collection contains no element matching the predicate.");
            return;
        }
        radioGroup.check(intValue);
        radioGroup.setOnCheckedChangeListener(new mq1(linkedHashMap, gq1Var, 1));
        linearLayout.addView(radioGroup);
        I0(str, scrollView, new bq1(this, 27));
    }

    public final void u0() {
        if (!W()) {
            return;
        }
        String string = getString(R.string.renderer_2d_debug_controls);
        string.getClass();
        ip3 C = l07.C();
        C.add(new ja5("Background mode override", new nq1(this, 5)));
        C.add(new ja5("Packed compMode override", new nq1(this, 6)));
        C.add(new ja5("BG layers and priorities", new nq1(this, 7)));
        C.add(new ja5("Background type enables", new nq1(this, 8)));
        C.add(new ja5("OBJ / Sprites layers", new nq1(this, 9)));
        String string2 = getString(R.string.renderer_2d_debug_controls_reset);
        string2.getClass();
        C.add(new ja5(string2, new nq1(this, 10)));
        G0(string, l07.t(C), new nq1(this, 11));
    }

    public final void v0(boolean z) {
        String str;
        int i;
        Object obj;
        int intValue;
        v95 b0 = b0();
        ti4 P = P();
        LinearLayout linearLayout = (LinearLayout) P.A;
        ScrollView scrollView = (ScrollView) P.B;
        if (z) {
            str = "Engine A (Main) BG mode";
        } else {
            str = "Engine B (Sub) BG mode";
        }
        G(linearLayout, str);
        D(linearLayout, "Forces the Nintendo DS BG mode used by `DrawScanline_BGOBJ`. Native keeps `CurUnit->DispCnt & 0x7`.");
        if (z) {
            i = b0.a;
        } else {
            i = b0.b;
        }
        gq1 gq1Var = new gq1(z, b0, this, 2);
        H(linearLayout, str);
        List list = rr1.a;
        ip3 C = l07.C();
        C.add(new w95(-1, "Native DISPCNT mode - use CurUnit->DispCnt & 0x7"));
        C.add(new w95(0, "Mode 0 - 4 Static layers. Code: DrawScanlineBGMode<0>(); BG0-BG3 use DrawBG_Text."));
        C.add(new w95(1, "Mode 1 - 3 Static layers + 1 Affine layer. Code: BG0-BG2 DrawBG_Text, BG3 DrawBG_Affine."));
        C.add(new w95(2, "Mode 2 - 2 Static layers + 2 Affine layers. Code: BG0/BG1 DrawBG_Text, BG2/BG3 DrawBG_Affine."));
        C.add(new w95(3, "Mode 3 - 3 Static layers + 1 Affine Extended layer. Code: BG3 DrawBG_Extended."));
        C.add(new w95(4, "Mode 4 - 2 Static layers + 1 Affine layer + 1 Affine Extended layer. Code: BG2 DrawBG_Affine, BG3 DrawBG_Extended."));
        C.add(new w95(5, "Mode 5 - 2 Static layers + 2 Affine Extended layers. Code: BG2/BG3 DrawBG_Extended."));
        if (z) {
            C.add(new w95(6, "Mode 6 - 1 3D background layer + 1 Large screen. Code: BG0 DrawBG_3D, BG2 DrawBG_Large. Main only."));
        }
        ip3 t = l07.t(C);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RadioGroup radioGroup = new RadioGroup(this);
        radioGroup.setOrientation(1);
        ListIterator listIterator = t.listIterator(0);
        while (true) {
            wr2 wr2Var = (wr2) listIterator;
            obj = null;
            if (!wr2Var.hasNext()) {
                break;
            }
            w95 w95Var = (w95) wr2Var.next();
            RadioButton radioButton = new RadioButton(this);
            radioButton.setId(View.generateViewId());
            radioButton.setText(w95Var.b);
            radioButton.setTextSize(2, 14.0f);
            radioButton.setSingleLine(false);
            radioButton.setEllipsize(null);
            radioButton.setMaxLines(4);
            linkedHashMap.put(Integer.valueOf(radioButton.getId()), Integer.valueOf(w95Var.a));
            radioGroup.addView(radioButton, new RadioGroup.LayoutParams(-1, -2));
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) ((Map.Entry) next).getValue()).intValue() == i) {
                obj = next;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            intValue = ((Number) entry.getKey()).intValue();
        } else {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (((Number) entry2.getValue()).intValue() == -1) {
                    intValue = ((Number) entry2.getKey()).intValue();
                }
            }
            vd6.e("Collection contains no element matching the predicate.");
            return;
        }
        radioGroup.check(intValue);
        radioGroup.setOnCheckedChangeListener(new mq1(linkedHashMap, gq1Var, 0));
        linearLayout.addView(radioGroup);
        I0(str, scrollView, new iq1(this, 8));
    }

    public final void w0() {
        G0("Background mode override", l07.c0(new ja5("Engine A (Main) BG mode", new bq1(this, 19)), new ja5("Engine B (Sub) BG mode", new bq1(this, 20))), new bq1(this, 21));
    }

    public final void x0() {
        G0("OBJ / Sprites", l07.c0(new ja5("OBJ master", new bq1(this, 0)), new ja5("OBJ priority enables", new bq1(this, 1)), new ja5("OBJ OAM order / Z buckets", new bq1(this, 2)), new ja5("OBJ vertical bands", new bq1(this, 3)), new ja5("OBJ transform and storage type", new bq1(this, 4)), new ja5("OBJ effects and masks", new bq1(this, 5))), new bq1(this, 6));
    }

    public final void y0() {
        G0("OBJ OAM order / Z buckets", l07.c0(new ja5("Engine A (Main) OBJ OAM order", new iq1(this, 9)), new ja5("Engine B (Sub) OBJ OAM order", new iq1(this, 10))), new iq1(this, 11));
    }

    public final void z0(boolean z) {
        String str;
        v95 b0 = b0();
        ti4 P = P();
        LinearLayout linearLayout = (LinearLayout) P.A;
        ScrollView scrollView = (ScrollView) P.B;
        if (z) {
            str = "Engine A (Main) OBJ OAM order";
        } else {
            str = "Engine B (Sub) OBJ OAM order";
        }
        G(linearLayout, "OBJ OAM order / Z buckets");
        D(linearLayout, "Filters sprites by OAM index order. For equal OBJ priority, lower OAM indices are drawn later by `DrawSprites` and appear closer to the viewer; this gives practical Z-position control for composite sprites.");
        jq1 jq1Var = new jq1(z, b0, 3);
        gq1 gq1Var = new gq1(z, b0, this, 5);
        H(linearLayout, str);
        for (x95 x95Var : rr1.d) {
            String str2 = x95Var.b;
            String str3 = x95Var.c;
            boolean z2 = true;
            if ((((Number) jq1Var.c()).intValue() & (1 << x95Var.a)) != 0) {
                z2 = false;
            }
            I(linearLayout, str2, str3, z2, new cz(x95Var, jq1Var, gq1Var, 11));
        }
        I0(str, scrollView, new nq1(this, 3));
    }
}
