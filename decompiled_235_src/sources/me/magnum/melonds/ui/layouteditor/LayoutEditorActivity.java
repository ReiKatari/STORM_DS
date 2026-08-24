package me.magnum.melonds.ui.layouteditor;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class LayoutEditorActivity extends sx2 {
    public static final /* synthetic */ int N0 = 0;
    public x86 B0;
    public pi1 C0;
    public sw4 D0;
    public final uo7 E0;
    public b F0;
    public Handler G0;
    public final zk1 H0;
    public z82 I0;
    public u66 J0;
    public final i9 K0;
    public final i9 L0;
    public final s63 M0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
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
            $ENTRIES = nc1.L($values);
        }

        private a(String str, int i, int i2) {
            this.stringRes = i2;
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

        public final int getStringRes() {
            return this.stringRes;
        }
    }

    public LayoutEditorActivity() {
        super(2);
        this.E0 = new uo7(gh5.a(yl3.class), new wk3(this, 1), new wk3(this, 0), new wk3(this, 2));
        this.H0 = new zk1(this, 3);
        this.K0 = (i9) s(new c9(5), new a9(this) { // from class: qk3
            public final /* synthetic */ LayoutEditorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                String stringExtra;
                String stringExtra2;
                int i = r2;
                UUID uuid = null;
                LayoutEditorActivity layoutEditorActivity = this.B;
                z8 z8Var = (z8) obj;
                switch (i) {
                    case 0:
                        int i2 = LayoutEditorActivity.N0;
                        z8Var.getClass();
                        if (z8Var.A == -1) {
                            Intent intent = z8Var.B;
                            if (intent != null && (stringExtra = intent.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            layoutEditorActivity.C().i(sn3.MAIN_SCREEN, uuid);
                            return;
                        }
                        return;
                    default:
                        int i3 = LayoutEditorActivity.N0;
                        z8Var.getClass();
                        if (z8Var.A == -1) {
                            Intent intent2 = z8Var.B;
                            if (intent2 != null && (stringExtra2 = intent2.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra2);
                            }
                            layoutEditorActivity.C().i(sn3.SECONDARY_SCREEN, uuid);
                            return;
                        }
                        return;
                }
            }
        });
        this.L0 = (i9) s(new c9(5), new a9(this) { // from class: qk3
            public final /* synthetic */ LayoutEditorActivity B;

            {
                this.B = this;
            }

            @Override // defpackage.a9
            public final void a(Object obj) {
                String stringExtra;
                String stringExtra2;
                int i = r2;
                UUID uuid = null;
                LayoutEditorActivity layoutEditorActivity = this.B;
                z8 z8Var = (z8) obj;
                switch (i) {
                    case 0:
                        int i2 = LayoutEditorActivity.N0;
                        z8Var.getClass();
                        if (z8Var.A == -1) {
                            Intent intent = z8Var.B;
                            if (intent != null && (stringExtra = intent.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            layoutEditorActivity.C().i(sn3.MAIN_SCREEN, uuid);
                            return;
                        }
                        return;
                    default:
                        int i3 = LayoutEditorActivity.N0;
                        z8Var.getClass();
                        if (z8Var.A == -1) {
                            Intent intent2 = z8Var.B;
                            if (intent2 != null && (stringExtra2 = intent2.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra2);
                            }
                            layoutEditorActivity.C().i(sn3.SECONDARY_SCREEN, uuid);
                            return;
                        }
                        return;
                }
            }
        });
        this.M0 = new s63(this, 7);
    }

    public final void B() {
        ArrayList arrayList;
        LayoutEditorView layoutEditorView;
        b bVar;
        b bVar2 = this.F0;
        ArrayList arrayList2 = null;
        if (bVar2 != null) {
            arrayList = bVar2.getLayoutEditorView().h();
        } else {
            arrayList = null;
        }
        z82 z82Var = this.I0;
        if (z82Var != null && (bVar = z82Var.A) != null) {
            layoutEditorView = bVar.getLayoutEditorView();
        } else {
            layoutEditorView = null;
        }
        if (layoutEditorView != null) {
            arrayList2 = layoutEditorView.h();
        }
        C().h(arrayList, arrayList2);
    }

    public final yl3 C() {
        return (yl3) this.E0.getValue();
    }

    public final void D() {
        ArrayList arrayList;
        LayoutEditorView layoutEditorView;
        b bVar;
        b bVar2 = this.F0;
        ArrayList arrayList2 = null;
        if (bVar2 != null && bVar2.getLayoutEditorView().j0) {
            b bVar3 = this.F0;
            if (bVar3 != null) {
                arrayList = bVar3.getLayoutEditorView().h();
            } else {
                nb3.a0("layoutEditorManager");
                throw null;
            }
        } else {
            arrayList = null;
        }
        z82 z82Var = this.I0;
        if (z82Var != null && (bVar = z82Var.A) != null) {
            layoutEditorView = bVar.getLayoutEditorView();
        } else {
            layoutEditorView = null;
        }
        if (layoutEditorView != null && layoutEditorView.j0) {
            arrayList2 = layoutEditorView.h();
        }
        if (arrayList == null && arrayList2 == null) {
            return;
        }
        C().h(arrayList, arrayList2);
    }

    public final void E() {
        Integer num;
        Integer num2;
        Display display;
        Display D = ge7.D(this);
        D.getClass();
        if (this.B0 != null) {
            Display a2 = x86.a(this);
            pi1 pi1Var = this.C0;
            if (pi1Var != null) {
                ok3 b = pi1Var.b(D, a2);
                tp6 tp6Var = (tp6) C().d.f;
                tp6Var.getClass();
                tp6Var.m(null, b);
                z82 z82Var = this.I0;
                if (z82Var != null && (display = z82Var.getDisplay()) != null) {
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
                    z82 z82Var2 = this.I0;
                    if (z82Var2 != null) {
                        z82Var2.dismiss();
                    }
                    this.I0 = null;
                    if (a2 != null) {
                        sw4 sw4Var = this.D0;
                        if (sw4Var != null) {
                            final z82 z82Var3 = new z82(sw4Var, this, a2, this.M0, this.J0);
                            z82Var3.setOnShowListener(new DialogInterface.OnShowListener() { // from class: sk3
                                @Override // android.content.DialogInterface.OnShowListener
                                public final void onShow(DialogInterface dialogInterface) {
                                    int i = LayoutEditorActivity.N0;
                                    w71 w71Var = (w71) LayoutEditorActivity.this.C().p.A.getValue();
                                    if (w71Var != null) {
                                        ff7 ff7Var = w71Var.a;
                                        ff7Var.getClass();
                                        z82Var3.A.getLayoutEditorView().e(ff7Var, sn3.SECONDARY_SCREEN);
                                    }
                                }
                            });
                            z82Var3.show();
                            this.I0 = z82Var3;
                            return;
                        }
                        nb3.a0("picasso");
                        throw null;
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

    @Override // defpackage.jq, defpackage.lv0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar;
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && (bVar = this.F0) != null && bVar.t(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.jq, defpackage.mv0, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        ko4 ko4Var;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        D();
        if (configuration.orientation == 1) {
            ko4Var = ko4.PORTRAIT;
        } else {
            ko4Var = ko4.LANDSCAPE;
        }
        yl3 C = C();
        ko4Var.getClass();
        tp6 tp6Var = (tp6) C.d.d;
        tp6Var.getClass();
        tp6Var.m(null, ko4Var);
        Handler handler = this.G0;
        if (handler != null) {
            handler.post(new rk3(this, 0));
        } else {
            nb3.a0("handler");
            throw null;
        }
    }

    @Override // defpackage.sx2, androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int parseColor;
        bv7 wu7Var;
        ko4 ko4Var;
        setTheme(ht.a().getThemeResId());
        super.onCreate(bundle);
        this.G0 = new Handler(getMainLooper());
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(16842801, typedValue, true);
        int i = typedValue.type;
        if (i >= 28 && i <= 31) {
            parseColor = typedValue.data;
        } else {
            parseColor = Color.parseColor("#0B0814");
        }
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(parseColor);
        sn3 sn3Var = sn3.MAIN_SCREEN;
        sw4 sw4Var = this.D0;
        if (sw4Var != null) {
            b bVar = new b(sn3Var, sw4Var, null, this);
            bVar.setListener(this.M0);
            this.F0 = bVar;
            relativeLayout.addView(bVar, -1, -1);
            setContentView(relativeLayout);
            h61 h61Var = new h61(this, 10);
            WeakHashMap weakHashMap = ao7.a;
            sn7.c(relativeLayout, h61Var);
            b().b(new d00(this, false, 2));
            b bVar2 = this.F0;
            if (bVar2 != null) {
                bVar2.addOnLayoutChangeListener(new al0(this, 3));
                DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                if (i2 > 0 && i3 > 0) {
                    tp6 tp6Var = (tp6) C().d.b;
                    my4 my4Var = new my4(i2, i3);
                    tp6Var.getClass();
                    tp6Var.m(null, my4Var);
                }
                yl3 C = C();
                C.d.o(d83.e);
                yl3 C2 = C();
                C2.d.n(yt1.A);
                E();
                Window window = getWindow();
                window.getClass();
                s35 s35Var = new s35(window.getDecorView());
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 35) {
                    wu7Var = new zu7(window, s35Var);
                } else if (i4 >= 30) {
                    wu7Var = new zu7(window, s35Var);
                } else if (i4 >= 26) {
                    wu7Var = new wu7(window, s35Var);
                } else {
                    wu7Var = new wu7(window, s35Var);
                }
                wu7Var.a(2);
                wu7Var.e();
                Configuration configuration = getResources().getConfiguration();
                configuration.getClass();
                if (configuration.orientation == 1) {
                    ko4Var = ko4.PORTRAIT;
                } else {
                    ko4Var = ko4.LANDSCAPE;
                }
                yl3 C3 = C();
                ko4Var.getClass();
                tp6 tp6Var2 = (tp6) C3.d.d;
                tp6Var2.getClass();
                tp6Var2.m(null, ko4Var);
                hv.L(bl2.C(this), null, null, new vk3(this, null, 1), 3);
                hv.L(bl2.C(this), null, null, new vk3(this, null, 3), 3);
                hv.L(bl2.C(this), null, null, new vk3(this, null, 5), 3);
                hv.L(bl2.C(this), null, null, new vk3(this, null, 7), 3);
                return;
            }
            nb3.a0("layoutEditorManager");
            throw null;
        }
        nb3.a0("picasso");
        throw null;
    }

    @Override // defpackage.sx2, defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        b bVar;
        ImageView imageBackground;
        super.onDestroy();
        sw4 sw4Var = this.D0;
        if (sw4Var != null) {
            b bVar2 = this.F0;
            if (bVar2 != null) {
                ImageView imageBackground2 = bVar2.getImageBackground();
                if (imageBackground2 != null) {
                    sw4Var.a(imageBackground2);
                    z82 z82Var = this.I0;
                    if (z82Var != null && (bVar = z82Var.A) != null && (imageBackground = bVar.getImageBackground()) != null) {
                        sw4 sw4Var2 = this.D0;
                        if (sw4Var2 != null) {
                            sw4Var2.a(imageBackground);
                            return;
                        } else {
                            nb3.a0("picasso");
                            throw null;
                        }
                    }
                    return;
                }
                i.h("view cannot be null.");
                return;
            }
            nb3.a0("layoutEditorManager");
            throw null;
        }
        nb3.a0("picasso");
        throw null;
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
        super.onPause();
        D();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        E();
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.H0, null);
        }
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        super.onStop();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.H0);
        }
        D();
        z82 z82Var = this.I0;
        if (z82Var != null) {
            this.J0 = z82Var.A.A();
            z82Var.dismiss();
        }
        this.I0 = null;
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
}
