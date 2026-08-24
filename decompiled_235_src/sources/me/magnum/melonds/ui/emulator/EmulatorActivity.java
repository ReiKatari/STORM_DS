package me.magnum.melonds.ui.emulator;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.Display;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
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
import me.magnum.melonds.translator.capture.ScreenCaptureService;
import me.magnum.melonds.translator.ui.GameTranslationOverlayView;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class EmulatorActivity extends sx2 {
    public static final /* synthetic */ int Z1 = 0;
    public ac A1;
    public s8 B0;
    public final wp5 B1;
    public final go3 C0;
    public final vs4 C1;
    public x86 D0;
    public final vs4 D1;
    public pi1 E0;
    public final vs4 E1;
    public uv4 F0;
    public final vs4 F1;
    public iu3 G0;
    public final vs4 G1;
    public at H0;
    public final vs4 H1;
    public kd6 I0;
    public final vs4 I1;
    public e70 J0;
    public final vs4 J1;
    public c92 K0;
    public final vs4 K1;
    public Rect L0;
    public final vs4 L1;
    public Rect M0;
    public final vs4 M1;
    public Handler N0;
    public final vs4 N1;
    public final zk1 O0;
    public final vs4 O1;
    public final lz0 P0;
    public final mm6 P1;
    public s9 Q0;
    public ah2 Q1;
    public bt R0;
    public float R1;
    public om2 S0;
    public float S1;
    public oq0 T0;
    public mu4 T1;
    public c91 U0;
    public boolean U1;
    public q33 V0;
    public final bt V1;
    public e73 W0;
    public float W1;
    public b36 X0;
    public float X1;
    public String Y0;
    public boolean Y1;
    public String Z0;
    public g15 a1;
    public ae6 b1;
    public ce6 c1;
    public t26 d1;
    public a e1;
    public b f1;
    public int g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public u82 l1;
    public final rv1 m1;
    public final ex6 n1;
    public final ex6 o1;
    public final i9 p1;
    public final i9 q1;
    public final i9 r1;
    public final i9 s1;
    public final i9 t1;
    public final i9 u1;
    public final d00 v1;
    public ac w1;
    public ac x1;
    public ac y1;
    public ac z1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a OPEN_GL = new a("OPEN_GL", 0);
        public static final a VULKAN = new a("VULKAN", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{OPEN_GL, VULKAN};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private a(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [wf5, wp5] */
    public EmulatorActivity() {
        super(0);
        wu1 wu1Var = new wu1(this, 10);
        this.C0 = new uo7(gh5.a(sz1.class), new cw1(this, 1), new cw1(this, 0), new a10(wu1Var, this));
        this.O0 = new zk1(this, 1);
        this.P0 = new lz0();
        this.d1 = t26.c;
        this.e1 = a.OPEN_GL;
        this.h1 = true;
        this.l1 = u82.MELON_DUAL_DS;
        this.m1 = new rv1(this);
        this.n1 = new ex6(new bv1(this, 10));
        this.o1 = new ex6(new bv1(this, 18));
        this.p1 = (i9) s(new c9(5), new a9(this) { // from class: iu1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                dy1 dy1Var;
                pq5 pq5Var;
                lx5 lx5Var;
                Intent intent;
                dy1 dy1Var2;
                pq5 pq5Var2;
                String stringExtra;
                int i = r2;
                boolean z = true;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        int i2 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W = emulatorActivity.W();
                        Object value = W.p0.getValue();
                        if (value instanceof dy1) {
                            dy1Var = (dy1) value;
                        } else {
                            dy1Var = null;
                        }
                        if (dy1Var != null && (pq5Var = dy1Var.a) != null) {
                            pw5 b = W.p.b(pq5Var.d);
                            if (b != null) {
                                lx5Var = b.a(pq5Var);
                            } else {
                                lx5Var = null;
                            }
                            if (lx5Var != null) {
                                hv.L(W.z, null, null, new xd1(W, lx5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.W().T0();
                        return;
                    case 1:
                        Map map = (Map) obj;
                        int i3 = EmulatorActivity.Z1;
                        map.getClass();
                        hv.L(bl2.C(emulatorActivity), null, null, new zv1(map, emulatorActivity, null), 3);
                        return;
                    case 2:
                        z8 z8Var = (z8) obj;
                        int i4 = EmulatorActivity.Z1;
                        z8Var.getClass();
                        hq2 V = emulatorActivity.V();
                        int i5 = z8Var.A;
                        Intent intent2 = z8Var.B;
                        ci ciVar = V.i;
                        ciVar.getClass();
                        if (i5 == -1 && intent2 != null) {
                            ciVar.B = true;
                            boolean z2 = ScreenCaptureService.A;
                            Activity activity = (Activity) ciVar.L;
                            ScreenCaptureService.B = i5;
                            ScreenCaptureService.L = intent2;
                            Intent intent3 = new Intent(activity, ScreenCaptureService.class);
                            intent3.setAction("me.magnum.melonds.translator.START_CAPTURE");
                            intent3.putExtra("extra_result_code", i5);
                            intent3.putExtra("extra_data_intent", intent2);
                            if (Build.VERSION.SDK_INT >= 26) {
                                activity.startForegroundService(intent3);
                            } else {
                                activity.startService(intent3);
                            }
                        } else {
                            ciVar.B = false;
                        }
                        if (i5 == -1 && intent2 != null && V.o) {
                            V.o = false;
                            hv.L(V.j, null, null, new eq2(V, null, 0), 3);
                            return;
                        }
                        return;
                    case 3:
                        z8 z8Var2 = (z8) obj;
                        int i6 = EmulatorActivity.Z1;
                        z8Var2.getClass();
                        if (z8Var2.A == -1 && (intent = z8Var2.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            sz1 W2 = emulatorActivity.W();
                            W2.j0.incrementAndGet();
                            hv.L(W2.z, null, a71.UNDISPATCHED, new o22(W2, null), 1);
                        } else {
                            if (emulatorActivity.F1.getValue() == null && !emulatorActivity.V1.M()) {
                                z = false;
                            }
                            emulatorActivity.W().L0(!z);
                            if (z) {
                                emulatorActivity.j0(0);
                            }
                        }
                        emulatorActivity.r0();
                        emulatorActivity.p0();
                        emulatorActivity.q0();
                        kd6 kd6Var = emulatorActivity.I0;
                        if (kd6Var != null) {
                            emulatorActivity.l1 = ((ng6) kd6Var).m();
                            emulatorActivity.R0();
                            return;
                        }
                        nb3.a0("settingsRepository");
                        throw null;
                    case 4:
                        int i7 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W3 = emulatorActivity.W();
                        Object value2 = W3.p0.getValue();
                        if (value2 instanceof dy1) {
                            dy1Var2 = (dy1) value2;
                        } else {
                            dy1Var2 = null;
                        }
                        if (dy1Var2 != null && (pq5Var2 = dy1Var2.a) != null) {
                            hv.L(W3.z, null, null, new f02(W3, pq5Var2, null, 2), 3);
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                    default:
                        z8 z8Var3 = (z8) obj;
                        int i8 = EmulatorActivity.Z1;
                        z8Var3.getClass();
                        if (z8Var3.A == -1) {
                            Intent intent4 = z8Var3.B;
                            if (intent4 != null && (stringExtra = intent4.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            sz1 W4 = emulatorActivity.W();
                            W4.getClass();
                            W4.j1(new k0(uuid, 26));
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                }
            }
        });
        this.q1 = (i9) s(new c9(5), new a9(this) { // from class: iu1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                dy1 dy1Var;
                pq5 pq5Var;
                lx5 lx5Var;
                Intent intent;
                dy1 dy1Var2;
                pq5 pq5Var2;
                String stringExtra;
                int i = r2;
                boolean z = true;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        int i2 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W = emulatorActivity.W();
                        Object value = W.p0.getValue();
                        if (value instanceof dy1) {
                            dy1Var = (dy1) value;
                        } else {
                            dy1Var = null;
                        }
                        if (dy1Var != null && (pq5Var = dy1Var.a) != null) {
                            pw5 b = W.p.b(pq5Var.d);
                            if (b != null) {
                                lx5Var = b.a(pq5Var);
                            } else {
                                lx5Var = null;
                            }
                            if (lx5Var != null) {
                                hv.L(W.z, null, null, new xd1(W, lx5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.W().T0();
                        return;
                    case 1:
                        Map map = (Map) obj;
                        int i3 = EmulatorActivity.Z1;
                        map.getClass();
                        hv.L(bl2.C(emulatorActivity), null, null, new zv1(map, emulatorActivity, null), 3);
                        return;
                    case 2:
                        z8 z8Var = (z8) obj;
                        int i4 = EmulatorActivity.Z1;
                        z8Var.getClass();
                        hq2 V = emulatorActivity.V();
                        int i5 = z8Var.A;
                        Intent intent2 = z8Var.B;
                        ci ciVar = V.i;
                        ciVar.getClass();
                        if (i5 == -1 && intent2 != null) {
                            ciVar.B = true;
                            boolean z2 = ScreenCaptureService.A;
                            Activity activity = (Activity) ciVar.L;
                            ScreenCaptureService.B = i5;
                            ScreenCaptureService.L = intent2;
                            Intent intent3 = new Intent(activity, ScreenCaptureService.class);
                            intent3.setAction("me.magnum.melonds.translator.START_CAPTURE");
                            intent3.putExtra("extra_result_code", i5);
                            intent3.putExtra("extra_data_intent", intent2);
                            if (Build.VERSION.SDK_INT >= 26) {
                                activity.startForegroundService(intent3);
                            } else {
                                activity.startService(intent3);
                            }
                        } else {
                            ciVar.B = false;
                        }
                        if (i5 == -1 && intent2 != null && V.o) {
                            V.o = false;
                            hv.L(V.j, null, null, new eq2(V, null, 0), 3);
                            return;
                        }
                        return;
                    case 3:
                        z8 z8Var2 = (z8) obj;
                        int i6 = EmulatorActivity.Z1;
                        z8Var2.getClass();
                        if (z8Var2.A == -1 && (intent = z8Var2.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            sz1 W2 = emulatorActivity.W();
                            W2.j0.incrementAndGet();
                            hv.L(W2.z, null, a71.UNDISPATCHED, new o22(W2, null), 1);
                        } else {
                            if (emulatorActivity.F1.getValue() == null && !emulatorActivity.V1.M()) {
                                z = false;
                            }
                            emulatorActivity.W().L0(!z);
                            if (z) {
                                emulatorActivity.j0(0);
                            }
                        }
                        emulatorActivity.r0();
                        emulatorActivity.p0();
                        emulatorActivity.q0();
                        kd6 kd6Var = emulatorActivity.I0;
                        if (kd6Var != null) {
                            emulatorActivity.l1 = ((ng6) kd6Var).m();
                            emulatorActivity.R0();
                            return;
                        }
                        nb3.a0("settingsRepository");
                        throw null;
                    case 4:
                        int i7 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W3 = emulatorActivity.W();
                        Object value2 = W3.p0.getValue();
                        if (value2 instanceof dy1) {
                            dy1Var2 = (dy1) value2;
                        } else {
                            dy1Var2 = null;
                        }
                        if (dy1Var2 != null && (pq5Var2 = dy1Var2.a) != null) {
                            hv.L(W3.z, null, null, new f02(W3, pq5Var2, null, 2), 3);
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                    default:
                        z8 z8Var3 = (z8) obj;
                        int i8 = EmulatorActivity.Z1;
                        z8Var3.getClass();
                        if (z8Var3.A == -1) {
                            Intent intent4 = z8Var3.B;
                            if (intent4 != null && (stringExtra = intent4.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            sz1 W4 = emulatorActivity.W();
                            W4.getClass();
                            W4.j1(new k0(uuid, 26));
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                }
            }
        });
        this.r1 = (i9) s(new c9(5), new a9(this) { // from class: iu1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                dy1 dy1Var;
                pq5 pq5Var;
                lx5 lx5Var;
                Intent intent;
                dy1 dy1Var2;
                pq5 pq5Var2;
                String stringExtra;
                int i = r2;
                boolean z = true;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        int i2 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W = emulatorActivity.W();
                        Object value = W.p0.getValue();
                        if (value instanceof dy1) {
                            dy1Var = (dy1) value;
                        } else {
                            dy1Var = null;
                        }
                        if (dy1Var != null && (pq5Var = dy1Var.a) != null) {
                            pw5 b = W.p.b(pq5Var.d);
                            if (b != null) {
                                lx5Var = b.a(pq5Var);
                            } else {
                                lx5Var = null;
                            }
                            if (lx5Var != null) {
                                hv.L(W.z, null, null, new xd1(W, lx5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.W().T0();
                        return;
                    case 1:
                        Map map = (Map) obj;
                        int i3 = EmulatorActivity.Z1;
                        map.getClass();
                        hv.L(bl2.C(emulatorActivity), null, null, new zv1(map, emulatorActivity, null), 3);
                        return;
                    case 2:
                        z8 z8Var = (z8) obj;
                        int i4 = EmulatorActivity.Z1;
                        z8Var.getClass();
                        hq2 V = emulatorActivity.V();
                        int i5 = z8Var.A;
                        Intent intent2 = z8Var.B;
                        ci ciVar = V.i;
                        ciVar.getClass();
                        if (i5 == -1 && intent2 != null) {
                            ciVar.B = true;
                            boolean z2 = ScreenCaptureService.A;
                            Activity activity = (Activity) ciVar.L;
                            ScreenCaptureService.B = i5;
                            ScreenCaptureService.L = intent2;
                            Intent intent3 = new Intent(activity, ScreenCaptureService.class);
                            intent3.setAction("me.magnum.melonds.translator.START_CAPTURE");
                            intent3.putExtra("extra_result_code", i5);
                            intent3.putExtra("extra_data_intent", intent2);
                            if (Build.VERSION.SDK_INT >= 26) {
                                activity.startForegroundService(intent3);
                            } else {
                                activity.startService(intent3);
                            }
                        } else {
                            ciVar.B = false;
                        }
                        if (i5 == -1 && intent2 != null && V.o) {
                            V.o = false;
                            hv.L(V.j, null, null, new eq2(V, null, 0), 3);
                            return;
                        }
                        return;
                    case 3:
                        z8 z8Var2 = (z8) obj;
                        int i6 = EmulatorActivity.Z1;
                        z8Var2.getClass();
                        if (z8Var2.A == -1 && (intent = z8Var2.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            sz1 W2 = emulatorActivity.W();
                            W2.j0.incrementAndGet();
                            hv.L(W2.z, null, a71.UNDISPATCHED, new o22(W2, null), 1);
                        } else {
                            if (emulatorActivity.F1.getValue() == null && !emulatorActivity.V1.M()) {
                                z = false;
                            }
                            emulatorActivity.W().L0(!z);
                            if (z) {
                                emulatorActivity.j0(0);
                            }
                        }
                        emulatorActivity.r0();
                        emulatorActivity.p0();
                        emulatorActivity.q0();
                        kd6 kd6Var = emulatorActivity.I0;
                        if (kd6Var != null) {
                            emulatorActivity.l1 = ((ng6) kd6Var).m();
                            emulatorActivity.R0();
                            return;
                        }
                        nb3.a0("settingsRepository");
                        throw null;
                    case 4:
                        int i7 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W3 = emulatorActivity.W();
                        Object value2 = W3.p0.getValue();
                        if (value2 instanceof dy1) {
                            dy1Var2 = (dy1) value2;
                        } else {
                            dy1Var2 = null;
                        }
                        if (dy1Var2 != null && (pq5Var2 = dy1Var2.a) != null) {
                            hv.L(W3.z, null, null, new f02(W3, pq5Var2, null, 2), 3);
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                    default:
                        z8 z8Var3 = (z8) obj;
                        int i8 = EmulatorActivity.Z1;
                        z8Var3.getClass();
                        if (z8Var3.A == -1) {
                            Intent intent4 = z8Var3.B;
                            if (intent4 != null && (stringExtra = intent4.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            sz1 W4 = emulatorActivity.W();
                            W4.getClass();
                            W4.j1(new k0(uuid, 26));
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                }
            }
        });
        this.s1 = (i9) s(new c9(5), new a9(this) { // from class: iu1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                dy1 dy1Var;
                pq5 pq5Var;
                lx5 lx5Var;
                Intent intent;
                dy1 dy1Var2;
                pq5 pq5Var2;
                String stringExtra;
                int i = r2;
                boolean z = true;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        int i2 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W = emulatorActivity.W();
                        Object value = W.p0.getValue();
                        if (value instanceof dy1) {
                            dy1Var = (dy1) value;
                        } else {
                            dy1Var = null;
                        }
                        if (dy1Var != null && (pq5Var = dy1Var.a) != null) {
                            pw5 b = W.p.b(pq5Var.d);
                            if (b != null) {
                                lx5Var = b.a(pq5Var);
                            } else {
                                lx5Var = null;
                            }
                            if (lx5Var != null) {
                                hv.L(W.z, null, null, new xd1(W, lx5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.W().T0();
                        return;
                    case 1:
                        Map map = (Map) obj;
                        int i3 = EmulatorActivity.Z1;
                        map.getClass();
                        hv.L(bl2.C(emulatorActivity), null, null, new zv1(map, emulatorActivity, null), 3);
                        return;
                    case 2:
                        z8 z8Var = (z8) obj;
                        int i4 = EmulatorActivity.Z1;
                        z8Var.getClass();
                        hq2 V = emulatorActivity.V();
                        int i5 = z8Var.A;
                        Intent intent2 = z8Var.B;
                        ci ciVar = V.i;
                        ciVar.getClass();
                        if (i5 == -1 && intent2 != null) {
                            ciVar.B = true;
                            boolean z2 = ScreenCaptureService.A;
                            Activity activity = (Activity) ciVar.L;
                            ScreenCaptureService.B = i5;
                            ScreenCaptureService.L = intent2;
                            Intent intent3 = new Intent(activity, ScreenCaptureService.class);
                            intent3.setAction("me.magnum.melonds.translator.START_CAPTURE");
                            intent3.putExtra("extra_result_code", i5);
                            intent3.putExtra("extra_data_intent", intent2);
                            if (Build.VERSION.SDK_INT >= 26) {
                                activity.startForegroundService(intent3);
                            } else {
                                activity.startService(intent3);
                            }
                        } else {
                            ciVar.B = false;
                        }
                        if (i5 == -1 && intent2 != null && V.o) {
                            V.o = false;
                            hv.L(V.j, null, null, new eq2(V, null, 0), 3);
                            return;
                        }
                        return;
                    case 3:
                        z8 z8Var2 = (z8) obj;
                        int i6 = EmulatorActivity.Z1;
                        z8Var2.getClass();
                        if (z8Var2.A == -1 && (intent = z8Var2.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            sz1 W2 = emulatorActivity.W();
                            W2.j0.incrementAndGet();
                            hv.L(W2.z, null, a71.UNDISPATCHED, new o22(W2, null), 1);
                        } else {
                            if (emulatorActivity.F1.getValue() == null && !emulatorActivity.V1.M()) {
                                z = false;
                            }
                            emulatorActivity.W().L0(!z);
                            if (z) {
                                emulatorActivity.j0(0);
                            }
                        }
                        emulatorActivity.r0();
                        emulatorActivity.p0();
                        emulatorActivity.q0();
                        kd6 kd6Var = emulatorActivity.I0;
                        if (kd6Var != null) {
                            emulatorActivity.l1 = ((ng6) kd6Var).m();
                            emulatorActivity.R0();
                            return;
                        }
                        nb3.a0("settingsRepository");
                        throw null;
                    case 4:
                        int i7 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W3 = emulatorActivity.W();
                        Object value2 = W3.p0.getValue();
                        if (value2 instanceof dy1) {
                            dy1Var2 = (dy1) value2;
                        } else {
                            dy1Var2 = null;
                        }
                        if (dy1Var2 != null && (pq5Var2 = dy1Var2.a) != null) {
                            hv.L(W3.z, null, null, new f02(W3, pq5Var2, null, 2), 3);
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                    default:
                        z8 z8Var3 = (z8) obj;
                        int i8 = EmulatorActivity.Z1;
                        z8Var3.getClass();
                        if (z8Var3.A == -1) {
                            Intent intent4 = z8Var3.B;
                            if (intent4 != null && (stringExtra = intent4.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            sz1 W4 = emulatorActivity.W();
                            W4.getClass();
                            W4.j1(new k0(uuid, 26));
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                }
            }
        });
        this.t1 = (i9) s(new c9(5), new a9(this) { // from class: iu1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                dy1 dy1Var;
                pq5 pq5Var;
                lx5 lx5Var;
                Intent intent;
                dy1 dy1Var2;
                pq5 pq5Var2;
                String stringExtra;
                int i = r2;
                boolean z = true;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        int i2 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W = emulatorActivity.W();
                        Object value = W.p0.getValue();
                        if (value instanceof dy1) {
                            dy1Var = (dy1) value;
                        } else {
                            dy1Var = null;
                        }
                        if (dy1Var != null && (pq5Var = dy1Var.a) != null) {
                            pw5 b = W.p.b(pq5Var.d);
                            if (b != null) {
                                lx5Var = b.a(pq5Var);
                            } else {
                                lx5Var = null;
                            }
                            if (lx5Var != null) {
                                hv.L(W.z, null, null, new xd1(W, lx5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.W().T0();
                        return;
                    case 1:
                        Map map = (Map) obj;
                        int i3 = EmulatorActivity.Z1;
                        map.getClass();
                        hv.L(bl2.C(emulatorActivity), null, null, new zv1(map, emulatorActivity, null), 3);
                        return;
                    case 2:
                        z8 z8Var = (z8) obj;
                        int i4 = EmulatorActivity.Z1;
                        z8Var.getClass();
                        hq2 V = emulatorActivity.V();
                        int i5 = z8Var.A;
                        Intent intent2 = z8Var.B;
                        ci ciVar = V.i;
                        ciVar.getClass();
                        if (i5 == -1 && intent2 != null) {
                            ciVar.B = true;
                            boolean z2 = ScreenCaptureService.A;
                            Activity activity = (Activity) ciVar.L;
                            ScreenCaptureService.B = i5;
                            ScreenCaptureService.L = intent2;
                            Intent intent3 = new Intent(activity, ScreenCaptureService.class);
                            intent3.setAction("me.magnum.melonds.translator.START_CAPTURE");
                            intent3.putExtra("extra_result_code", i5);
                            intent3.putExtra("extra_data_intent", intent2);
                            if (Build.VERSION.SDK_INT >= 26) {
                                activity.startForegroundService(intent3);
                            } else {
                                activity.startService(intent3);
                            }
                        } else {
                            ciVar.B = false;
                        }
                        if (i5 == -1 && intent2 != null && V.o) {
                            V.o = false;
                            hv.L(V.j, null, null, new eq2(V, null, 0), 3);
                            return;
                        }
                        return;
                    case 3:
                        z8 z8Var2 = (z8) obj;
                        int i6 = EmulatorActivity.Z1;
                        z8Var2.getClass();
                        if (z8Var2.A == -1 && (intent = z8Var2.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            sz1 W2 = emulatorActivity.W();
                            W2.j0.incrementAndGet();
                            hv.L(W2.z, null, a71.UNDISPATCHED, new o22(W2, null), 1);
                        } else {
                            if (emulatorActivity.F1.getValue() == null && !emulatorActivity.V1.M()) {
                                z = false;
                            }
                            emulatorActivity.W().L0(!z);
                            if (z) {
                                emulatorActivity.j0(0);
                            }
                        }
                        emulatorActivity.r0();
                        emulatorActivity.p0();
                        emulatorActivity.q0();
                        kd6 kd6Var = emulatorActivity.I0;
                        if (kd6Var != null) {
                            emulatorActivity.l1 = ((ng6) kd6Var).m();
                            emulatorActivity.R0();
                            return;
                        }
                        nb3.a0("settingsRepository");
                        throw null;
                    case 4:
                        int i7 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W3 = emulatorActivity.W();
                        Object value2 = W3.p0.getValue();
                        if (value2 instanceof dy1) {
                            dy1Var2 = (dy1) value2;
                        } else {
                            dy1Var2 = null;
                        }
                        if (dy1Var2 != null && (pq5Var2 = dy1Var2.a) != null) {
                            hv.L(W3.z, null, null, new f02(W3, pq5Var2, null, 2), 3);
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                    default:
                        z8 z8Var3 = (z8) obj;
                        int i8 = EmulatorActivity.Z1;
                        z8Var3.getClass();
                        if (z8Var3.A == -1) {
                            Intent intent4 = z8Var3.B;
                            if (intent4 != null && (stringExtra = intent4.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            sz1 W4 = emulatorActivity.W();
                            W4.getClass();
                            W4.j1(new k0(uuid, 26));
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                }
            }
        });
        this.u1 = (i9) s(new c9(3), new a9(this) { // from class: iu1
            public final /* synthetic */ EmulatorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                dy1 dy1Var;
                pq5 pq5Var;
                lx5 lx5Var;
                Intent intent;
                dy1 dy1Var2;
                pq5 pq5Var2;
                String stringExtra;
                int i = r2;
                boolean z = true;
                UUID uuid = null;
                EmulatorActivity emulatorActivity = this.B;
                switch (i) {
                    case 0:
                        int i2 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W = emulatorActivity.W();
                        Object value = W.p0.getValue();
                        if (value instanceof dy1) {
                            dy1Var = (dy1) value;
                        } else {
                            dy1Var = null;
                        }
                        if (dy1Var != null && (pq5Var = dy1Var.a) != null) {
                            pw5 b = W.p.b(pq5Var.d);
                            if (b != null) {
                                lx5Var = b.a(pq5Var);
                            } else {
                                lx5Var = null;
                            }
                            if (lx5Var != null) {
                                hv.L(W.z, null, null, new xd1(W, lx5Var, null, 12), 3);
                            }
                        }
                        emulatorActivity.W().T0();
                        return;
                    case 1:
                        Map map = (Map) obj;
                        int i3 = EmulatorActivity.Z1;
                        map.getClass();
                        hv.L(bl2.C(emulatorActivity), null, null, new zv1(map, emulatorActivity, null), 3);
                        return;
                    case 2:
                        z8 z8Var = (z8) obj;
                        int i4 = EmulatorActivity.Z1;
                        z8Var.getClass();
                        hq2 V = emulatorActivity.V();
                        int i5 = z8Var.A;
                        Intent intent2 = z8Var.B;
                        ci ciVar = V.i;
                        ciVar.getClass();
                        if (i5 == -1 && intent2 != null) {
                            ciVar.B = true;
                            boolean z2 = ScreenCaptureService.A;
                            Activity activity = (Activity) ciVar.L;
                            ScreenCaptureService.B = i5;
                            ScreenCaptureService.L = intent2;
                            Intent intent3 = new Intent(activity, ScreenCaptureService.class);
                            intent3.setAction("me.magnum.melonds.translator.START_CAPTURE");
                            intent3.putExtra("extra_result_code", i5);
                            intent3.putExtra("extra_data_intent", intent2);
                            if (Build.VERSION.SDK_INT >= 26) {
                                activity.startForegroundService(intent3);
                            } else {
                                activity.startService(intent3);
                            }
                        } else {
                            ciVar.B = false;
                        }
                        if (i5 == -1 && intent2 != null && V.o) {
                            V.o = false;
                            hv.L(V.j, null, null, new eq2(V, null, 0), 3);
                            return;
                        }
                        return;
                    case 3:
                        z8 z8Var2 = (z8) obj;
                        int i6 = EmulatorActivity.Z1;
                        z8Var2.getClass();
                        if (z8Var2.A == -1 && (intent = z8Var2.B) != null && intent.getBooleanExtra("ra_logout_requested", false)) {
                            sz1 W2 = emulatorActivity.W();
                            W2.j0.incrementAndGet();
                            hv.L(W2.z, null, a71.UNDISPATCHED, new o22(W2, null), 1);
                        } else {
                            if (emulatorActivity.F1.getValue() == null && !emulatorActivity.V1.M()) {
                                z = false;
                            }
                            emulatorActivity.W().L0(!z);
                            if (z) {
                                emulatorActivity.j0(0);
                            }
                        }
                        emulatorActivity.r0();
                        emulatorActivity.p0();
                        emulatorActivity.q0();
                        kd6 kd6Var = emulatorActivity.I0;
                        if (kd6Var != null) {
                            emulatorActivity.l1 = ((ng6) kd6Var).m();
                            emulatorActivity.R0();
                            return;
                        }
                        nb3.a0("settingsRepository");
                        throw null;
                    case 4:
                        int i7 = EmulatorActivity.Z1;
                        ((z8) obj).getClass();
                        sz1 W3 = emulatorActivity.W();
                        Object value2 = W3.p0.getValue();
                        if (value2 instanceof dy1) {
                            dy1Var2 = (dy1) value2;
                        } else {
                            dy1Var2 = null;
                        }
                        if (dy1Var2 != null && (pq5Var2 = dy1Var2.a) != null) {
                            hv.L(W3.z, null, null, new f02(W3, pq5Var2, null, 2), 3);
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                    default:
                        z8 z8Var3 = (z8) obj;
                        int i8 = EmulatorActivity.Z1;
                        z8Var3.getClass();
                        if (z8Var3.A == -1) {
                            Intent intent4 = z8Var3.B;
                            if (intent4 != null && (stringExtra = intent4.getStringExtra("selected_layout_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            sz1 W4 = emulatorActivity.W();
                            W4.getClass();
                            W4.j1(new k0(uuid, 26));
                        }
                        if (!emulatorActivity.f0()) {
                            emulatorActivity.W().T0();
                            return;
                        } else {
                            emulatorActivity.j0(0);
                            return;
                        }
                }
            }
        });
        this.v1 = new d00(this, 1);
        new pu1(this, 0);
        this.B1 = new wf5();
        Boolean bool = Boolean.FALSE;
        this.C1 = np2.Y(bool);
        this.D1 = np2.Y(bool);
        this.E1 = np2.Y(bool);
        this.F1 = np2.Y(null);
        this.G1 = np2.Y(Boolean.TRUE);
        this.H1 = np2.Y(bool);
        this.I1 = np2.Y(null);
        this.J1 = np2.Y(null);
        this.K1 = np2.Y(null);
        this.L1 = np2.Y(null);
        this.M1 = np2.Y(null);
        this.N1 = np2.Y(null);
        this.O1 = np2.Y(null);
        this.P1 = new mm6();
        this.V1 = new bt(new bv1(this, 4), new bv1(this, 5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
        if (defpackage.xk2.N(2000, r15, r1) == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(EmulatorActivity emulatorActivity, s41 s41Var) {
        aw1 aw1Var;
        int i;
        b36 b36Var;
        String str;
        String str2;
        int i2;
        int i3;
        s8 s8Var;
        int i4;
        int i5;
        b36 b36Var2;
        String str3;
        vs4 vs4Var = emulatorActivity.M1;
        if (s41Var instanceof aw1) {
            aw1Var = (aw1) s41Var;
            int i6 = aw1Var.f0;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aw1Var.f0 = i6 - Integer.MIN_VALUE;
                Object obj = aw1Var.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = aw1Var.f0;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                b36Var2 = aw1Var.R;
                                oi2.Y(obj);
                                long longValue = ((Number) obj).longValue();
                                vs4Var.setValue(emulatorActivity.getString(R.string.info_loading));
                                str3 = b36Var2.d.a;
                                if (str3 != null) {
                                    ce6 ce6Var = emulatorActivity.c1;
                                    if (ce6Var != null) {
                                        ce6Var.a(str3, be6.OPEN_GL, longValue);
                                    } else {
                                        nb3.a0("shaderCompileTimeStore");
                                        throw null;
                                    }
                                }
                                emulatorActivity.S();
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i7 = aw1Var.Z;
                        i5 = aw1Var.Y;
                        i4 = aw1Var.X;
                        b36 b36Var3 = aw1Var.R;
                        oi2.Y(obj);
                        i3 = i7;
                        b36Var = b36Var3;
                        xe1 xe1Var = xk1.a;
                        bw1 bw1Var = new bw1(emulatorActivity, i5, i3, null);
                        aw1Var.R = b36Var;
                        aw1Var.X = i4;
                        aw1Var.Y = i5;
                        aw1Var.Z = i3;
                        aw1Var.f0 = 3;
                        obj = hv.d0(xe1Var, bw1Var, aw1Var);
                        if (obj != x61Var) {
                            b36Var2 = b36Var;
                            long longValue2 = ((Number) obj).longValue();
                            vs4Var.setValue(emulatorActivity.getString(R.string.info_loading));
                            str3 = b36Var2.d.a;
                            if (str3 != null) {
                            }
                            emulatorActivity.S();
                            return jg7Var;
                        }
                        return x61Var;
                    }
                    b36Var = aw1Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    b36Var = emulatorActivity.X0;
                    if (b36Var != null) {
                        po5 po5Var = b36Var.d;
                        if (b36Var.b == VideoFiltering.RETROARCH && b36Var.a != VideoRenderer.VULKAN && (str = po5Var.a) != null && str.length() != 0) {
                            if (po5Var.b == hp5.NATIVE) {
                                wv1 wv1Var = new wv1(emulatorActivity, null, 6);
                                aw1Var.R = b36Var;
                                aw1Var.f0 = 1;
                            }
                        }
                    }
                    return jg7Var;
                }
                emulatorActivity.S0(b36Var);
                str2 = emulatorActivity.Y0;
                if (str2 != null && !str2.equals(emulatorActivity.Z0)) {
                    emulatorActivity.Z0 = str2;
                    if (b36Var.a != VideoRenderer.SOFTWARE || (i2 = b36Var.c) < 1) {
                        i2 = 1;
                    }
                    int i8 = i2 * 256;
                    i3 = i2 * 386;
                    s8Var = emulatorActivity.B0;
                    if (s8Var == null) {
                        s8Var.j.setText(R.string.info_retroarch_compiling_title);
                        s8 s8Var2 = emulatorActivity.B0;
                        if (s8Var2 != null) {
                            s8Var2.g.setVisibility(0);
                            s8 s8Var3 = emulatorActivity.B0;
                            if (s8Var3 != null) {
                                s8Var3.g.setIndeterminate(true);
                                s8 s8Var4 = emulatorActivity.B0;
                                if (s8Var4 != null) {
                                    s8Var4.k.setVisibility(0);
                                    s8 s8Var5 = emulatorActivity.B0;
                                    if (s8Var5 != null) {
                                        s8Var5.k.setText(R.string.info_vulkan_compiling_stage_retroarch);
                                        vs4Var.setValue(emulatorActivity.getString(R.string.info_retroarch_compiling_wait));
                                        aw1Var.R = b36Var;
                                        aw1Var.X = i2;
                                        aw1Var.Y = i8;
                                        aw1Var.Z = i3;
                                        aw1Var.f0 = 2;
                                        if (q60.t(150L, aw1Var) != x61Var) {
                                            i4 = i2;
                                            i5 = i8;
                                            xe1 xe1Var2 = xk1.a;
                                            bw1 bw1Var2 = new bw1(emulatorActivity, i5, i3, null);
                                            aw1Var.R = b36Var;
                                            aw1Var.X = i4;
                                            aw1Var.Y = i5;
                                            aw1Var.Z = i3;
                                            aw1Var.f0 = 3;
                                            obj = hv.d0(xe1Var2, bw1Var2, aw1Var);
                                            if (obj != x61Var) {
                                            }
                                        }
                                        return x61Var;
                                    }
                                    nb3.a0("binding");
                                    throw null;
                                }
                                nb3.a0("binding");
                                throw null;
                            }
                            nb3.a0("binding");
                            throw null;
                        }
                        nb3.a0("binding");
                        throw null;
                    }
                    nb3.a0("binding");
                    throw null;
                }
                return jg7Var;
            }
        }
        aw1Var = new aw1(emulatorActivity, s41Var);
        Object obj2 = aw1Var.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = aw1Var.f0;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        emulatorActivity.S0(b36Var);
        str2 = emulatorActivity.Y0;
        if (str2 != null) {
            emulatorActivity.Z0 = str2;
            if (b36Var.a != VideoRenderer.SOFTWARE) {
            }
            i2 = 1;
            int i82 = i2 * 256;
            i3 = i2 * 386;
            s8Var = emulatorActivity.B0;
            if (s8Var == null) {
            }
        }
        return jg7Var2;
    }

    public static final void C(EmulatorActivity emulatorActivity) {
        vs4 vs4Var = emulatorActivity.M1;
        if (!((Boolean) emulatorActivity.H1.getValue()).booleanValue()) {
            s8 s8Var = emulatorActivity.B0;
            if (s8Var != null) {
                s8Var.m.setVisibility(4);
                s8 s8Var2 = emulatorActivity.B0;
                if (s8Var2 != null) {
                    s8Var2.i.setVisibility(8);
                    s8 s8Var3 = emulatorActivity.B0;
                    if (s8Var3 != null) {
                        s8Var3.j.setVisibility(0);
                        s8 s8Var4 = emulatorActivity.B0;
                        if (s8Var4 != null) {
                            s8Var4.g.setVisibility(0);
                            s8 s8Var5 = emulatorActivity.B0;
                            if (s8Var5 != null) {
                                s8Var5.k.setVisibility(8);
                                s8 s8Var6 = emulatorActivity.B0;
                                if (s8Var6 != null) {
                                    s8Var6.j.setText(R.string.info_loading);
                                    if (vs4Var.getValue() == null) {
                                        vs4Var.setValue(emulatorActivity.getString(R.string.info_loading));
                                        return;
                                    }
                                    return;
                                }
                                nb3.a0("binding");
                                throw null;
                            }
                            nb3.a0("binding");
                            throw null;
                        }
                        nb3.a0("binding");
                        throw null;
                    }
                    nb3.a0("binding");
                    throw null;
                }
                nb3.a0("binding");
                throw null;
            }
            nb3.a0("binding");
            throw null;
        }
    }

    public static final void m0(bh5 bh5Var, bh5 bh5Var2, Rect rect, float f) {
        if (rect != null && f > RecyclerView.B1) {
            bh5Var.A = Math.max(bh5Var.A, rect.getWidth());
            bh5Var2.A = Math.max(bh5Var2.A, rect.getHeight());
        }
    }

    public static String n0(String str, String str2) {
        return lb1.m(str, ": ", str2);
    }

    public final void A0() {
        K0("Background mode override", hf.c0(new bk5("Engine A (Main) BG mode", new ou1(this, 19)), new bk5("Engine B (Sub) BG mode", new ou1(this, 20))), new ou1(this, 21));
    }

    public final void B0() {
        K0("OBJ / Sprites", hf.c0(new bk5("OBJ master", new ou1(this, 0)), new bk5("OBJ priority enables", new ou1(this, 1)), new bk5("OBJ OAM order / Z buckets", new ou1(this, 2)), new bk5("OBJ vertical bands", new ou1(this, 3)), new bk5("OBJ transform and storage type", new ou1(this, 4)), new bk5("OBJ effects and masks", new ou1(this, 5))), new ou1(this, 6));
    }

    public final void C0() {
        K0("OBJ OAM order / Z buckets", hf.c0(new bk5("Engine A (Main) OBJ OAM order", new wu1(this, 9)), new bk5("Engine B (Sub) OBJ OAM order", new wu1(this, 11))), new wu1(this, 12));
    }

    public final void D(LinearLayout linearLayout, String str) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(2, 13.0f);
        textView.setPadding(0, 0, 0, R(4));
        linearLayout.addView(textView);
    }

    public final void D0(boolean z) {
        String str;
        nj5 d0 = d0();
        vr4 P = P();
        LinearLayout linearLayout = (LinearLayout) P.A;
        ScrollView scrollView = (ScrollView) P.B;
        if (z) {
            str = "Engine A (Main) OBJ OAM order";
        } else {
            str = "Engine B (Sub) OBJ OAM order";
        }
        G(linearLayout, "OBJ OAM order / Z buckets");
        D(linearLayout, "Filters sprites by OAM index order. For equal OBJ priority, lower OAM indices are drawn later by `DrawSprites` and appear closer to the viewer; this gives practical Z-position control for composite sprites.");
        xu1 xu1Var = new xu1(z, d0, 3);
        uu1 uu1Var = new uu1(z, d0, this, 5);
        H(linearLayout, str);
        for (pj5 pj5Var : dw1.d) {
            String str2 = pj5Var.b;
            String str3 = pj5Var.c;
            boolean z2 = true;
            if ((((Number) xu1Var.c()).intValue() & (1 << pj5Var.a)) != 0) {
                z2 = false;
            }
            I(linearLayout, str2, str3, z2, new t00(pj5Var, xu1Var, uu1Var, 12));
        }
        M0(str, scrollView, new bv1(this, 3));
    }

    public final void E(LinearLayout linearLayout, nj5 nj5Var, int i, String str, String str2, on2 on2Var) {
        boolean z;
        if ((nj5Var.m & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        I(linearLayout, str, str2, z, new zu1(nj5Var, i, 0, on2Var));
    }

    public final void E0() {
        K0("OBJ priority enables", hf.c0(new bk5("Engine A (Main) OBJ priorities", new wu1(this, 2)), new bk5("Engine B (Sub) OBJ priorities", new wu1(this, 3))), new wu1(this, 4));
    }

    public final void F(LinearLayout linearLayout, String str, on2 on2Var, qn2 qn2Var, String str2, String str3) {
        H(linearLayout, str);
        for (qj5 qj5Var : dw1.c) {
            String str4 = qj5Var.b;
            int i = qj5Var.a;
            String str5 = qj5Var.c;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" ");
            sb.append(i);
            sb.append(". ");
            sb.append(str5);
            String n = i61.n(sb, " ", str3);
            boolean z = true;
            if (((1 << i) & ((Number) on2Var.c()).intValue()) != 0) {
                z = false;
            }
            I(linearLayout, str4, n, z, new t00(qj5Var, on2Var, qn2Var, 11));
        }
    }

    public final void F0(boolean z) {
        String str;
        nj5 d0 = d0();
        vr4 P = P();
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
        F(linearLayout, str2, new xu1(z, d0, 2), new uu1(z, d0, this, 4), "OBJ priority", "Code gate: `attrib[2] & 0x0C00`, then `InterleaveSprites(0x40000 | priority << 16)`.");
        M0(str2, scrollView, new bv1(this, 2));
    }

    public final void G(LinearLayout linearLayout, String str) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setTextSize(2, 16.0f);
        textView.setPadding(0, R(12), 0, R(4));
        linearLayout.addView(textView);
    }

    public final void G0() {
        if (!Y()) {
            return;
        }
        String string = getString(R.string.renderer_3d_debug_controls);
        string.getClass();
        kw3 I = hf.I();
        I.add(new bk5("Renderer output and primitive buckets", new ou1(this, 22)));
        I.add(new bk5("Polygon material and effects", new ou1(this, 23)));
        I.add(new bk5("Depth, fog and screen bands", new ou1(this, 24)));
        String string2 = getString(R.string.renderer_3d_debug_controls_reset);
        string2.getClass();
        I.add(new bk5(string2, new ou1(this, 25)));
        K0(string, hf.A(I), new ou1(this, 26));
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
        K0("Depth, fog and screen bands", hf.c0(new bk5("Depth and fog mode", new ou1(this, 29)), new bk5("Screen bands", new wu1(this, 0))), new wu1(this, 1));
    }

    public final void I(LinearLayout linearLayout, String str, String str2, boolean z, qn2 qn2Var) {
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
        switchCompat.setOnCheckedChangeListener(new jq0(qn2Var, 1));
        linearLayout2.addView(switchCompat, new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(this);
        textView.setText(str2);
        textView.setTextSize(2, 12.0f);
        textView.setPadding(R(4), 0, 0, 0);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
    }

    public final void I0() {
        K0("Polygon material and effects", hf.c0(new bk5("Texture state", new wu1(this, 19)), new bk5("Polygon mode", new wu1(this, 20))), new wu1(this, 21));
    }

    public final void J(LinearLayout linearLayout, rj5 rj5Var, int i, String str, String str2) {
        boolean z;
        if ((rj5Var.a & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        I(linearLayout, str, str2, z, new zu1(rj5Var, i, 1, this));
    }

    public final void J0() {
        K0("Renderer output and primitives", hf.c0(new bk5("3D renderer output", new wu1(this, 14)), new bk5("Primitive buckets", new wu1(this, 15)), new bk5("Blend buckets", new wu1(this, 16))), new wu1(this, 17));
    }

    public final void K(jq1 jq1Var) {
        nj3 nj3Var;
        boolean z;
        boolean z2;
        RuntimeLayoutView runtimeLayoutView;
        boolean z3;
        if (jq1Var != jq1.OFF && this.K0 != null) {
            int i = me.magnum.melonds.ui.emulator.a.d[jq1Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        i.d();
                        return;
                    }
                    return;
                }
                nj3Var = nj3.BOTTOM_SCREEN;
            } else {
                nj3Var = nj3.TOP_SCREEN;
            }
            s8 s8Var = this.B0;
            if (s8Var != null) {
                RuntimeLayoutView runtimeLayoutView2 = s8Var.m;
                nj3 nj3Var2 = nj3.TOP_SCREEN;
                boolean z4 = false;
                if (runtimeLayoutView2.d(nj3Var2) != null) {
                    z = true;
                } else {
                    z = false;
                }
                s8 s8Var2 = this.B0;
                if (s8Var2 != null) {
                    RuntimeLayoutView runtimeLayoutView3 = s8Var2.m;
                    nj3 nj3Var3 = nj3.BOTTOM_SCREEN;
                    if (runtimeLayoutView3.d(nj3Var3) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z || z2) {
                        if (!z2 || z) {
                            if (!z) {
                                if (!z2) {
                                    nj3Var2 = null;
                                }
                            }
                        }
                        nj3Var2 = nj3Var3;
                    }
                    if (nj3Var2 != null) {
                        if (nj3Var2 != nj3Var) {
                            z4 = true;
                        }
                        s8 s8Var3 = this.B0;
                        if (s8Var3 != null) {
                            RuntimeLayoutView runtimeLayoutView4 = s8Var3.m;
                            boolean z5 = runtimeLayoutView4.j0;
                            if (z5 != z4) {
                                runtimeLayoutView4.j0 = !z5;
                                runtimeLayoutView4.j();
                            }
                            c92 c92Var = this.K0;
                            if (c92Var != null && (runtimeLayoutView = c92Var.L) != null && (z3 = runtimeLayoutView.j0) != z4) {
                                runtimeLayoutView.j0 = !z3;
                                runtimeLayoutView.j();
                                return;
                            }
                            return;
                        }
                        nb3.a0("binding");
                        throw null;
                    }
                    return;
                }
                nb3.a0("binding");
                throw null;
            }
            nb3.a0("binding");
            throw null;
        }
    }

    public final void K0(String str, List list, on2 on2Var) {
        boolean z;
        if (Y() && on2Var != null) {
            z = true;
        } else {
            z = false;
        }
        this.V1.z(ex1.PAUSE_MENU);
        zb zbVar = new zb(this);
        wb wbVar = (wb) zbVar.L;
        wbVar.d = str;
        ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((bk5) it.next()).a);
        }
        zbVar.v((CharSequence[]) arrayList.toArray(new String[0]), new ax(list, 1));
        if (on2Var != null) {
            zbVar.x(R.string.navigate_back, null);
        }
        if (z) {
            wbVar.k = h0();
            wbVar.l = null;
            wbVar.g = "+1 Frame";
            wbVar.h = null;
        }
        wbVar.o = new ku1(this, 0);
        wbVar.n = new lu1(this, 0);
        ac l = zbVar.l();
        l.setOnShowListener(new mu1(on2Var, l, this));
        l.show();
    }

    public final void L(nj5 nj5Var) {
        if (!Y()) {
            return;
        }
        RendererDebugBridge.INSTANCE.setRenderer2DDebugControls(nj5Var.a, nj5Var.b, nj5Var.c, nj5Var.d, nj5Var.e, nj5Var.f, nj5Var.g, nj5Var.h, nj5Var.i, nj5Var.j, nj5Var.k, nj5Var.l, nj5Var.m);
        a0();
    }

    public final void L0() {
        String string = getString(R.string.renderer_debug_menu);
        string.getClass();
        kw3 I = hf.I();
        String string2 = getString(R.string.renderer_debug_capture);
        string2.getClass();
        I.add(new bk5(string2, new bv1(this, 20)));
        if (Y()) {
            I.add(new bk5(h0(), new bv1(this, 21)));
            String string3 = getString(R.string.renderer_2d_debug_controls);
            string3.getClass();
            I.add(new bk5(string3, new bv1(this, 22)));
            String string4 = getString(R.string.renderer_3d_debug_controls);
            string4.getClass();
            I.add(new bk5(string4, new bv1(this, 23)));
        }
        K0(string, hf.A(I), null);
    }

    public final void M() {
        b bVar = this.f1;
        if (bVar != null) {
            Handler handler = this.N0;
            if (handler != null) {
                handler.removeCallbacks(bVar);
            } else {
                nb3.a0("handler");
                throw null;
            }
        }
        this.f1 = null;
        this.g1 = 0;
    }

    public final void M0(String str, ScrollView scrollView, on2 on2Var) {
        if (!Y()) {
            return;
        }
        this.V1.z(ex1.PAUSE_MENU);
        zb zbVar = new zb(this);
        wb wbVar = (wb) zbVar.L;
        wbVar.d = str;
        zbVar.A(scrollView);
        zbVar.x(R.string.navigate_back, null);
        wbVar.k = h0();
        wbVar.l = null;
        wbVar.g = "+1 Frame";
        wbVar.h = null;
        wbVar.o = new ku1(this, 2);
        wbVar.n = new lu1(this, 2);
        ac l = zbVar.l();
        l.setOnShowListener(new mu1(l, this, on2Var));
        l.show();
    }

    public final void N() {
        this.V1.T(ex1.REWIND_WINDOW);
        this.L1.setValue(null);
        if (this.U1) {
            this.U1 = false;
            i0();
            return;
        }
        W().T0();
    }

    public final void N0(int i, boolean z, String str, qn2 qn2Var) {
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
        zb zbVar = new zb(this);
        zbVar.z(i);
        zbVar.A(editText);
        zbVar.y(R.string.ok, new nu1(0, qn2Var, editText));
        zbVar.x(R.string.cancel, null);
        zbVar.B();
    }

    public final om2 O(a aVar) {
        int i = me.magnum.melonds.ui.emulator.a.e[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new xr7(this);
            }
            i.d();
            return null;
        }
        return new pm4();
    }

    public final void O0() {
        if (!Y() || !this.h1) {
            return;
        }
        sz1 W = W();
        hv.L(W.z, null, null, new hz1(12, null, W), 3);
    }

    public final vr4 P() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(R(24), R(12), R(24), R(8));
        ScrollView scrollView = new ScrollView(this);
        scrollView.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
        return new vr4(linearLayout, scrollView);
    }

    public final void P0() {
        if (this.h1) {
            W().M0(false);
        } else {
            W().T0();
        }
    }

    public final void Q() {
        vs4 vs4Var = this.N1;
        if (vs4Var.getValue() != null) {
            vs4Var.setValue(null);
            this.V1.T(ex1.SAVE_STATES_DIALOG);
            c92 c92Var = this.K0;
            if (c92Var != null) {
                c92Var.a(null);
            }
        }
    }

    public final void Q0() {
        if (!Y()) {
            return;
        }
        this.h1 = !this.h1;
        P0();
    }

    public final int R(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    public final void R0() {
        Integer num;
        Integer num2;
        c92 c92Var;
        Display display;
        if (!this.i1) {
            Display D = ge7.D(this);
            D.getClass();
            if (this.D0 != null) {
                Display a2 = x86.a(this);
                if (this.l1 != u82.MELON_DUAL_DS) {
                    a2 = null;
                }
                pi1 pi1Var = this.E0;
                if (pi1Var != null) {
                    ok3 b = pi1Var.b(D, a2);
                    sz1 W = W();
                    W.getClass();
                    tp6 tp6Var = (tp6) W.u.f;
                    tp6Var.getClass();
                    tp6Var.m(null, b);
                    rv1 rv1Var = this.m1;
                    if (!this.i1) {
                        c92 c92Var2 = this.K0;
                        if (c92Var2 != null && (display = c92Var2.getDisplay()) != null) {
                            num = Integer.valueOf(display.getDisplayId());
                        } else {
                            num = null;
                        }
                        if (a2 != null) {
                            num2 = Integer.valueOf(a2.getDisplayId());
                        } else {
                            num2 = null;
                        }
                        if (!nb3.k(num, num2)) {
                            c92 c92Var3 = this.K0;
                            if (c92Var3 != null) {
                                c92Var3.dismiss();
                            }
                            this.K0 = null;
                            if (a2 != null) {
                                om2 om2Var = this.S0;
                                if (om2Var != null) {
                                    c92 c92Var4 = new c92(this, a2, om2Var, this.k1);
                                    RuntimeLayoutView runtimeLayoutView = c92Var4.L;
                                    runtimeLayoutView.setLayoutComponentViewBuilderFactory(new wb1(8, (byte) 0));
                                    runtimeLayoutView.setFrontendInputHandler(rv1Var);
                                    q33 q33Var = this.V0;
                                    if (q33Var != null) {
                                        runtimeLayoutView.setSystemInputHandler(q33Var);
                                        w26 w26Var = (w26) W().u0.A.getValue();
                                        if (w26Var != null) {
                                            RuntimeLayoutView runtimeLayoutView2 = c92Var4.L;
                                            sn3 sn3Var = sn3.SECONDARY_SCREEN;
                                            runtimeLayoutView2.getClass();
                                            sn3Var.getClass();
                                            runtimeLayoutView2.f0 = w26Var;
                                            runtimeLayoutView2.e(w26Var.e, sn3Var);
                                            runtimeLayoutView2.i();
                                            runtimeLayoutView2.k();
                                            runtimeLayoutView2.h(nj3.BUTTON_TOGGLE_SOFT_INPUT, runtimeLayoutView2.i0);
                                            c92Var4.b();
                                        }
                                        runtimeLayoutView.h(nj3.BUTTON_FAST_FORWARD_TOGGLE, rv1Var.A);
                                        runtimeLayoutView.h(nj3.BUTTON_MICROPHONE_TOGGLE, rv1Var.L);
                                        runtimeLayoutView.setConnectedControllersState((oz0) this.P0.f.A.getValue());
                                        b36 b36Var = (b36) W().y0.A.getValue();
                                        c92Var4.e0 = b36Var;
                                        fx1 fx1Var = c92Var4.Z.f0;
                                        if (fx1Var != null) {
                                            c91 c91Var = (c91) fx1Var;
                                            synchronized (c91Var.b) {
                                                c91Var.c = b36Var;
                                                c91Var.d = true;
                                            }
                                        }
                                        c92Var4.b();
                                        t26 t26Var = (t26) W().C0.A.getValue();
                                        t26Var.getClass();
                                        c92Var4.d0 = t26Var;
                                        c91 c91Var2 = c92Var4.Y;
                                        c91Var2.getClass();
                                        synchronized (c91Var2.o) {
                                            c91Var2.p = t26Var;
                                            c91Var2.q = true;
                                            c91Var2.e = true;
                                            c91Var2.f = false;
                                        }
                                        c92Var4.b();
                                        s8 s8Var = this.B0;
                                        if (s8Var != null) {
                                            if (s8Var.m.j0) {
                                                RuntimeLayoutView runtimeLayoutView3 = c92Var4.L;
                                                runtimeLayoutView3.j0 = !runtimeLayoutView3.j0;
                                                runtimeLayoutView3.j();
                                                c92Var4.b();
                                            }
                                            if (this.V1.M()) {
                                                c92Var4.R.setVisibility(0);
                                            }
                                            c92Var4.show();
                                            this.K0 = c92Var4;
                                            if (((Boolean) this.G1.getValue()).booleanValue() && (c92Var = this.K0) != null) {
                                                c92Var.a(new zv0(-1623931774, true, new cv1(this, 3)));
                                            }
                                            o0();
                                            return;
                                        }
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                    nb3.a0("melonTouchHandler");
                                    throw null;
                                }
                                nb3.a0("frameRenderCoordinator");
                                throw null;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                nb3.a0("deviceLayoutDisplayMapper");
                throw null;
            }
            nb3.a0("secondaryDisplaySelector");
            throw null;
        }
    }

    public final void S() {
        String[] em5Var;
        String str;
        Iterable iterable;
        Collection collection;
        String str2;
        zd6 zd6Var;
        int i;
        int i2;
        int i3;
        Object obj;
        String str3;
        try {
            em5Var = MelonEmulator.a.consumeShaderDiagnostics();
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        boolean z = em5Var instanceof em5;
        em5 em5Var2 = em5Var;
        if (z) {
            em5Var2 = null;
        }
        String[] strArr = (String[]) em5Var2;
        if (strArr != null && strArr.length != 0) {
            ae6 ae6Var = this.b1;
            if (ae6Var != null) {
                synchronized (ae6Var) {
                    int i4 = 1;
                    if (strArr.length == 0) {
                        iterable = yt1.A;
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
                            List J0 = qs6.J0(str4, cArr, 6);
                            if (J0.size() < 5) {
                                i3 = length;
                                i2 = i5;
                                i = i6;
                                zd6Var = null;
                            } else {
                                int i7 = length;
                                String str5 = (String) J0.get(i5);
                                boolean k = nb3.k(J0.get(i4), "OK");
                                String str6 = (String) J0.get(2);
                                String str7 = (String) J0.get(3);
                                String str8 = (String) J0.get(4);
                                String str9 = (String) gt0.K0(5, J0);
                                if (str9 == null) {
                                    str9 = "";
                                }
                                i = i6;
                                i2 = 0;
                                i3 = i7;
                                zd6Var = new zd6(currentTimeMillis, str5, k, str6, str7, str8, str9);
                            }
                            if (zd6Var != null) {
                                arrayList.add(zd6Var);
                            }
                            i6 = i + 1;
                            length = i3;
                            i5 = i2;
                            i4 = 1;
                        }
                        int i8 = i5;
                        str = null;
                        if (arrayList.isEmpty()) {
                            iterable = yt1.A;
                        } else {
                            try {
                                if (ae6Var.a.isFile()) {
                                    collection = jc2.A0(ae6Var.a);
                                } else {
                                    collection = yt1.A;
                                }
                                ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
                                int size = arrayList.size();
                                int i9 = i8;
                                while (i9 < size) {
                                    Object obj2 = arrayList.get(i9);
                                    i9++;
                                    zd6 zd6Var2 = (zd6) obj2;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(ae6Var.b.format(new Date(zd6Var2.a)));
                                    sb.append('\t');
                                    sb.append(zd6Var2.b);
                                    sb.append('\t');
                                    if (zd6Var2.c) {
                                        str2 = "OK";
                                    } else {
                                        str2 = "FAIL";
                                    }
                                    sb.append(str2);
                                    sb.append('\t');
                                    String str10 = zd6Var2.d;
                                    sb.append(qs6.N0(str10, "retroarch-shaders/installed/", qs6.O0('/', str10, str10)));
                                    sb.append('\t');
                                    sb.append(zd6Var2.e);
                                    sb.append(" -> ");
                                    sb.append(zd6Var2.f);
                                    if (!qs6.v0(zd6Var2.g)) {
                                        sb.append('\t');
                                        String replace = zd6Var2.g.replace('\n', ' ');
                                        replace.getClass();
                                        String replace2 = replace.replace('\r', ' ');
                                        replace2.getClass();
                                        sb.append(replace2);
                                    }
                                    arrayList2.add(sb.toString());
                                }
                                jc2.F0(ae6Var.a, gt0.P0(gt0.f1(MlKitException.CODE_SCANNER_UNAVAILABLE, gt0.V0(collection, arrayList2)), "\n", null, "\n", null, 58));
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
                        if (!((zd6) obj).c) {
                            break;
                        }
                    } else {
                        obj = str;
                        break;
                    }
                }
                zd6 zd6Var3 = (zd6) obj;
                if (zd6Var3 == null) {
                    return;
                }
                kv3 kv3Var = new kv3(zd6Var3.g);
                while (true) {
                    if (kv3Var.hasNext()) {
                        Object next = kv3Var.next();
                        if (!qs6.v0((String) next)) {
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
                String str12 = zd6Var3.d;
                Toast.makeText(this, getString(R.string.shader_compatibility_preset_failed, qs6.N0(str12, "retroarch-shaders/installed/", qs6.O0('/', str12, str12)), str11), 1).show();
                return;
            }
            nb3.a0("shaderCompatibilityLog");
            throw null;
        }
    }

    public final void S0(b36 b36Var) {
        VideoFiltering videoFiltering;
        boolean z;
        String str;
        String str2;
        boolean z2;
        String str3;
        vr4 vr4Var;
        po5 po5Var;
        po5 po5Var2;
        hp5 hp5Var;
        String name;
        po5 po5Var3;
        po5 po5Var4;
        Map map;
        Set entrySet;
        po5 po5Var5;
        int i = 0;
        String str4 = null;
        if (b36Var != null) {
            videoFiltering = b36Var.b;
        } else {
            videoFiltering = null;
        }
        if (videoFiltering == VideoFiltering.RETROARCH && b36Var.a != VideoRenderer.VULKAN) {
            z = true;
        } else {
            z = false;
        }
        if (b36Var != null && (po5Var5 = b36Var.d) != null) {
            str = po5Var5.a;
        } else {
            str = null;
        }
        if (z) {
            str2 = str;
        } else {
            str2 = null;
        }
        if (z && b36Var != null && (po5Var4 = b36Var.d) != null && (map = po5Var4.e) != null && (entrySet = map.entrySet()) != null) {
            str4 = gt0.P0(entrySet, ",", null, null, new vn0(25), 30);
        }
        String str5 = str4;
        if (z && b36Var != null && (po5Var3 = b36Var.d) != null && po5Var3.f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b36Var != null && (po5Var2 = b36Var.d) != null && (hp5Var = po5Var2.b) != null && (name = hp5Var.name()) != null) {
            str3 = name.toLowerCase(Locale.ROOT);
            str3.getClass();
        } else {
            str3 = "vulkan_ir";
        }
        String str6 = str3;
        if (z) {
            vr4Var = l0();
        } else {
            vr4Var = new vr4(0, 0);
        }
        Object obj = vr4Var.B;
        Object obj2 = vr4Var.A;
        if (z && b36Var != null && (po5Var = b36Var.d) != null) {
            i = po5Var.c;
        }
        String str7 = z + "|" + str2 + "|" + str5 + "|" + str6 + "|" + obj2 + "x" + obj + "|" + i;
        if (!str7.equals(this.Y0) || z2) {
            this.Y0 = str7;
            try {
                MelonEmulator.a.configureOpenGlRetroArchFilter(z, str2, str5, z2, str6, ((Number) obj2).intValue(), ((Number) obj).intValue(), i);
            } catch (Throwable unused) {
            }
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

    public final void T0(ac acVar) {
        Button h = acVar.h(-3);
        if (h != null) {
            h.setText(h0());
        }
        Button h2 = acVar.h(-1);
        if (h2 != null) {
            h2.setEnabled(this.h1);
        }
    }

    public final e84 U() {
        return (e84) this.o1.getValue();
    }

    public final void U0() {
        boolean z;
        int i;
        Rect rect;
        Rect rect2;
        boolean z2;
        Rect rect3;
        boolean z3;
        vr4 vr4Var;
        Rect rect4;
        Rect rect5;
        boolean z4;
        VulkanPresentationConfig vulkanPresentationConfig;
        Window window;
        View decorView;
        ArrayList arrayList;
        if (!this.i1 && !this.j1) {
            qv1 k0 = k0();
            Rect rect6 = k0.h;
            Rect rect7 = k0.b;
            this.O1.setValue(k0);
            S0(this.X0);
            c91 c91Var = this.U0;
            if (c91Var != null) {
                c91Var.e(k0.a, k0.b, k0.c, k0.d, k0.f, k0.g, k0.h, k0.i, k0.j);
                om2 om2Var = this.S0;
                if (om2Var != null) {
                    s8 s8Var = this.B0;
                    if (s8Var != null) {
                        EmulatorSurfaceView emulatorSurfaceView = s8Var.h;
                        Rect rect8 = k0.a;
                        float f = k0.c;
                        float f2 = k0.d;
                        boolean z5 = k0.e;
                        boolean z6 = k0.f;
                        Rect rect9 = k0.g;
                        float f3 = k0.i;
                        boolean z7 = k0.j;
                        b36 b36Var = this.X0;
                        if (b36Var != null) {
                            po5 po5Var = b36Var.d;
                            if (b36Var.a == VideoRenderer.VULKAN) {
                                if (s8Var != null) {
                                    vr4 currentSurfaceSize = emulatorSurfaceView.getCurrentSurfaceSize();
                                    int intValue = ((Number) currentSurfaceSize.A).intValue();
                                    int intValue2 = ((Number) currentSurfaceSize.B).intValue();
                                    if (intValue <= 0) {
                                        s8 s8Var2 = this.B0;
                                        if (s8Var2 != null) {
                                            intValue = s8Var2.h.getWidth();
                                        } else {
                                            nb3.a0("binding");
                                            throw null;
                                        }
                                    }
                                    if (intValue2 <= 0) {
                                        s8 s8Var3 = this.B0;
                                        if (s8Var3 != null) {
                                            intValue2 = s8Var3.h.getHeight();
                                        } else {
                                            nb3.a0("binding");
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
                                        vr4Var = new vr4(rect8, rect);
                                    } else if (intValue <= 0 || i <= 0) {
                                        rect2 = rect6;
                                        z2 = z6;
                                        rect3 = rect9;
                                        z3 = false;
                                        vr4Var = new vr4(null, null);
                                    } else {
                                        int max = Math.max(1, i / 2);
                                        z2 = z6;
                                        rect2 = rect6;
                                        z3 = false;
                                        rect3 = rect9;
                                        vr4Var = new vr4(new Rect(0, 0, intValue, max), new Rect(0, max, intValue, Math.max(1, i - max)));
                                    }
                                    Rect rect10 = (Rect) vr4Var.A;
                                    Rect rect11 = (Rect) vr4Var.B;
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
                                    BackgroundMode backgroundMode = this.d1.b;
                                    VideoFiltering videoFiltering = b36Var.b;
                                    if (videoFiltering == VideoFiltering.RETROARCH) {
                                        z4 = true;
                                    } else {
                                        z4 = z3;
                                    }
                                    String str = po5Var.a;
                                    String lowerCase = po5Var.b.name().toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    vulkanPresentationConfig = new VulkanPresentationConfig(rect10, rect11, f, f2, z5, z2, rect4, rect5, f3, z7, backgroundMode, videoFiltering, z4, str, lowerCase, po5Var.c, po5Var.e, po5Var.f);
                                    om2Var.e(emulatorSurfaceView, vulkanPresentationConfig, this.d1);
                                    if (Build.VERSION.SDK_INT < 29 && (window = getWindow()) != null && (decorView = window.getDecorView()) != null && decorView.isAttachedToWindow()) {
                                        if (this.k1) {
                                            ArrayList C0 = fv.C0(new Rect[]{rect7, rect2});
                                            arrayList = new ArrayList(ht0.v0(C0, 10));
                                            int size = C0.size();
                                            int i2 = 0;
                                            while (i2 < size) {
                                                Object obj = C0.get(i2);
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
                                                list = yt1.A;
                                            }
                                            window2.setSystemGestureExclusionRects(list);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                nb3.a0("binding");
                                throw null;
                            }
                        }
                        rect2 = rect6;
                        vulkanPresentationConfig = null;
                        om2Var.e(emulatorSurfaceView, vulkanPresentationConfig, this.d1);
                        if (Build.VERSION.SDK_INT < 29) {
                            return;
                        }
                        return;
                    }
                    nb3.a0("binding");
                    throw null;
                }
                nb3.a0("frameRenderCoordinator");
                throw null;
            }
            nb3.a0("mainScreenRenderer");
            throw null;
        }
    }

    public final hq2 V() {
        return (hq2) this.n1.getValue();
    }

    public final sz1 W() {
        return (sz1) this.C0.getValue();
    }

    public final boolean X() {
        if (this.F1.getValue() == null && this.N1.getValue() == null && this.P1.isEmpty() && !((Boolean) this.E1.getValue()).booleanValue() && this.L1.getValue() == null) {
            return false;
        }
        return true;
    }

    public final boolean Y() {
        if ((getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Z(int i) {
        boolean z;
        ah2 ah2Var = this.Q1;
        s8 s8Var = this.B0;
        if (s8Var != null) {
            if (!s8Var.d.hasFocus()) {
                s8 s8Var2 = this.B0;
                if (s8Var2 != null) {
                    s8Var2.d.requestFocus();
                } else {
                    nb3.a0("binding");
                    throw null;
                }
            }
            if (ah2Var != null) {
                z = ((eh2) ah2Var).g(i, true);
            } else {
                z = false;
            }
            if (!z) {
                if (ah2Var == null) {
                    return false;
                }
                return ((eh2) ah2Var).g(7, true);
            }
            return z;
        }
        nb3.a0("binding");
        throw null;
    }

    public final void a0() {
        if (!Y() || !this.h1) {
            return;
        }
        O0();
    }

    public final void b0() {
        mm6 mm6Var = this.P1;
        if (!mm6Var.isEmpty()) {
            mm6Var.remove(mm6Var.size() - 1);
        }
        if (mm6Var.isEmpty() && this.F1.getValue() == null) {
            i0();
        }
    }

    public final void c0(ov1 ov1Var) {
        this.V1.z(ex1.PAUSE_MENU);
        this.P1.add(ov1Var);
        j0(0);
    }

    public final nj5 d0() {
        if (!Y()) {
            return new nj5();
        }
        int[] renderer2DDebugControls = RendererDebugBridge.INSTANCE.getRenderer2DDebugControls();
        if (renderer2DDebugControls != null && renderer2DDebugControls.length >= 13) {
            return new nj5(renderer2DDebugControls[0], renderer2DDebugControls[1], renderer2DDebugControls[2], renderer2DDebugControls[3], renderer2DDebugControls[4], renderer2DDebugControls[5], renderer2DDebugControls[6], renderer2DDebugControls[7], renderer2DDebugControls[8], renderer2DDebugControls[9], renderer2DDebugControls[10], renderer2DDebugControls[11], renderer2DDebugControls[12]);
        }
        return new nj5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b4, code lost:
        r0 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bb, code lost:
        r20 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bd, code lost:
        r0 = (defpackage.i63) r20;
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
        if (r14 > androidx.recyclerview.widget.RecyclerView.B1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0140, code lost:
        r14 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
        if (r14 < androidx.recyclerview.widget.RecyclerView.B1) goto L78;
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
        r10 = (defpackage.i63) r20;
        r0 = defpackage.hf.c0(r10.b, r10.c);
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
        r10 = (defpackage.h63) r0.next();
        r21 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a2, code lost:
        if ((r10 instanceof defpackage.e63) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a4, code lost:
        r10 = (defpackage.e63) r10;
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
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        qg2 qg2Var;
        motionEvent.getClass();
        int i = 2;
        int i2 = 1;
        b63 b63Var = null;
        float f = 0.5f;
        if (this.V1.M()) {
            if (X() && motionEvent.getAction() == 2) {
                float axisValue = motionEvent.getAxisValue(15);
                float axisValue2 = motionEvent.getAxisValue(16);
                if (axisValue > 0.5f && this.R1 <= 0.5f) {
                    qg2Var = new qg2(4);
                } else if (axisValue < -0.5f && this.R1 >= -0.5f) {
                    qg2Var = new qg2(3);
                } else if (axisValue2 > 0.5f && this.S1 <= 0.5f) {
                    qg2Var = new qg2(6);
                } else if (axisValue2 < -0.5f && this.S1 >= -0.5f) {
                    qg2Var = new qg2(5);
                } else {
                    qg2Var = null;
                }
                this.R1 = axisValue;
                this.S1 = axisValue2;
                if (qg2Var != null) {
                    Z(qg2Var.a);
                    return true;
                }
            }
            e73 e73Var = this.W0;
            if (e73Var != null) {
                if (motionEvent.isFromSource(16) || motionEvent.isFromSource(16777232) || motionEvent.isFromSource(1025)) {
                    e73Var.a(motionEvent);
                }
                return super.dispatchGenericMotionEvent(motionEvent);
            }
            nb3.a0("nativeInputListener");
            throw null;
        }
        e73 e73Var2 = this.W0;
        if (e73Var2 != null) {
            s03 s03Var = e73Var2.c;
            s03 s03Var2 = e73Var2.b;
            if (motionEvent.isFromSource(16) || motionEvent.isFromSource(16777232) || motionEvent.isFromSource(1025)) {
                boolean a2 = e73Var2.a(motionEvent);
                LinkedHashMap linkedHashMap = e73Var2.d;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Integer num = ((b73) entry.getKey()).a;
                    if (num != null) {
                        if (num.intValue() == motionEvent.getDeviceId()) {
                        }
                    }
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    b73 b73Var = (b73) entry2.getKey();
                    c73 c73Var = (c73) entry2.getValue();
                    int i3 = b73Var.b;
                    d63 d63Var = b73Var.c;
                    float axisValue3 = motionEvent.getAxisValue(i3);
                    b63 b63Var2 = b63Var;
                    int i4 = d73.a[d63Var.ordinal()];
                    float f2 = f;
                    if (i4 != i2) {
                        if (i4 != i) {
                            i.d();
                            return false;
                        }
                    }
                }
                if (a2 || !linkedHashMap2.isEmpty()) {
                    return true;
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        nb3.a0("nativeInputListener");
        throw null;
    }

    @Override // defpackage.jq, defpackage.lv0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        qg2 qg2Var;
        b63 b63Var;
        boolean z;
        InputDevice device;
        InputDevice device2;
        f63 f63Var;
        keyEvent.getClass();
        if (!this.V1.M()) {
            e73 e73Var = this.W0;
            if (e73Var != null) {
                s03 s03Var = e73Var.c;
                s03 s03Var2 = e73Var.b;
                u41 u41Var = e73Var.a;
                int keyCode = keyEvent.getKeyCode();
                ArrayList arrayList = u41Var.b;
                int size = arrayList.size();
                int i = 0;
                loop0: while (true) {
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        i63 i63Var = (i63) obj;
                        List<h63> c0 = hf.c0(i63Var.b, i63Var.c);
                        if (!c0.isEmpty()) {
                            for (h63 h63Var : c0) {
                                if (h63Var instanceof f63) {
                                    f63Var = (f63) h63Var;
                                } else {
                                    f63Var = null;
                                }
                                if (f63Var != null && f63Var.b == keyCode) {
                                    b63Var = i63Var.a;
                                    break loop0;
                                }
                            }
                            continue;
                        }
                    } else {
                        b63Var = null;
                        break;
                    }
                }
                if (b63Var != null) {
                    if (!keyEvent.isFromSource(16) && !keyEvent.isFromSource(16777232) && !keyEvent.isFromSource(1025) && !keyEvent.isFromSource(513) && (((device = keyEvent.getDevice()) == null || !device.supportsSource(16777232)) && ((device2 = keyEvent.getDevice()) == null || !device2.supportsSource(1025)))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int action = keyEvent.getAction();
                    if (action != 0) {
                        if (action == 1) {
                            e73Var.c(b63Var, false, z);
                            if (b63Var.isSystemInput()) {
                                s03Var2.b(b63Var);
                                return true;
                            }
                            s03Var.b(b63Var);
                            return true;
                        }
                    } else {
                        e73Var.c(b63Var, true, z);
                        if (b63Var.isSystemInput()) {
                            s03Var2.c(b63Var);
                            return true;
                        }
                        s03Var.c(b63Var);
                        return true;
                    }
                }
            } else {
                nb3.a0("nativeInputListener");
                throw null;
            }
        }
        if (X() && keyEvent.getAction() == 0) {
            switch (keyEvent.getKeyCode()) {
                case 19:
                    qg2Var = new qg2(5);
                    break;
                case 20:
                    qg2Var = new qg2(6);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    qg2Var = new qg2(3);
                    break;
                case 22:
                    qg2Var = new qg2(4);
                    break;
                default:
                    qg2Var = null;
                    break;
            }
            if (qg2Var != null) {
                if (Z(qg2Var.a)) {
                    return true;
                }
                s8 s8Var = this.B0;
                if (s8Var != null) {
                    s8Var.d.dispatchKeyEvent(keyEvent);
                    return true;
                }
                nb3.a0("binding");
                throw null;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        if (r0 != 6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float x;
        float y;
        motionEvent.getClass();
        if (motionEvent.getActionMasked() == 0) {
            View decorView = getWindow().getDecorView();
            decorView.getClass();
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                } else {
                    decorView.performHapticFeedback(3);
                }
            } catch (Throwable unused) {
            }
        }
        l93 R = gi2.R(0, motionEvent.getPointerCount());
        if (!(R instanceof Collection) || !((Collection) R).isEmpty()) {
            Iterator it = R.iterator();
            while (((k93) it).L) {
                int toolType = motionEvent.getToolType(((e93) it).nextInt());
                if (toolType == 2 || toolType == 4) {
                    z = true;
                    break;
                }
                while (((k93) it).L) {
                }
            }
        }
        z = false;
        if (!z && motionEvent.getPointerCount() == 2) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked == 5) {
                    this.W1 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                    this.X1 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                    this.Y1 = true;
                }
            }
            if (this.Y1) {
                float x2 = motionEvent.getX(0);
                if (motionEvent.getPointerCount() > 1) {
                    x = motionEvent.getX(1);
                } else {
                    x = motionEvent.getX(0);
                }
                float f = (x2 + x) / 2.0f;
                float y2 = motionEvent.getY(0);
                if (motionEvent.getPointerCount() > 1) {
                    y = motionEvent.getY(1);
                } else {
                    y = motionEvent.getY(0);
                }
                float f2 = f - this.W1;
                float f3 = ((y2 + y) / 2.0f) - this.X1;
                if (Math.abs(f2) > 180.0f || Math.abs(f3) > 180.0f) {
                    int i = (Math.abs(f2) > Math.abs(f3) ? 1 : (Math.abs(f2) == Math.abs(f3) ? 0 : -1));
                    rv1 rv1Var = this.m1;
                    if (i > 0) {
                        if (f2 > 180.0f) {
                            rv1Var.d();
                        } else {
                            rv1Var.f();
                        }
                    } else if (f3 > 180.0f) {
                        rv1Var.R.W().M0(true);
                    } else {
                        rv1Var.e();
                    }
                }
                this.Y1 = false;
            }
        } else if (z) {
            this.Y1 = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final rj5 e0() {
        if (!Y()) {
            return new rj5();
        }
        int[] renderer3DDebugControls = RendererDebugBridge.INSTANCE.getRenderer3DDebugControls();
        if (renderer3DDebugControls != null && renderer3DDebugControls.length >= 1) {
            return new rj5(renderer3DDebugControls[0]);
        }
        return new rj5();
    }

    public final boolean f0() {
        ov1 ov1Var = (ov1) gt0.R0(this.P1);
        if ((ov1Var instanceof nv1) && ((nv1) ov1Var).a.equals(getString(R.string.rom_settings))) {
            W().K0(xz5.ROM_SETTINGS);
            return true;
        }
        return false;
    }

    public final void g0() {
        om2 om2Var;
        M();
        ac acVar = this.w1;
        if (acVar != null) {
            acVar.dismiss();
        }
        this.w1 = null;
        ac acVar2 = this.x1;
        if (acVar2 != null) {
            acVar2.dismiss();
        }
        this.x1 = null;
        ac acVar3 = this.y1;
        if (acVar3 != null) {
            acVar3.dismiss();
        }
        this.y1 = null;
        ac acVar4 = this.z1;
        if (acVar4 != null) {
            acVar4.dismiss();
        }
        this.z1 = null;
        ac acVar5 = this.A1;
        if (acVar5 != null) {
            acVar5.dismiss();
        }
        this.A1 = null;
        Boolean bool = Boolean.FALSE;
        this.C1.setValue(bool);
        this.D1.setValue(bool);
        this.E1.setValue(bool);
        oq0 oq0Var = this.T0;
        if (oq0Var != null) {
            oq0Var.a();
        }
        c92 c92Var = this.K0;
        if (c92Var != null) {
            try {
                c92Var.dismiss();
            } catch (Throwable unused) {
            }
        }
        this.K0 = null;
        if (!this.j1 && (om2Var = this.S0) != null) {
            s8 s8Var = this.B0;
            if (s8Var != null) {
                om2Var.d(s8Var.h);
            }
            om2 om2Var2 = this.S0;
            if (om2Var2 != null) {
                om2Var2.stop();
                this.j1 = true;
                return;
            }
            nb3.a0("frameRenderCoordinator");
            throw null;
        }
    }

    public final String h0() {
        int i;
        if (this.h1) {
            i = R.string.on;
        } else {
            i = R.string.off;
        }
        return i61.m("Pause Emulation: ", getString(i));
    }

    public final void i0() {
        mu4 mu4Var = this.T1;
        if (mu4Var != null) {
            this.F1.setValue(mu4Var);
        } else {
            W().T0();
        }
    }

    public final void j0(int i) {
        ComposeView composeView;
        View view;
        s8 s8Var = this.B0;
        View view2 = null;
        if (s8Var != null) {
            ComposeView composeView2 = s8Var.d;
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
                composeView2.postDelayed(new om(this, i, 3), 32L);
                return;
            }
            return;
        }
        nb3.a0("binding");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
        if (r5 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if (r3 == null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qv1 k0() {
        vr4 vr4Var;
        vr4 vr4Var2;
        Rect rect;
        boolean z;
        Rect rect2;
        Rect rect3;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        boolean z4;
        s8 s8Var = this.B0;
        Rect rect4 = null;
        if (s8Var != null) {
            RuntimeLayoutView runtimeLayoutView = s8Var.m;
            if (runtimeLayoutView.j0) {
                vr4Var = new vr4(nj3.BOTTOM_SCREEN, nj3.TOP_SCREEN);
            } else {
                vr4Var = new vr4(nj3.TOP_SCREEN, nj3.BOTTOM_SCREEN);
            }
            nj3 nj3Var = (nj3) vr4Var.B;
            zj3 d = runtimeLayoutView.d((nj3) vr4Var.A);
            s8 s8Var2 = this.B0;
            if (s8Var2 != null) {
                zj3 d2 = s8Var2.m.d(nj3Var);
                s8 s8Var3 = this.B0;
                if (s8Var3 != null) {
                    zj3 d3 = s8Var3.m.d(nj3.HYBRID_SCREEN);
                    if (d3 != null) {
                        Rect b = d3.b();
                        int max = Math.max(1, b.getHeight() / 2);
                        vr4Var2 = new vr4(new Rect(b.getX(), b.getY(), b.getWidth(), max), new Rect(b.getX(), b.getY() + max, b.getWidth(), Math.max(1, b.getHeight() - max)));
                    } else {
                        vr4Var2 = new vr4(null, null);
                    }
                    Rect rect5 = (Rect) vr4Var2.A;
                    Rect rect6 = (Rect) vr4Var2.B;
                    if (d != null) {
                        rect = d.b();
                        if (rect.getWidth() <= 0 || rect.getHeight() <= 0) {
                            rect = null;
                        }
                    }
                    rect = this.L0;
                    Rect rect7 = rect;
                    if (d2 != null) {
                        Rect b2 = d2.b();
                        if (b2.getWidth() > 0 && b2.getHeight() > 0) {
                            rect4 = b2;
                        }
                    }
                    rect4 = this.M0;
                    if (getSharedPreferences(v15.b(this), 0).getBoolean("video_console_skin_enabled", false) && rect7 != null && rect4 != null && Math.abs(rect7.getX() - rect4.getX()) < 30 && rect7.getBottom() <= rect4.getY() + 16) {
                        int i = (int) (getResources().getDisplayMetrics().density * 18.0f);
                        int y = rect4.getY() - rect7.getBottom();
                        if (y < 0) {
                            y = 0;
                        }
                        if (y < i) {
                            int i2 = i - y;
                            int i3 = i2 / 2;
                            int i4 = i2 - i3;
                            int y2 = rect7.getY() - i3;
                            if (y2 < 0) {
                                y2 = 0;
                            }
                            int y3 = i4 + rect4.getY();
                            rect7 = Rect.copy$default(rect7, 0, y2, 0, 0, 13, null);
                            Rect rect8 = rect4;
                            z = false;
                            rect2 = Rect.copy$default(rect8, 0, y3, 0, 0, 13, null);
                            rect3 = rect7;
                            if (rect3 != null && rect3.getWidth() > 0 && rect3.getHeight() > 0) {
                                this.L0 = rect3;
                            }
                            if (rect2 != null && rect2.getWidth() > 0 && rect2.getHeight() > 0) {
                                this.M0 = rect2;
                            }
                            float f3 = 1.0f;
                            if (d == null) {
                                f = d.c;
                            } else {
                                f = 1.0f;
                            }
                            if (d2 == null) {
                                f2 = d2.c;
                            } else {
                                f2 = 1.0f;
                            }
                            if (d == null) {
                                z2 = d.d;
                            } else {
                                z2 = z;
                            }
                            if (d2 == null) {
                                z3 = d2.d;
                            } else {
                                z3 = z;
                            }
                            if (d3 != null) {
                                f3 = d3.c;
                            }
                            float f4 = f3;
                            if (d3 == null) {
                                z4 = d3.d;
                            } else {
                                z4 = z;
                            }
                            return new qv1(rect3, rect2, f, f2, z2, z3, rect5, rect6, f4, z4);
                        }
                    }
                    Rect rect9 = rect4;
                    z = false;
                    rect2 = rect9;
                    rect3 = rect7;
                    if (rect3 != null) {
                        this.L0 = rect3;
                    }
                    if (rect2 != null) {
                        this.M0 = rect2;
                    }
                    float f32 = 1.0f;
                    if (d == null) {
                    }
                    if (d2 == null) {
                    }
                    if (d == null) {
                    }
                    if (d2 == null) {
                    }
                    if (d3 != null) {
                    }
                    float f42 = f32;
                    if (d3 == null) {
                    }
                    return new qv1(rect3, rect2, f, f2, z2, z3, rect5, rect6, f42, z4);
                }
                nb3.a0("binding");
                throw null;
            }
            nb3.a0("binding");
            throw null;
        }
        nb3.a0("binding");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bh5] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, bh5] */
    public final vr4 l0() {
        ?? obj = new Object();
        ?? obj2 = new Object();
        try {
            qv1 k0 = k0();
            float f = k0.i;
            m0(obj, obj2, k0.a, k0.c);
            m0(obj, obj2, k0.b, k0.d);
            m0(obj, obj2, k0.g, f);
            m0(obj, obj2, k0.h, f);
        } catch (Throwable unused) {
        }
        return new vr4(Integer.valueOf(obj.A), Integer.valueOf(obj2.A));
    }

    public final void o0() {
        M();
        if (this.i1 || this.e1 != a.VULKAN) {
            return;
        }
        this.g1 = 0;
        b bVar = new b(this);
        this.f1 = bVar;
        Handler handler = this.N0;
        if (handler != null) {
            handler.post(bVar);
        } else {
            nb3.a0("handler");
            throw null;
        }
    }

    @Override // defpackage.jq, defpackage.mv0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ko4 ko4Var;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        this.L0 = null;
        this.M0 = null;
        if (configuration.orientation == 1) {
            ko4Var = ko4.PORTRAIT;
        } else {
            ko4Var = ko4.LANDSCAPE;
        }
        sz1 W = W();
        W.getClass();
        ko4Var.getClass();
        tp6 tp6Var = (tp6) W.u.d;
        tp6Var.getClass();
        tp6Var.m(null, ko4Var);
        Handler handler = this.N0;
        if (handler != null) {
            handler.post(new yu1(this, 11));
        } else {
            nb3.a0("handler");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [q33, java.lang.Object] */
    @Override // defpackage.sx2, androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        bv7 wu7Var;
        a aVar;
        oq0 pq0Var;
        ko4 ko4Var;
        super.onCreate(bundle);
        this.N0 = new Handler(getMainLooper());
        kd6 kd6Var = this.I0;
        if (kd6Var != null) {
            this.l1 = ((ng6) kd6Var).m();
            iu3 iu3Var = this.G0;
            if (iu3Var != null) {
                iu3Var.a = this;
                this.A.a(new mf5(iu3Var, 3));
                View inflate = getLayoutInflater().inflate(R.layout.activity_emulator, (ViewGroup) null, false);
                int i = R.id.layout_achievement;
                ComposeView composeView = (ComposeView) gi2.B(inflate, R.id.layout_achievement);
                if (composeView != null) {
                    i = R.id.layout_console_skin;
                    ComposeView composeView2 = (ComposeView) gi2.B(inflate, R.id.layout_console_skin);
                    if (composeView2 != null) {
                        i = R.id.layout_pause_menu;
                        ComposeView composeView3 = (ComposeView) gi2.B(inflate, R.id.layout_pause_menu);
                        if (composeView3 != null) {
                            i = R.id.layout_rewind;
                            RelativeLayout relativeLayout = (RelativeLayout) gi2.B(inflate, R.id.layout_rewind);
                            if (relativeLayout != null) {
                                MotionLayout motionLayout = (MotionLayout) inflate;
                                i = R.id.list_rewind;
                                RecyclerView recyclerView = (RecyclerView) gi2.B(inflate, R.id.list_rewind);
                                if (recyclerView != null) {
                                    i = R.id.progressLoading;
                                    ProgressBar progressBar = (ProgressBar) gi2.B(inflate, R.id.progressLoading);
                                    if (progressBar != null) {
                                        i = R.id.surfaceMain;
                                        EmulatorSurfaceView emulatorSurfaceView = (EmulatorSurfaceView) gi2.B(inflate, R.id.surfaceMain);
                                        if (emulatorSurfaceView != null) {
                                            i = R.id.textFps;
                                            TextView textView = (TextView) gi2.B(inflate, R.id.textFps);
                                            if (textView != null) {
                                                i = R.id.textLoading;
                                                TextView textView2 = (TextView) gi2.B(inflate, R.id.textLoading);
                                                if (textView2 != null) {
                                                    i = R.id.textLoadingDetail;
                                                    TextView textView3 = (TextView) gi2.B(inflate, R.id.textLoadingDetail);
                                                    if (textView3 != null) {
                                                        i = R.id.textResolution;
                                                        TextView textView4 = (TextView) gi2.B(inflate, R.id.textResolution);
                                                        if (textView4 != null) {
                                                            i = R.id.view_layout_controls;
                                                            RuntimeLayoutView runtimeLayoutView = (RuntimeLayoutView) gi2.B(inflate, R.id.view_layout_controls);
                                                            if (runtimeLayoutView != null) {
                                                                i = R.id.view_translation_overlay;
                                                                GameTranslationOverlayView gameTranslationOverlayView = (GameTranslationOverlayView) gi2.B(inflate, R.id.view_translation_overlay);
                                                                if (gameTranslationOverlayView != null) {
                                                                    this.B0 = new s8(motionLayout, composeView, composeView2, composeView3, relativeLayout, recyclerView, progressBar, emulatorSurfaceView, textView, textView2, textView3, textView4, runtimeLayoutView, gameTranslationOverlayView);
                                                                    v().i(1);
                                                                    s8 s8Var = this.B0;
                                                                    if (s8Var != null) {
                                                                        setContentView(s8Var.a);
                                                                        Window window = getWindow();
                                                                        window.getClass();
                                                                        s35 s35Var = new s35(window.getDecorView());
                                                                        int i2 = Build.VERSION.SDK_INT;
                                                                        if (i2 >= 35) {
                                                                            wu7Var = new zu7(window, s35Var);
                                                                        } else if (i2 >= 30) {
                                                                            wu7Var = new zu7(window, s35Var);
                                                                        } else if (i2 >= 26) {
                                                                            wu7Var = new wu7(window, s35Var);
                                                                        } else {
                                                                            wu7Var = new wu7(window, s35Var);
                                                                        }
                                                                        wu7Var.a(2);
                                                                        wu7Var.e();
                                                                        s8 s8Var2 = this.B0;
                                                                        if (s8Var2 != null) {
                                                                            MotionLayout motionLayout2 = s8Var2.a;
                                                                            h61 h61Var = new h61(this, 7);
                                                                            WeakHashMap weakHashMap = ao7.a;
                                                                            sn7.c(motionLayout2, h61Var);
                                                                            b().b(this.v1);
                                                                            this.Q0 = new s9(this, new d51(this, 18));
                                                                            this.R0 = new bt(this, bl2.C(this), this.P0);
                                                                            if (((ng6) W().c).e() == VideoRenderer.VULKAN) {
                                                                                aVar = a.VULKAN;
                                                                            } else {
                                                                                aVar = a.OPEN_GL;
                                                                            }
                                                                            this.e1 = aVar;
                                                                            om2 O = O(aVar);
                                                                            this.S0 = O;
                                                                            if (i2 >= 33) {
                                                                                pq0Var = new qq0(O);
                                                                            } else {
                                                                                pq0Var = new pq0(O);
                                                                            }
                                                                            this.T0 = pq0Var;
                                                                            this.V0 = new Object();
                                                                            c91 c91Var = new c91(this);
                                                                            this.U0 = c91Var;
                                                                            s8 s8Var3 = this.B0;
                                                                            if (s8Var3 != null) {
                                                                                s8Var3.h.setRenderer(c91Var);
                                                                                s8 s8Var4 = this.B0;
                                                                                if (s8Var4 != null) {
                                                                                    s8Var4.i.setVisibility(4);
                                                                                    s8 s8Var5 = this.B0;
                                                                                    if (s8Var5 != null) {
                                                                                        s8Var5.m.setLayoutComponentViewBuilderFactory(new wb1(8, (byte) 0));
                                                                                        s8 s8Var6 = this.B0;
                                                                                        if (s8Var6 != null) {
                                                                                            s8Var6.e.setOnClickListener(new tu1(this, 1));
                                                                                            s8 s8Var7 = this.B0;
                                                                                            if (s8Var7 != null) {
                                                                                                RecyclerView recyclerView2 = s8Var7.f;
                                                                                                recyclerView2.getContext();
                                                                                                recyclerView2.setLayoutManager(new LinearLayoutManager(0, true));
                                                                                                recyclerView2.i(new rr1());
                                                                                                recyclerView2.setAdapter(this.B1);
                                                                                                s8 s8Var8 = this.B0;
                                                                                                if (s8Var8 != null) {
                                                                                                    RuntimeLayoutView runtimeLayoutView2 = s8Var8.m;
                                                                                                    runtimeLayoutView2.setFrontendInputHandler(this.m1);
                                                                                                    q33 q33Var = this.V0;
                                                                                                    if (q33Var != null) {
                                                                                                        runtimeLayoutView2.setSystemInputHandler(q33Var);
                                                                                                        final hq2 V = V();
                                                                                                        s8 s8Var9 = this.B0;
                                                                                                        if (s8Var9 != null) {
                                                                                                            GameTranslationOverlayView gameTranslationOverlayView2 = s8Var9.n;
                                                                                                            V.getClass();
                                                                                                            V.l = gameTranslationOverlayView2;
                                                                                                            V.i();
                                                                                                            gameTranslationOverlayView2.setOnTriggerTranslationRequested(new xp2(V, 0));
                                                                                                            gameTranslationOverlayView2.setOnFloatingButtonLongClickListener(new xp2(V, 5));
                                                                                                            gameTranslationOverlayView2.setOnLassoRegionSelected(new qn2() { // from class: zp2
                                                                                                                @Override // defpackage.qn2
                                                                                                                public final Object g(Object obj) {
                                                                                                                    int i3 = r2;
                                                                                                                    jg7 jg7Var = jg7.a;
                                                                                                                    hq2 hq2Var = V;
                                                                                                                    switch (i3) {
                                                                                                                        case 0:
                                                                                                                            ua7 ua7Var = (ua7) obj;
                                                                                                                            ua7Var.getClass();
                                                                                                                            if (hq2Var.f.getBoolean("translator_enabled", false)) {
                                                                                                                                GameTranslationOverlayView gameTranslationOverlayView3 = hq2Var.l;
                                                                                                                                if (gameTranslationOverlayView3 != null) {
                                                                                                                                    gameTranslationOverlayView3.setTranslating(true);
                                                                                                                                }
                                                                                                                                hv.L(hq2Var.j, null, null, new f12(hq2Var, ua7Var, null), 3);
                                                                                                                            }
                                                                                                                            return jg7Var;
                                                                                                                        case 1:
                                                                                                                            String str = (String) obj;
                                                                                                                            str.getClass();
                                                                                                                            hq2Var.g(str, "ru");
                                                                                                                            return jg7Var;
                                                                                                                        default:
                                                                                                                            List<ua7> list = (List) obj;
                                                                                                                            list.getClass();
                                                                                                                            SharedPreferences sharedPreferences = hq2Var.f;
                                                                                                                            Activity activity = hq2Var.a;
                                                                                                                            JSONArray jSONArray = new JSONArray();
                                                                                                                            for (ua7 ua7Var2 : list) {
                                                                                                                                ua7Var2.getClass();
                                                                                                                                JSONObject jSONObject = new JSONObject();
                                                                                                                                jSONObject.put("id", ua7Var2.a);
                                                                                                                                RectF rectF = ua7Var2.b;
                                                                                                                                jSONObject.put("left", rectF.left);
                                                                                                                                jSONObject.put("top", rectF.top);
                                                                                                                                jSONObject.put("right", rectF.right);
                                                                                                                                jSONObject.put("bottom", rectF.bottom);
                                                                                                                                jSONObject.put("name", ua7Var2.c);
                                                                                                                                jSONArray.put(jSONObject);
                                                                                                                            }
                                                                                                                            String jSONArray2 = jSONArray.toString();
                                                                                                                            jSONArray2.getClass();
                                                                                                                            String d = hq2Var.d();
                                                                                                                            sharedPreferences.edit().putString(d, jSONArray2).apply();
                                                                                                                            String string = sharedPreferences.getString("translator_saved_regions", null);
                                                                                                                            if (string == null || qs6.v0(string)) {
                                                                                                                                sharedPreferences.edit().putString("translator_saved_regions", jSONArray2).apply();
                                                                                                                            }
                                                                                                                            GameTranslationOverlayView gameTranslationOverlayView4 = hq2Var.l;
                                                                                                                            if (gameTranslationOverlayView4 != null) {
                                                                                                                                gameTranslationOverlayView4.setSavedRegions(list);
                                                                                                                            }
                                                                                                                            int size = list.size();
                                                                                                                            Log.i("GameTranslatorManager", "Saved " + size + " OCR regions under key [" + d + "]");
                                                                                                                            String str2 = hq2Var.r;
                                                                                                                            if (str2 == null) {
                                                                                                                                str2 = activity.getString(R.string.category_translator);
                                                                                                                                str2.getClass();
                                                                                                                            }
                                                                                                                            String string2 = activity.getString(R.string.translator_regions_saved_toast, Integer.valueOf(list.size()));
                                                                                                                            Toast.makeText(activity, string2 + " (" + str2 + ")", 0).show();
                                                                                                                            return jg7Var;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            gameTranslationOverlayView2.setOnSpeakWordRequested(new qn2() { // from class: zp2
                                                                                                                @Override // defpackage.qn2
                                                                                                                public final Object g(Object obj) {
                                                                                                                    int i3 = r2;
                                                                                                                    jg7 jg7Var = jg7.a;
                                                                                                                    hq2 hq2Var = V;
                                                                                                                    switch (i3) {
                                                                                                                        case 0:
                                                                                                                            ua7 ua7Var = (ua7) obj;
                                                                                                                            ua7Var.getClass();
                                                                                                                            if (hq2Var.f.getBoolean("translator_enabled", false)) {
                                                                                                                                GameTranslationOverlayView gameTranslationOverlayView3 = hq2Var.l;
                                                                                                                                if (gameTranslationOverlayView3 != null) {
                                                                                                                                    gameTranslationOverlayView3.setTranslating(true);
                                                                                                                                }
                                                                                                                                hv.L(hq2Var.j, null, null, new f12(hq2Var, ua7Var, null), 3);
                                                                                                                            }
                                                                                                                            return jg7Var;
                                                                                                                        case 1:
                                                                                                                            String str = (String) obj;
                                                                                                                            str.getClass();
                                                                                                                            hq2Var.g(str, "ru");
                                                                                                                            return jg7Var;
                                                                                                                        default:
                                                                                                                            List<ua7> list = (List) obj;
                                                                                                                            list.getClass();
                                                                                                                            SharedPreferences sharedPreferences = hq2Var.f;
                                                                                                                            Activity activity = hq2Var.a;
                                                                                                                            JSONArray jSONArray = new JSONArray();
                                                                                                                            for (ua7 ua7Var2 : list) {
                                                                                                                                ua7Var2.getClass();
                                                                                                                                JSONObject jSONObject = new JSONObject();
                                                                                                                                jSONObject.put("id", ua7Var2.a);
                                                                                                                                RectF rectF = ua7Var2.b;
                                                                                                                                jSONObject.put("left", rectF.left);
                                                                                                                                jSONObject.put("top", rectF.top);
                                                                                                                                jSONObject.put("right", rectF.right);
                                                                                                                                jSONObject.put("bottom", rectF.bottom);
                                                                                                                                jSONObject.put("name", ua7Var2.c);
                                                                                                                                jSONArray.put(jSONObject);
                                                                                                                            }
                                                                                                                            String jSONArray2 = jSONArray.toString();
                                                                                                                            jSONArray2.getClass();
                                                                                                                            String d = hq2Var.d();
                                                                                                                            sharedPreferences.edit().putString(d, jSONArray2).apply();
                                                                                                                            String string = sharedPreferences.getString("translator_saved_regions", null);
                                                                                                                            if (string == null || qs6.v0(string)) {
                                                                                                                                sharedPreferences.edit().putString("translator_saved_regions", jSONArray2).apply();
                                                                                                                            }
                                                                                                                            GameTranslationOverlayView gameTranslationOverlayView4 = hq2Var.l;
                                                                                                                            if (gameTranslationOverlayView4 != null) {
                                                                                                                                gameTranslationOverlayView4.setSavedRegions(list);
                                                                                                                            }
                                                                                                                            int size = list.size();
                                                                                                                            Log.i("GameTranslatorManager", "Saved " + size + " OCR regions under key [" + d + "]");
                                                                                                                            String str2 = hq2Var.r;
                                                                                                                            if (str2 == null) {
                                                                                                                                str2 = activity.getString(R.string.category_translator);
                                                                                                                                str2.getClass();
                                                                                                                            }
                                                                                                                            String string2 = activity.getString(R.string.translator_regions_saved_toast, Integer.valueOf(list.size()));
                                                                                                                            Toast.makeText(activity, string2 + " (" + str2 + ")", 0).show();
                                                                                                                            return jg7Var;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            gameTranslationOverlayView2.setOnDismissRequested(new xp2(V, 6));
                                                                                                            gameTranslationOverlayView2.setOnRegionsSaved(new qn2() { // from class: zp2
                                                                                                                @Override // defpackage.qn2
                                                                                                                public final Object g(Object obj) {
                                                                                                                    int i3 = r2;
                                                                                                                    jg7 jg7Var = jg7.a;
                                                                                                                    hq2 hq2Var = V;
                                                                                                                    switch (i3) {
                                                                                                                        case 0:
                                                                                                                            ua7 ua7Var = (ua7) obj;
                                                                                                                            ua7Var.getClass();
                                                                                                                            if (hq2Var.f.getBoolean("translator_enabled", false)) {
                                                                                                                                GameTranslationOverlayView gameTranslationOverlayView3 = hq2Var.l;
                                                                                                                                if (gameTranslationOverlayView3 != null) {
                                                                                                                                    gameTranslationOverlayView3.setTranslating(true);
                                                                                                                                }
                                                                                                                                hv.L(hq2Var.j, null, null, new f12(hq2Var, ua7Var, null), 3);
                                                                                                                            }
                                                                                                                            return jg7Var;
                                                                                                                        case 1:
                                                                                                                            String str = (String) obj;
                                                                                                                            str.getClass();
                                                                                                                            hq2Var.g(str, "ru");
                                                                                                                            return jg7Var;
                                                                                                                        default:
                                                                                                                            List<ua7> list = (List) obj;
                                                                                                                            list.getClass();
                                                                                                                            SharedPreferences sharedPreferences = hq2Var.f;
                                                                                                                            Activity activity = hq2Var.a;
                                                                                                                            JSONArray jSONArray = new JSONArray();
                                                                                                                            for (ua7 ua7Var2 : list) {
                                                                                                                                ua7Var2.getClass();
                                                                                                                                JSONObject jSONObject = new JSONObject();
                                                                                                                                jSONObject.put("id", ua7Var2.a);
                                                                                                                                RectF rectF = ua7Var2.b;
                                                                                                                                jSONObject.put("left", rectF.left);
                                                                                                                                jSONObject.put("top", rectF.top);
                                                                                                                                jSONObject.put("right", rectF.right);
                                                                                                                                jSONObject.put("bottom", rectF.bottom);
                                                                                                                                jSONObject.put("name", ua7Var2.c);
                                                                                                                                jSONArray.put(jSONObject);
                                                                                                                            }
                                                                                                                            String jSONArray2 = jSONArray.toString();
                                                                                                                            jSONArray2.getClass();
                                                                                                                            String d = hq2Var.d();
                                                                                                                            sharedPreferences.edit().putString(d, jSONArray2).apply();
                                                                                                                            String string = sharedPreferences.getString("translator_saved_regions", null);
                                                                                                                            if (string == null || qs6.v0(string)) {
                                                                                                                                sharedPreferences.edit().putString("translator_saved_regions", jSONArray2).apply();
                                                                                                                            }
                                                                                                                            GameTranslationOverlayView gameTranslationOverlayView4 = hq2Var.l;
                                                                                                                            if (gameTranslationOverlayView4 != null) {
                                                                                                                                gameTranslationOverlayView4.setSavedRegions(list);
                                                                                                                            }
                                                                                                                            int size = list.size();
                                                                                                                            Log.i("GameTranslatorManager", "Saved " + size + " OCR regions under key [" + d + "]");
                                                                                                                            String str2 = hq2Var.r;
                                                                                                                            if (str2 == null) {
                                                                                                                                str2 = activity.getString(R.string.category_translator);
                                                                                                                                str2.getClass();
                                                                                                                            }
                                                                                                                            String string2 = activity.getString(R.string.translator_regions_saved_toast, Integer.valueOf(list.size()));
                                                                                                                            Toast.makeText(activity, string2 + " (" + str2 + ")", 0).show();
                                                                                                                            return jg7Var;
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            if (V.f.getBoolean("translator_enabled", false)) {
                                                                                                                gameTranslationOverlayView2.setVisibility(0);
                                                                                                                V.h();
                                                                                                            } else {
                                                                                                                gameTranslationOverlayView2.setVisibility(8);
                                                                                                                ap6 ap6Var = V.m;
                                                                                                                if (ap6Var != null) {
                                                                                                                    ap6Var.h(null);
                                                                                                                }
                                                                                                                V.m = null;
                                                                                                            }
                                                                                                            V().q = new pu1(this, 1);
                                                                                                            al0 al0Var = new al0(this, 1);
                                                                                                            s8 s8Var10 = this.B0;
                                                                                                            if (s8Var10 != null) {
                                                                                                                s8Var10.m.addOnLayoutChangeListener(al0Var);
                                                                                                                Configuration configuration = getResources().getConfiguration();
                                                                                                                configuration.getClass();
                                                                                                                if (configuration.orientation == 1) {
                                                                                                                    ko4Var = ko4.PORTRAIT;
                                                                                                                } else {
                                                                                                                    ko4Var = ko4.LANDSCAPE;
                                                                                                                }
                                                                                                                sz1 W = W();
                                                                                                                W.getClass();
                                                                                                                ko4Var.getClass();
                                                                                                                tp6 tp6Var = (tp6) W.u.d;
                                                                                                                tp6Var.getClass();
                                                                                                                tp6Var.m(null, ko4Var);
                                                                                                                getWindow().addFlags(128);
                                                                                                                boolean z = getSharedPreferences(v15.b(this), 0).getBoolean("video_console_skin_enabled", false);
                                                                                                                String str = "ds_lite_black";
                                                                                                                String string = getSharedPreferences(v15.b(this), 0).getString("video_console_skin_type", "ds_lite_black");
                                                                                                                if (string != null) {
                                                                                                                    str = string;
                                                                                                                }
                                                                                                                s8 s8Var11 = this.B0;
                                                                                                                if (z) {
                                                                                                                    if (s8Var11 != null) {
                                                                                                                        s8Var11.c.setVisibility(0);
                                                                                                                        s8 s8Var12 = this.B0;
                                                                                                                        if (s8Var12 != null) {
                                                                                                                            s8Var12.c.setClickable(false);
                                                                                                                            s8 s8Var13 = this.B0;
                                                                                                                            if (s8Var13 != null) {
                                                                                                                                s8Var13.c.setFocusable(false);
                                                                                                                                s8 s8Var14 = this.B0;
                                                                                                                                if (s8Var14 != null) {
                                                                                                                                    s8Var14.c.setContent(new zv0(798279560, true, new ql1(13, this, str)));
                                                                                                                                } else {
                                                                                                                                    nb3.a0("binding");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                nb3.a0("binding");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            nb3.a0("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        nb3.a0("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                } else if (s8Var11 != null) {
                                                                                                                    s8Var11.c.setVisibility(8);
                                                                                                                } else {
                                                                                                                    nb3.a0("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                s8 s8Var15 = this.B0;
                                                                                                                if (s8Var15 != null) {
                                                                                                                    s8Var15.b.setContent(new zv0(553795587, true, new cv1(this, 1)));
                                                                                                                    s8 s8Var16 = this.B0;
                                                                                                                    if (s8Var16 != null) {
                                                                                                                        s8Var16.d.setContent(new zv0(47377708, true, new cv1(this, 2)));
                                                                                                                        s8 s8Var17 = this.B0;
                                                                                                                        if (s8Var17 != null) {
                                                                                                                            s8Var17.d.setFocusable(true);
                                                                                                                            s8 s8Var18 = this.B0;
                                                                                                                            if (s8Var18 != null) {
                                                                                                                                s8Var18.d.setFocusableInTouchMode(true);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 1), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 3), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 5), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 7), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 9), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 11), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 13), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 15), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 17), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 19), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 21), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 23), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 25), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 27), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new tv1(this, null, 29), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new wv1(this, null, 1), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new wv1(this, null, 3), 3);
                                                                                                                                hv.L(bl2.C(this), null, null, new wv1(this, null, 5), 3);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            nb3.a0("binding");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        nb3.a0("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    nb3.a0("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                nb3.a0("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            nb3.a0("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        nb3.a0("binding");
                                                                                                        throw null;
                                                                                                    }
                                                                                                    nb3.a0("melonTouchHandler");
                                                                                                    throw null;
                                                                                                }
                                                                                                nb3.a0("binding");
                                                                                                throw null;
                                                                                            }
                                                                                            nb3.a0("binding");
                                                                                            throw null;
                                                                                        }
                                                                                        nb3.a0("binding");
                                                                                        throw null;
                                                                                    }
                                                                                    nb3.a0("binding");
                                                                                    throw null;
                                                                                }
                                                                                nb3.a0("binding");
                                                                                throw null;
                                                                            }
                                                                            nb3.a0("binding");
                                                                            throw null;
                                                                        }
                                                                        nb3.a0("binding");
                                                                        throw null;
                                                                    }
                                                                    nb3.a0("binding");
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
                        }
                    }
                }
                u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                return;
            }
            nb3.a0("lifecycleOwnerProvider");
            throw null;
        }
        nb3.a0("settingsRepository");
        throw null;
    }

    @Override // defpackage.sx2, defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        hq2 V = V();
        ap6 ap6Var = V.m;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        V.m = null;
        qq2 qq2Var = V.p;
        qq2Var.getClass();
        try {
            MediaPlayer mediaPlayer = qq2Var.g;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = qq2Var.g;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            qq2Var.g = null;
            TextToSpeech textToSpeech = qq2Var.c;
            if (textToSpeech != null) {
                textToSpeech.stop();
            }
            TextToSpeech textToSpeech2 = qq2Var.c;
            if (textToSpeech2 != null) {
                textToSpeech2.shutdown();
            }
            qq2Var.c = null;
        } catch (Throwable unused) {
        }
        g04.x(V.j, null);
        ci ciVar = V.i;
        ciVar.B = false;
        boolean z = ScreenCaptureService.A;
        Activity activity = (Activity) ciVar.L;
        ScreenCaptureService.B = 0;
        ScreenCaptureService.L = null;
        Intent intent = new Intent(activity, ScreenCaptureService.class);
        intent.setAction("me.magnum.melonds.translator.STOP_CAPTURE");
        activity.stopService(intent);
        g0();
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        boolean z;
        wz5 wz5Var;
        pq5 pq5Var;
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
                obj = new bj3((ConsoleType) ((u52) ConsoleType.getEntries()).get(i));
            }
        } else {
            if (extras != null) {
                wz5Var = (wz5) ((Parcelable) nc1.R(extras, "rom", wz5.class));
            } else {
                wz5Var = null;
            }
            if (wz5Var != null) {
                pq5Var = wz5Var.A;
            } else {
                pq5Var = null;
            }
            if (pq5Var != null) {
                obj = new cj3(wz5Var.A);
            } else if (intent.getData() != null) {
                Uri data = intent.getData();
                data.getClass();
                obj = new ej3(data);
            } else if (extras != null && extras.containsKey("PATH")) {
                String string = extras.getString("PATH");
                string.getClass();
                obj = new dj3(string);
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
                    obj = new ej3(uri);
                }
            }
        }
        if (obj != null && ((hy1) W().q0.A.getValue()).a()) {
            W().M0(false);
            this.V1.z(ex1.SWITCH_NEW_ROM_DIALOG);
            zb zbVar = new zb(this);
            wb wbVar = (wb) zbVar.L;
            wbVar.d = getString(R.string.title_emulator_running);
            wbVar.f = getString(R.string.message_stop_emulation);
            zbVar.y(R.string.ok, new qu1(this, intent, obj, 0));
            zbVar.x(R.string.no, new qo0(1));
            wbVar.o = new ku1(this, 1);
            wbVar.n = new lu1(this, 1);
            zbVar.B();
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
        SensorManager sensorManager;
        super.onPause();
        e84 U = U();
        if (U.k && (sensorManager = U.h) != null) {
            sensorManager.unregisterListener(U);
            U.k = false;
            if (U.w) {
                MelonEmulator.a.onScreenRelease();
                U.w = false;
            }
            if (U.x) {
                U.x = false;
            }
            if (U.y) {
                U.y = false;
            }
            if (U.z) {
                U.z = false;
            }
            if (U.A) {
                U.A = false;
            }
        }
        M();
        g15 g15Var = this.a1;
        if (g15Var != null) {
            Handler handler = this.N0;
            if (handler != null) {
                handler.removeCallbacks(g15Var);
            } else {
                nb3.a0("handler");
                throw null;
            }
        }
        this.a1 = null;
        rv1 rv1Var = this.m1;
        if (rv1Var.B) {
            rv1Var.B = false;
            rv1Var.g();
        }
        getWindow().clearFlags(128);
        oq0 oq0Var = this.T0;
        if (oq0Var != null) {
            oq0Var.a();
            if (!this.i1 && !isFinishing()) {
                W().M0(false);
                return;
            }
            return;
        }
        nb3.a0("choreographerFrameRenderer");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    @Override // androidx.fragment.app.p, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        c84 c84Var;
        e84 U;
        Sensor sensor;
        Sensor sensor2;
        super.onResume();
        r0();
        p0();
        q0();
        oq0 oq0Var = this.T0;
        if (oq0Var != null) {
            oq0Var.b();
            g15 g15Var = this.a1;
            if (g15Var != null) {
                Handler handler = this.N0;
                if (handler != null) {
                    handler.removeCallbacks(g15Var);
                } else {
                    nb3.a0("handler");
                    throw null;
                }
            }
            g15 g15Var2 = new g15(this, 7);
            this.a1 = g15Var2;
            Handler handler2 = this.N0;
            if (handler2 != null) {
                handler2.postDelayed(g15Var2, 1500L);
                V().i();
                SharedPreferences sharedPreferences = getSharedPreferences(v15.b(this), 0);
                if (sharedPreferences.getBoolean("pref_motion_gyro_enabled", true)) {
                    String string = sharedPreferences.getString("pref_motion_gyro_mode", "touch_aim");
                    e84 U2 = U();
                    if (string != null) {
                        int hashCode = string.hashCode();
                        if (hashCode != -145771109) {
                            if (hashCode != -108455103) {
                                if (hashCode == 364105797 && string.equals("touch_aim")) {
                                    c84Var = c84.TOUCH_AIM;
                                    U2.getClass();
                                    c84Var.getClass();
                                    U2.a = c84Var;
                                    U().b = sharedPreferences.getInt("pref_motion_gyro_sensitivity_x", 125) / 100.0f;
                                    U().c = sharedPreferences.getInt("pref_motion_gyro_sensitivity_y", 125) / 100.0f;
                                    U().d = sharedPreferences.getBoolean("pref_motion_gyro_invert_x", false);
                                    U().e = sharedPreferences.getBoolean("pref_motion_gyro_invert_y", false);
                                    U = U();
                                    SensorManager sensorManager = U.h;
                                    if (!U.k && sensorManager != null) {
                                        sensor = U.i;
                                        if (sensor != null) {
                                            sensorManager.registerListener(U, sensor, 1);
                                        }
                                        sensor2 = U.j;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(U, sensor2, 1);
                                        }
                                        U.k = true;
                                    }
                                }
                            } else if (string.equals("dpad_steer")) {
                                c84Var = c84.DPAD_STEER;
                                U2.getClass();
                                c84Var.getClass();
                                U2.a = c84Var;
                                U().b = sharedPreferences.getInt("pref_motion_gyro_sensitivity_x", 125) / 100.0f;
                                U().c = sharedPreferences.getInt("pref_motion_gyro_sensitivity_y", 125) / 100.0f;
                                U().d = sharedPreferences.getBoolean("pref_motion_gyro_invert_x", false);
                                U().e = sharedPreferences.getBoolean("pref_motion_gyro_invert_y", false);
                                U = U();
                                SensorManager sensorManager2 = U.h;
                                if (!U.k) {
                                    sensor = U.i;
                                    if (sensor != null) {
                                    }
                                    sensor2 = U.j;
                                    if (sensor2 != null) {
                                    }
                                    U.k = true;
                                }
                            }
                        } else if (string.equals("slot2_analog")) {
                            c84Var = c84.SLOT2_ANALOG;
                            U2.getClass();
                            c84Var.getClass();
                            U2.a = c84Var;
                            U().b = sharedPreferences.getInt("pref_motion_gyro_sensitivity_x", 125) / 100.0f;
                            U().c = sharedPreferences.getInt("pref_motion_gyro_sensitivity_y", 125) / 100.0f;
                            U().d = sharedPreferences.getBoolean("pref_motion_gyro_invert_x", false);
                            U().e = sharedPreferences.getBoolean("pref_motion_gyro_invert_y", false);
                            U = U();
                            SensorManager sensorManager22 = U.h;
                            if (!U.k) {
                            }
                        }
                    }
                    c84Var = c84.OFF;
                    U2.getClass();
                    c84Var.getClass();
                    U2.a = c84Var;
                    U().b = sharedPreferences.getInt("pref_motion_gyro_sensitivity_x", 125) / 100.0f;
                    U().c = sharedPreferences.getInt("pref_motion_gyro_sensitivity_y", 125) / 100.0f;
                    U().d = sharedPreferences.getBoolean("pref_motion_gyro_invert_x", false);
                    U().e = sharedPreferences.getBoolean("pref_motion_gyro_invert_y", false);
                    U = U();
                    SensorManager sensorManager222 = U.h;
                    if (!U.k) {
                    }
                }
                if (!this.V1.M()) {
                    sz1 W = W();
                    if (W.j0.get() == 0 && nb3.k(((tp6) W.h0.R).getValue(), uc5.a) && !((AtomicBoolean) W.V.A).get()) {
                        getWindow().addFlags(128);
                        W().T0();
                        return;
                    }
                    return;
                }
                return;
            }
            nb3.a0("handler");
            throw null;
        }
        nb3.a0("choreographerFrameRenderer");
        throw null;
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        Object value;
        ArrayList arrayList;
        super.onStart();
        if (this.i1) {
            return;
        }
        R0();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.O0, null);
        }
        InputManager inputManager = (InputManager) getSystemService(InputManager.class);
        lz0 lz0Var = this.P0;
        if (inputManager != null) {
            inputManager.registerInputDeviceListener(lz0Var, null);
        }
        o41 o41Var = lz0Var.a;
        if (o41Var != null) {
            g04.x(o41Var, null);
        }
        xe1 xe1Var = xk1.a;
        o41 i = g04.i(e04.a.Y);
        hv.L(i, null, null, new a6(lz0Var, null, 11), 3);
        lz0Var.a = i;
        tp6 tp6Var = lz0Var.c;
        do {
            value = tp6Var.getValue();
            List list = (List) value;
            arrayList = new ArrayList();
            int[] deviceIds = InputDevice.getDeviceIds();
            deviceIds.getClass();
            for (int i2 : deviceIds) {
                InputDevice device = InputDevice.getDevice(i2);
                if (device != null && lz0.a(device)) {
                    arrayList.add(device);
                }
            }
        } while (!tp6Var.j(value, arrayList));
        om2 om2Var = this.S0;
        if (om2Var != null) {
            s8 s8Var = this.B0;
            if (s8Var != null) {
                om2Var.c(s8Var.h);
                return;
            } else {
                nb3.a0("binding");
                throw null;
            }
        }
        nb3.a0("frameRenderCoordinator");
        throw null;
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        super.onStop();
        M();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.O0);
        }
        InputManager inputManager = (InputManager) getSystemService(InputManager.class);
        lz0 lz0Var = this.P0;
        if (inputManager != null) {
            inputManager.unregisterInputDeviceListener(lz0Var);
        }
        o41 o41Var = lz0Var.a;
        if (o41Var != null) {
            g04.x(o41Var, null);
        }
        tp6 tp6Var = lz0Var.c;
        tp6Var.getClass();
        tp6Var.m(null, yt1.A);
        if (!this.j1) {
            om2 om2Var = this.S0;
            if (om2Var != null) {
                s8 s8Var = this.B0;
                if (s8Var != null) {
                    om2Var.d(s8Var.h);
                    return;
                } else {
                    nb3.a0("binding");
                    throw null;
                }
            }
            nb3.a0("frameRenderCoordinator");
            throw null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        bv7 wu7Var;
        super.onWindowFocusChanged(z);
        Window window = getWindow();
        window.getClass();
        s35 s35Var = new s35(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            wu7Var = new zu7(window, s35Var);
        } else if (i >= 30) {
            wu7Var = new zu7(window, s35Var);
        } else if (i >= 26) {
            wu7Var = new wu7(window, s35Var);
        } else {
            wu7Var = new wu7(window, s35Var);
        }
        wu7Var.a(2);
        wu7Var.e();
    }

    public final void p0() {
        float f;
        mk2 s0 = W().s0();
        if (s0 != mk2.HIDDEN && ((Boolean) this.H1.getValue()).booleanValue()) {
            boolean z = getSharedPreferences(v15.b(this), 0).getBoolean("video_console_skin_enabled", false);
            o11 o11Var = new o11();
            float f2 = getResources().getDisplayMetrics().density;
            if (z) {
                f = 28.0f;
            } else {
                f = 8.0f;
            }
            int i = (int) (f * f2);
            int i2 = (int) (12.0f * f2);
            switch (me.magnum.melonds.ui.emulator.a.b[s0.ordinal()]) {
                case 1:
                    o11Var.i = 0;
                    o11Var.e = 0;
                    ((ViewGroup.MarginLayoutParams) o11Var).topMargin = i;
                    ((ViewGroup.MarginLayoutParams) o11Var).leftMargin = i2;
                    break;
                case 2:
                    o11Var.i = 0;
                    o11Var.e = 0;
                    o11Var.h = 0;
                    ((ViewGroup.MarginLayoutParams) o11Var).topMargin = i;
                    break;
                case 3:
                    o11Var.i = 0;
                    o11Var.h = 0;
                    ((ViewGroup.MarginLayoutParams) o11Var).topMargin = i;
                    ((ViewGroup.MarginLayoutParams) o11Var).rightMargin = i2;
                    break;
                case 4:
                    o11Var.l = 0;
                    o11Var.e = 0;
                    ((ViewGroup.MarginLayoutParams) o11Var).bottomMargin = i2;
                    ((ViewGroup.MarginLayoutParams) o11Var).leftMargin = i2;
                    break;
                case 5:
                    o11Var.l = 0;
                    o11Var.e = 0;
                    o11Var.h = 0;
                    ((ViewGroup.MarginLayoutParams) o11Var).bottomMargin = i2;
                    break;
                case 6:
                    o11Var.l = 0;
                    o11Var.h = 0;
                    ((ViewGroup.MarginLayoutParams) o11Var).bottomMargin = i2;
                    ((ViewGroup.MarginLayoutParams) o11Var).rightMargin = i2;
                    break;
                case 7:
                    break;
                default:
                    i.d();
                    return;
            }
            s8 s8Var = this.B0;
            if (s8Var != null) {
                s8Var.i.setLayoutParams(o11Var);
                s8 s8Var2 = this.B0;
                if (s8Var2 != null) {
                    s8Var2.i.setElevation(999.0f);
                    s8 s8Var3 = this.B0;
                    if (s8Var3 != null) {
                        s8Var3.i.bringToFront();
                        s8 s8Var4 = this.B0;
                        if (s8Var4 != null) {
                            s8Var4.i.setVisibility(0);
                        } else {
                            nb3.a0("binding");
                            throw null;
                        }
                    } else {
                        nb3.a0("binding");
                        throw null;
                    }
                } else {
                    nb3.a0("binding");
                    throw null;
                }
            } else {
                nb3.a0("binding");
                throw null;
            }
        } else {
            s8 s8Var5 = this.B0;
            if (s8Var5 != null) {
                s8Var5.i.setVisibility(8);
            } else {
                nb3.a0("binding");
                throw null;
            }
        }
        q0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0105, code lost:
        if (r10.length() > 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0() {
        Object em5Var;
        int i;
        String str;
        float f;
        s8 s8Var;
        int i2;
        int i3;
        s8 s8Var2;
        Integer h0;
        SharedPreferences sharedPreferences = getSharedPreferences(v15.b(this), 0);
        String string = sharedPreferences.getString("resolution_hud_position", "hidden");
        if (string == null) {
            string = "hidden";
        }
        if (!string.equals("hidden") && ((Boolean) this.H1.getValue()).booleanValue()) {
            String str2 = "opengl";
            String string2 = sharedPreferences.getString("video_renderer", "opengl");
            if (string2 != null) {
                str2 = string2;
            }
            try {
                String upperCase = str2.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                em5Var = VideoRenderer.valueOf(upperCase);
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            Object obj = VideoRenderer.OPENGL;
            if (em5Var instanceof em5) {
                em5Var = obj;
            }
            VideoRenderer videoRenderer = (VideoRenderer) em5Var;
            String string3 = sharedPreferences.getString("video_internal_resolution", "1");
            boolean z = true;
            if (string3 != null && (h0 = xs6.h0(string3)) != null) {
                i = h0.intValue();
            } else {
                i = 1;
            }
            if (i < 1) {
                i = 1;
            }
            if (videoRenderer == VideoRenderer.SOFTWARE) {
                i = 1;
            }
            int i4 = me.magnum.melonds.ui.emulator.a.c[videoRenderer.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        str = "Compute";
                    } else {
                        str = "Vulkan";
                    }
                } else {
                    str = "OpenGL";
                }
            } else {
                str = "Software";
            }
            int i5 = i * 256;
            int i6 = i * RendererDebugBridge.CAPTURE_HEIGHT;
            s8 s8Var3 = this.B0;
            if (s8Var3 != null) {
                s8Var3.l.setText(str + " | " + i5 + "x" + i6 + " (" + i + "x)");
                boolean z2 = sharedPreferences.getBoolean("video_console_skin_enabled", false);
                float f2 = getResources().getDisplayMetrics().density;
                if (z2) {
                    f = 28.0f * f2;
                } else {
                    f = 8.0f * f2;
                }
                int i7 = (int) f;
                int i8 = (int) (12.0f * f2);
                s8 s8Var4 = this.B0;
                if (s8Var4 != null) {
                    if (s8Var4.i.getVisibility() == 0) {
                        s8 s8Var5 = this.B0;
                        if (s8Var5 != null) {
                            CharSequence text = s8Var5.i.getText();
                            if (text != null) {
                            }
                        } else {
                            nb3.a0("binding");
                            throw null;
                        }
                    }
                    z = false;
                    mk2 s0 = W().s0();
                    o11 o11Var = new o11();
                    switch (string.hashCode()) {
                        case -1699597560:
                            if (string.equals("bottom_right")) {
                                o11Var.l = 0;
                                o11Var.h = 0;
                                if (z && s0 == mk2.BOTTOM_RIGHT) {
                                    i2 = (int) ((28.0f * f2) + i8);
                                } else {
                                    i2 = i8;
                                }
                                ((ViewGroup.MarginLayoutParams) o11Var).bottomMargin = i2;
                                ((ViewGroup.MarginLayoutParams) o11Var).rightMargin = i8;
                                s8Var2 = this.B0;
                                if (s8Var2 == null) {
                                    s8Var2.l.setLayoutParams(o11Var);
                                    s8 s8Var6 = this.B0;
                                    if (s8Var6 != null) {
                                        s8Var6.l.setVisibility(0);
                                        s8 s8Var7 = this.B0;
                                        if (s8Var7 != null) {
                                            s8Var7.l.bringToFront();
                                            s8 s8Var8 = this.B0;
                                            if (s8Var8 != null) {
                                                s8Var8.l.setElevation(999.0f);
                                                return;
                                            } else {
                                                nb3.a0("binding");
                                                throw null;
                                            }
                                        }
                                        nb3.a0("binding");
                                        throw null;
                                    }
                                    nb3.a0("binding");
                                    throw null;
                                }
                                nb3.a0("binding");
                                throw null;
                            }
                            s8Var = this.B0;
                            if (s8Var != null) {
                                s8Var.l.setVisibility(8);
                                return;
                            } else {
                                nb3.a0("binding");
                                throw null;
                            }
                        case -1580828439:
                            if (string.equals("bottom_center")) {
                                o11Var.l = 0;
                                o11Var.e = 0;
                                o11Var.h = 0;
                                if (z && s0 == mk2.BOTTOM_CENTER) {
                                    i8 = (int) ((28.0f * f2) + i8);
                                }
                                ((ViewGroup.MarginLayoutParams) o11Var).bottomMargin = i8;
                                s8Var2 = this.B0;
                                if (s8Var2 == null) {
                                }
                            }
                            s8Var = this.B0;
                            if (s8Var != null) {
                            }
                            break;
                        case -1113993601:
                            if (string.equals("top_center")) {
                                o11Var.i = 0;
                                o11Var.e = 0;
                                o11Var.h = 0;
                                if (z && s0 == mk2.TOP_CENTER) {
                                    i7 = (int) ((28.0f * f2) + i7);
                                }
                                ((ViewGroup.MarginLayoutParams) o11Var).topMargin = i7;
                                s8Var2 = this.B0;
                                if (s8Var2 == null) {
                                }
                            }
                            s8Var = this.B0;
                            if (s8Var != null) {
                            }
                            break;
                        case -966253391:
                            if (string.equals("top_left")) {
                                o11Var.i = 0;
                                o11Var.e = 0;
                                if (z && s0 == mk2.TOP_LEFT) {
                                    i7 = (int) ((28.0f * f2) + i7);
                                }
                                ((ViewGroup.MarginLayoutParams) o11Var).topMargin = i7;
                                ((ViewGroup.MarginLayoutParams) o11Var).leftMargin = i8;
                                s8Var2 = this.B0;
                                if (s8Var2 == null) {
                                }
                            }
                            s8Var = this.B0;
                            if (s8Var != null) {
                            }
                            break;
                        case -609197669:
                            if (string.equals("bottom_left")) {
                                o11Var.l = 0;
                                o11Var.e = 0;
                                if (z && s0 == mk2.BOTTOM_LEFT) {
                                    i3 = (int) ((28.0f * f2) + i8);
                                } else {
                                    i3 = i8;
                                }
                                ((ViewGroup.MarginLayoutParams) o11Var).bottomMargin = i3;
                                ((ViewGroup.MarginLayoutParams) o11Var).leftMargin = i8;
                                s8Var2 = this.B0;
                                if (s8Var2 == null) {
                                }
                            }
                            s8Var = this.B0;
                            if (s8Var != null) {
                            }
                            break;
                        case 116576946:
                            if (string.equals("top_right")) {
                                o11Var.i = 0;
                                o11Var.h = 0;
                                if (z && s0 == mk2.TOP_RIGHT) {
                                    i7 = (int) ((28.0f * f2) + i7);
                                }
                                ((ViewGroup.MarginLayoutParams) o11Var).topMargin = i7;
                                ((ViewGroup.MarginLayoutParams) o11Var).rightMargin = i8;
                                s8Var2 = this.B0;
                                if (s8Var2 == null) {
                                }
                            }
                            s8Var = this.B0;
                            if (s8Var != null) {
                            }
                            break;
                        default:
                            s8Var = this.B0;
                            if (s8Var != null) {
                            }
                            break;
                    }
                } else {
                    nb3.a0("binding");
                    throw null;
                }
            } else {
                nb3.a0("binding");
                throw null;
            }
        } else {
            s8 s8Var9 = this.B0;
            if (s8Var9 != null) {
                s8Var9.l.setVisibility(8);
            } else {
                nb3.a0("binding");
                throw null;
            }
        }
    }

    public final void r0() {
        getWindow().setSustainedPerformanceMode(((ng6) W().c).b.getBoolean("enable_sustained_performance", false));
    }

    public final void s0() {
        K0("Background type enables", hf.c0(new bk5("Tile background types", new ou1(this, 15)), new bk5("Bitmap background types", new ou1(this, 16)), new bk5("Special background types", new ou1(this, 17))), new ou1(this, 18));
    }

    public final void t0() {
        K0("BG layers and priorities", hf.c0(new bk5("Engine A (Main) BG layers", new ou1(this, 10)), new bk5("Engine B (Sub) BG layers", new ou1(this, 11)), new bk5("Engine A (Main) BG priorities", new ou1(this, 12)), new bk5("Engine B (Sub) BG priorities", new ou1(this, 13))), new ou1(this, 14));
    }

    public final void u0(boolean z) {
        String str;
        boolean z2;
        nj5 d0 = d0();
        vr4 P = P();
        LinearLayout linearLayout = (LinearLayout) P.A;
        ScrollView scrollView = (ScrollView) P.B;
        if (z) {
            str = "Engine A (Main) BG layers";
        } else {
            str = "Engine B (Sub) BG layers";
        }
        G(linearLayout, str);
        D(linearLayout, "Disables individual BG0-BG3 draw gates before `DrawBG_*` or `DrawBG_3D`; this is independent from the game's DISPCNT enable bits.");
        xu1 xu1Var = new xu1(z, d0, 0);
        uu1 uu1Var = new uu1(z, d0, this, 1);
        H(linearLayout, str);
        for (lj5 lj5Var : dw1.b) {
            String str2 = lj5Var.b;
            String str3 = lj5Var.c;
            if ((((Number) xu1Var.c()).intValue() & (1 << lj5Var.a)) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            I(linearLayout, str2, str3, z2, new t00(lj5Var, xu1Var, uu1Var, 10));
        }
        M0(str, scrollView, new wu1(this, 6));
    }

    public final void v0(boolean z) {
        String str;
        nj5 d0 = d0();
        vr4 P = P();
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
        F(linearLayout, str2, new xu1(z, d0, 1), new uu1(z, d0, this, 3), "BGCNT priority", "Code gate: `bgCnt[n] & 0x3` inside `DrawScanlineBGMode`.");
        M0(str2, scrollView, new wu1(this, 23));
    }

    public final void w0() {
        K0("Packed compMode override", hf.c0(new bk5("Top screen compMode", new ou1(this, 7)), new bk5("Bottom screen compMode", new ou1(this, 8))), new ou1(this, 9));
    }

    public final void x0(boolean z) {
        String str;
        int i;
        Object obj;
        int intValue;
        nj5 d0 = d0();
        vr4 P = P();
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
            i = d0.c;
        } else {
            i = d0.d;
        }
        uu1 uu1Var = new uu1(z, d0, this, 0);
        H(linearLayout, str);
        List list = dw1.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RadioGroup radioGroup = new RadioGroup(this);
        radioGroup.setOrientation(1);
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            mj5 mj5Var = (mj5) it.next();
            RadioButton radioButton = new RadioButton(this);
            radioButton.setId(View.generateViewId());
            radioButton.setText(mj5Var.b);
            radioButton.setTextSize(2, 14.0f);
            radioButton.setSingleLine(false);
            radioButton.setEllipsize(null);
            radioButton.setMaxLines(4);
            linkedHashMap.put(Integer.valueOf(radioButton.getId()), Integer.valueOf(mj5Var.a));
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
            fa6.e("Collection contains no element matching the predicate.");
            return;
        }
        radioGroup.check(intValue);
        radioGroup.setOnCheckedChangeListener(new av1(linkedHashMap, uu1Var, 1));
        linearLayout.addView(radioGroup);
        M0(str, scrollView, new ou1(this, 27));
    }

    public final void y0() {
        if (!Y()) {
            return;
        }
        String string = getString(R.string.renderer_2d_debug_controls);
        string.getClass();
        kw3 I = hf.I();
        I.add(new bk5("Background mode override", new bv1(this, 11)));
        I.add(new bk5("Packed compMode override", new bv1(this, 12)));
        I.add(new bk5("BG layers and priorities", new bv1(this, 13)));
        I.add(new bk5("Background type enables", new bv1(this, 14)));
        I.add(new bk5("OBJ / Sprites layers", new bv1(this, 15)));
        String string2 = getString(R.string.renderer_2d_debug_controls_reset);
        string2.getClass();
        I.add(new bk5(string2, new bv1(this, 16)));
        K0(string, hf.A(I), new bv1(this, 17));
    }

    public final void z0(boolean z) {
        String str;
        int i;
        Object obj;
        int intValue;
        nj5 d0 = d0();
        vr4 P = P();
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
            i = d0.a;
        } else {
            i = d0.b;
        }
        uu1 uu1Var = new uu1(z, d0, this, 2);
        H(linearLayout, str);
        List list = dw1.a;
        kw3 I = hf.I();
        I.add(new oj5(-1, "Native DISPCNT mode - use CurUnit->DispCnt & 0x7"));
        I.add(new oj5(0, "Mode 0 - 4 Static layers. Code: DrawScanlineBGMode<0>(); BG0-BG3 use DrawBG_Text."));
        I.add(new oj5(1, "Mode 1 - 3 Static layers + 1 Affine layer. Code: BG0-BG2 DrawBG_Text, BG3 DrawBG_Affine."));
        I.add(new oj5(2, "Mode 2 - 2 Static layers + 2 Affine layers. Code: BG0/BG1 DrawBG_Text, BG2/BG3 DrawBG_Affine."));
        I.add(new oj5(3, "Mode 3 - 3 Static layers + 1 Affine Extended layer. Code: BG3 DrawBG_Extended."));
        I.add(new oj5(4, "Mode 4 - 2 Static layers + 1 Affine layer + 1 Affine Extended layer. Code: BG2 DrawBG_Affine, BG3 DrawBG_Extended."));
        I.add(new oj5(5, "Mode 5 - 2 Static layers + 2 Affine Extended layers. Code: BG2/BG3 DrawBG_Extended."));
        if (z) {
            I.add(new oj5(6, "Mode 6 - 1 3D background layer + 1 Large screen. Code: BG0 DrawBG_3D, BG2 DrawBG_Large. Main only."));
        }
        kw3 A = hf.A(I);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RadioGroup radioGroup = new RadioGroup(this);
        radioGroup.setOrientation(1);
        ListIterator listIterator = A.listIterator(0);
        while (true) {
            xx2 xx2Var = (xx2) listIterator;
            obj = null;
            if (!xx2Var.hasNext()) {
                break;
            }
            oj5 oj5Var = (oj5) xx2Var.next();
            RadioButton radioButton = new RadioButton(this);
            radioButton.setId(View.generateViewId());
            radioButton.setText(oj5Var.b);
            radioButton.setTextSize(2, 14.0f);
            radioButton.setSingleLine(false);
            radioButton.setEllipsize(null);
            radioButton.setMaxLines(4);
            linkedHashMap.put(Integer.valueOf(radioButton.getId()), Integer.valueOf(oj5Var.a));
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
            fa6.e("Collection contains no element matching the predicate.");
            return;
        }
        radioGroup.check(intValue);
        radioGroup.setOnCheckedChangeListener(new av1(linkedHashMap, uu1Var, 0));
        linearLayout.addView(radioGroup);
        M0(str, scrollView, new wu1(this, 8));
    }
}
