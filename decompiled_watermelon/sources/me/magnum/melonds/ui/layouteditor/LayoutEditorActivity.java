package me.magnum.melonds.ui.layouteditor;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class LayoutEditorActivity extends rr2 {
    public static final /* synthetic */ int M0 = 0;
    public lx5 A0;
    public le1 B0;
    public nn4 C0;
    public final va7 D0;
    public b E0;
    public Handler F0;
    public final vg1 G0;
    public h42 H0;
    public hv5 I0;
    public final h9 J0;
    public final h9 K0;
    public final ka3 L0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ e12 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final int stringRes;
        public static final a PROPERTIES = new a("PROPERTIES", 0, R.string.properties);
        public static final a BACKGROUNDS = new a("BACKGROUNDS", 1, R.string.background);
        public static final a REVERT = new a("REVERT", 2, R.string.revert_changes);
        public static final a RESET = new a("RESET", 3, R.string.reset_default);
        public static final a SAVE_AS_NEW = new a("SAVE_AS_NEW", 4, R.string.save_as_new);
        public static final a SAVE_AND_EXIT = new a("SAVE_AND_EXIT", 5, R.string.save_and_exit);
        public static final a EXIT_WITHOUT_SAVING = new a("EXIT_WITHOUT_SAVING", 6, R.string.exit_without_saving);

        private static final /* synthetic */ a[] $values() {
            return new a[]{PROPERTIES, BACKGROUNDS, REVERT, RESET, SAVE_AS_NEW, SAVE_AND_EXIT, EXIT_WITHOUT_SAVING};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l.C($values);
        }

        private a(String str, int i, int i2) {
            this.stringRes = i2;
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

        public final int getStringRes() {
            return this.stringRes;
        }
    }

    public LayoutEditorActivity() {
        super(2);
        this.D0 = new va7(q75.a(bf3.class), new de3(this, 1), new de3(this, 0), new de3(this, 2));
        this.G0 = new vg1(3, this);
        this.J0 = (h9) s(new b9(4), new z8(this) { // from class: yd3
            public final /* synthetic */ LayoutEditorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                String stringExtra;
                String stringExtra2;
                int i = r2;
                UUID uuid = null;
                LayoutEditorActivity layoutEditorActivity = this.B;
                y8 y8Var = (y8) obj;
                switch (i) {
                    case 0:
                        int i2 = LayoutEditorActivity.M0;
                        y8Var.getClass();
                        if (y8Var.A == -1) {
                            Intent intent = y8Var.B;
                            if (intent != null && (stringExtra = intent.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            layoutEditorActivity.B().h(ug3.MAIN_SCREEN, uuid);
                            return;
                        }
                        return;
                    default:
                        int i3 = LayoutEditorActivity.M0;
                        y8Var.getClass();
                        if (y8Var.A == -1) {
                            Intent intent2 = y8Var.B;
                            if (intent2 != null && (stringExtra2 = intent2.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra2);
                            }
                            layoutEditorActivity.B().h(ug3.SECONDARY_SCREEN, uuid);
                            return;
                        }
                        return;
                }
            }
        });
        this.K0 = (h9) s(new b9(4), new z8(this) { // from class: yd3
            public final /* synthetic */ LayoutEditorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.z8
            public final void b(Object obj) {
                String stringExtra;
                String stringExtra2;
                int i = r2;
                UUID uuid = null;
                LayoutEditorActivity layoutEditorActivity = this.B;
                y8 y8Var = (y8) obj;
                switch (i) {
                    case 0:
                        int i2 = LayoutEditorActivity.M0;
                        y8Var.getClass();
                        if (y8Var.A == -1) {
                            Intent intent = y8Var.B;
                            if (intent != null && (stringExtra = intent.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            layoutEditorActivity.B().h(ug3.MAIN_SCREEN, uuid);
                            return;
                        }
                        return;
                    default:
                        int i3 = LayoutEditorActivity.M0;
                        y8Var.getClass();
                        if (y8Var.A == -1) {
                            Intent intent2 = y8Var.B;
                            if (intent2 != null && (stringExtra2 = intent2.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra2);
                            }
                            layoutEditorActivity.B().h(ug3.SECONDARY_SCREEN, uuid);
                            return;
                        }
                        return;
                }
            }
        });
        this.L0 = new ka3(3, this);
    }

    public final bf3 B() {
        return (bf3) this.D0.getValue();
    }

    public final void C() {
        ArrayList arrayList;
        LayoutEditorView layoutEditorView;
        ArrayList arrayList2;
        o17 o17Var;
        Object value;
        nd3 nd3Var;
        k17 k17Var;
        b bVar;
        b bVar2 = this.E0;
        if (bVar2 != null) {
            if (bVar2.getLayoutEditorView().i0) {
                b bVar3 = this.E0;
                if (bVar3 != null) {
                    arrayList = bVar3.getLayoutEditorView().h();
                } else {
                    b53.g0("layoutEditorManager");
                    throw null;
                }
            } else {
                arrayList = null;
            }
            h42 h42Var = this.H0;
            if (h42Var != null && (bVar = h42Var.A) != null) {
                layoutEditorView = bVar.getLayoutEditorView();
            } else {
                layoutEditorView = null;
            }
            if (layoutEditorView != null && layoutEditorView.i0) {
                arrayList2 = layoutEditorView.h();
            } else {
                arrayList2 = null;
            }
            bf3 B = B();
            if ((arrayList != null || arrayList2 != null) && (o17Var = B.h) != null) {
                ee6 ee6Var = B.i;
                do {
                    value = ee6Var.getValue();
                    nd3 nd3Var2 = (nd3) value;
                    if (nd3Var2 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(nd3Var2.g);
                        k17 k17Var2 = (k17) linkedHashMap.get(o17Var);
                        if (k17Var2 != null) {
                            mv5 mv5Var = k17Var2.a;
                            if (arrayList != null) {
                                mv5Var = mv5.a(mv5Var, null, null, arrayList, 3);
                            }
                            mv5 mv5Var2 = k17Var2.b;
                            if (arrayList2 != null) {
                                mv5Var2 = mv5.a(mv5Var2, null, null, arrayList2, 3);
                            }
                            k17Var = k17.a(mv5Var, mv5Var2);
                        } else {
                            k17Var = new k17(new mv5(arrayList), new mv5(arrayList2));
                        }
                        linkedHashMap.put(o17Var, k17Var);
                        nd3Var = nd3.a(nd3Var2, null, null, null, null, false, 0, linkedHashMap, 63);
                    } else {
                        nd3Var = null;
                    }
                } while (!ee6Var.j(value, nd3Var));
                return;
            }
            return;
        }
        b53.g0("layoutEditorManager");
        throw null;
    }

    public final void D() {
        Integer num;
        Integer num2;
        Display display;
        Display y = jv3.y(this);
        y.getClass();
        if (this.A0 != null) {
            Display a2 = lx5.a(this);
            le1 le1Var = this.B0;
            if (le1Var != null) {
                wd3 b = le1Var.b(y, a2);
                ee6 ee6Var = (ee6) B().d.Y;
                ee6Var.getClass();
                ee6Var.l(null, b);
                h42 h42Var = this.H0;
                if (h42Var != null && (display = h42Var.getDisplay()) != null) {
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
                    h42 h42Var2 = this.H0;
                    if (h42Var2 != null) {
                        h42Var2.dismiss();
                    }
                    this.H0 = null;
                    if (a2 != null) {
                        nn4 nn4Var = this.C0;
                        if (nn4Var != null) {
                            final h42 h42Var3 = new h42(nn4Var, this, a2, this.L0, this.I0);
                            h42Var3.setOnShowListener(new DialogInterface.OnShowListener() { // from class: zd3
                                @Override // android.content.DialogInterface.OnShowListener
                                public final void onShow(DialogInterface dialogInterface) {
                                    int i = LayoutEditorActivity.M0;
                                    m41 m41Var = (m41) LayoutEditorActivity.this.B().p.A.getValue();
                                    if (m41Var != null) {
                                        k17 k17Var = m41Var.a;
                                        k17Var.getClass();
                                        h42Var3.A.getLayoutEditorView().e(k17Var, ug3.SECONDARY_SCREEN);
                                    }
                                }
                            });
                            h42Var3.show();
                            this.H0 = h42Var3;
                            return;
                        }
                        b53.g0("picasso");
                        throw null;
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

    @Override // defpackage.xp, defpackage.xs0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar;
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && (bVar = this.E0) != null && bVar.t(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.xp, defpackage.ys0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if4 if4Var;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        C();
        if (configuration.orientation == 1) {
            if4Var = if4.PORTRAIT;
        } else {
            if4Var = if4.LANDSCAPE;
        }
        bf3 B = B();
        if4Var.getClass();
        ee6 ee6Var = (ee6) B.d.R;
        ee6Var.getClass();
        ee6Var.l(null, if4Var);
        Handler handler = this.F0;
        if (handler != null) {
            handler.post(new m0(29, this));
        } else {
            b53.g0("handler");
            throw null;
        }
    }

    @Override // defpackage.rr2, androidx.fragment.app.p, defpackage.ys0, defpackage.xs0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        bg7 wf7Var;
        if4 if4Var;
        super.onCreate(bundle);
        this.F0 = new Handler(getMainLooper());
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-16777216);
        ug3 ug3Var = ug3.MAIN_SCREEN;
        nn4 nn4Var = this.C0;
        if (nn4Var != null) {
            b bVar = new b(ug3Var, nn4Var, null, this);
            bVar.setListener(this.L0);
            this.E0 = bVar;
            relativeLayout.addView(bVar, -1, -1);
            setContentView(relativeLayout);
            a31 a31Var = new a31(11, this);
            WeakHashMap weakHashMap = aa7.a;
            s97.c(relativeLayout, a31Var);
            b().b(new my(this, false, 2));
            b bVar2 = this.E0;
            if (bVar2 != null) {
                bVar2.addOnLayoutChangeListener(new si0(3, this));
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
                Configuration configuration = getResources().getConfiguration();
                configuration.getClass();
                if (configuration.orientation == 1) {
                    if4Var = if4.PORTRAIT;
                } else {
                    if4Var = if4.LANDSCAPE;
                }
                bf3 B = B();
                if4Var.getClass();
                ee6 ee6Var = (ee6) B.d.R;
                ee6Var.getClass();
                ee6Var.l(null, if4Var);
                tq5.w(hk2.y(this), null, null, new ce3(this, null, 1), 3);
                tq5.w(hk2.y(this), null, null, new ce3(this, null, 3), 3);
                tq5.w(hk2.y(this), null, null, new ce3(this, null, 5), 3);
                tq5.w(hk2.y(this), null, null, new ce3(this, null, 7), 3);
                return;
            }
            b53.g0("layoutEditorManager");
            throw null;
        }
        b53.g0("picasso");
        throw null;
    }

    @Override // defpackage.rr2, defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        b bVar;
        ImageView imageBackground;
        super.onDestroy();
        nn4 nn4Var = this.C0;
        if (nn4Var != null) {
            b bVar2 = this.E0;
            if (bVar2 != null) {
                ImageView imageBackground2 = bVar2.getImageBackground();
                if (imageBackground2 != null) {
                    nn4Var.a(imageBackground2);
                    h42 h42Var = this.H0;
                    if (h42Var != null && (bVar = h42Var.A) != null && (imageBackground = bVar.getImageBackground()) != null) {
                        nn4 nn4Var2 = this.C0;
                        if (nn4Var2 != null) {
                            nn4Var2.a(imageBackground);
                            return;
                        } else {
                            b53.g0("picasso");
                            throw null;
                        }
                    }
                    return;
                }
                i.i("view cannot be null.");
                return;
            }
            b53.g0("layoutEditorManager");
            throw null;
        }
        b53.g0("picasso");
        throw null;
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        D();
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.G0, null);
        }
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        super.onStop();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.G0);
        }
        C();
        h42 h42Var = this.H0;
        if (h42Var != null) {
            this.I0 = h42Var.A.B();
            h42Var.dismiss();
        }
        this.H0 = null;
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
}
