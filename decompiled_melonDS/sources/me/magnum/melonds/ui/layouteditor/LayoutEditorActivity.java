package me.magnum.melonds.ui.layouteditor;

import a0.j;
import a6.j2;
import a6.l2;
import a6.p0;
import a6.x0;
import a7.v;
import ah.j1;
import ah.p;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.b1;
import androidx.lifecycle.s0;
import cd.q1;
import com.squareup.picasso.a0;
import h.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import nc.u;
import q8.r;
import rd.k;
import rh.c;
import rh.e0;
import rh.h;
import rh.i;
import sf.d;
import sh.e;
import ve.f;
import ve.m;
import ve.n;
import ve.o;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class LayoutEditorActivity extends j1 {
    public static final /* synthetic */ int K0 = 0;
    public a0 A0;
    public final v B0;
    public b C0;
    public Handler D0;
    public final p E0;
    public c F0;
    public e G0;
    public final g H0;
    public final g I0;
    public final k J0;

    /* renamed from: y0  reason: collision with root package name */
    public d f9526y0;

    /* renamed from: z0  reason: collision with root package name */
    public sf.c f9527z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ fc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final int stringRes;
        public static final a PROPERTIES = new a("PROPERTIES", 0, R.string.properties);
        public static final a BACKGROUNDS = new a("BACKGROUNDS", 1, R.string.background);
        public static final a REVERT = new a("REVERT", 2, R.string.revert_changes);
        public static final a RESET = new a("RESET", 3, R.string.reset_default);
        public static final a SAVE_AND_EXIT = new a("SAVE_AND_EXIT", 4, R.string.save_and_exit);
        public static final a EXIT_WITHOUT_SAVING = new a("EXIT_WITHOUT_SAVING", 5, R.string.exit_without_saving);

        private static final /* synthetic */ a[] $values() {
            return new a[]{PROPERTIES, BACKGROUNDS, REVERT, RESET, SAVE_AND_EXIT, EXIT_WITHOUT_SAVING};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = r.x($values);
        }

        private a(String str, int i2, int i10) {
            this.stringRes = i10;
        }

        public static fc.a getEntries() {
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
        super(3);
        this.B0 = new v(u.a(e0.class), new i(this, 1), new i(this, 0), new i(this, 2));
        this.E0 = new p(this, 1);
        this.H0 = (g) s(new b1(4), new h.b(this) { // from class: rh.d
            public final /* synthetic */ LayoutEditorActivity B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                String stringExtra;
                String stringExtra2;
                int i2 = r2;
                UUID uuid = null;
                LayoutEditorActivity layoutEditorActivity = this.B;
                h.a aVar = (h.a) obj;
                switch (i2) {
                    case 0:
                        int i10 = LayoutEditorActivity.K0;
                        aVar.getClass();
                        if (aVar.A == -1) {
                            Intent intent = aVar.B;
                            if (intent != null && (stringExtra = intent.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            layoutEditorActivity.A().h(sh.d.MAIN_SCREEN, uuid);
                            return;
                        }
                        return;
                    default:
                        int i11 = LayoutEditorActivity.K0;
                        aVar.getClass();
                        if (aVar.A == -1) {
                            Intent intent2 = aVar.B;
                            if (intent2 != null && (stringExtra2 = intent2.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra2);
                            }
                            layoutEditorActivity.A().h(sh.d.SECONDARY_SCREEN, uuid);
                            return;
                        }
                        return;
                }
            }
        });
        this.I0 = (g) s(new b1(4), new h.b(this) { // from class: rh.d
            public final /* synthetic */ LayoutEditorActivity B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                String stringExtra;
                String stringExtra2;
                int i2 = r2;
                UUID uuid = null;
                LayoutEditorActivity layoutEditorActivity = this.B;
                h.a aVar = (h.a) obj;
                switch (i2) {
                    case 0:
                        int i10 = LayoutEditorActivity.K0;
                        aVar.getClass();
                        if (aVar.A == -1) {
                            Intent intent = aVar.B;
                            if (intent != null && (stringExtra = intent.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra);
                            }
                            layoutEditorActivity.A().h(sh.d.MAIN_SCREEN, uuid);
                            return;
                        }
                        return;
                    default:
                        int i11 = LayoutEditorActivity.K0;
                        aVar.getClass();
                        if (aVar.A == -1) {
                            Intent intent2 = aVar.B;
                            if (intent2 != null && (stringExtra2 = intent2.getStringExtra("selected_background_id")) != null) {
                                uuid = UUID.fromString(stringExtra2);
                            }
                            layoutEditorActivity.A().h(sh.d.SECONDARY_SCREEN, uuid);
                            return;
                        }
                        return;
                }
            }
        });
        this.J0 = new k(1, this);
    }

    public final e0 A() {
        return (e0) this.B0.getValue();
    }

    public final void B() {
        ArrayList arrayList;
        LayoutEditorView layoutEditorView;
        ArrayList arrayList2;
        o oVar;
        Object value;
        f fVar;
        n nVar;
        b bVar;
        b bVar2 = this.C0;
        if (bVar2 != null) {
            if (bVar2.getLayoutEditorView().f9535h0) {
                b bVar3 = this.C0;
                if (bVar3 != null) {
                    arrayList = bVar3.getLayoutEditorView().i();
                } else {
                    nc.k.f("layoutEditorManager");
                    throw null;
                }
            } else {
                arrayList = null;
            }
            c cVar = this.F0;
            if (cVar != null && (bVar = cVar.A) != null) {
                layoutEditorView = bVar.getLayoutEditorView();
            } else {
                layoutEditorView = null;
            }
            if (layoutEditorView != null && layoutEditorView.f9535h0) {
                arrayList2 = layoutEditorView.i();
            } else {
                arrayList2 = null;
            }
            e0 A = A();
            if ((arrayList != null || arrayList2 != null) && (oVar = A.f12730f) != null) {
                q1 q1Var = A.f12731g;
                do {
                    value = q1Var.getValue();
                    f fVar2 = (f) value;
                    if (fVar2 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(fVar2.f13804g);
                        n nVar2 = (n) linkedHashMap.get(oVar);
                        if (nVar2 != null) {
                            m mVar = nVar2.f13821a;
                            if (arrayList != null) {
                                mVar = m.a(mVar, null, null, arrayList, 3);
                            }
                            m mVar2 = nVar2.f13822b;
                            if (arrayList2 != null) {
                                mVar2 = m.a(mVar2, null, null, arrayList2, 3);
                            }
                            mVar.getClass();
                            mVar2.getClass();
                            nVar = new n(mVar, mVar2);
                        } else {
                            nVar = new n(new m(arrayList), new m(arrayList2));
                        }
                        linkedHashMap.put(oVar, nVar);
                        fVar = f.a(fVar2, null, null, null, false, 0, linkedHashMap, 63);
                    } else {
                        fVar = null;
                    }
                } while (!q1Var.i(value, fVar));
                return;
            }
            return;
        }
        nc.k.f("layoutEditorManager");
        throw null;
    }

    public final void C() {
        Integer num;
        Integer num2;
        Display display;
        Display B = aj.g.B(this);
        B.getClass();
        if (this.f9526y0 != null) {
            Display a10 = d.a(this);
            sf.c cVar = this.f9527z0;
            if (cVar != null) {
                ve.i b10 = cVar.b(B, a10);
                q1 q1Var = (q1) A().f12728d.f3844f;
                q1Var.getClass();
                q1Var.k(null, b10);
                c cVar2 = this.F0;
                if (cVar2 != null && (display = cVar2.getDisplay()) != null) {
                    num = Integer.valueOf(display.getDisplayId());
                } else {
                    num = null;
                }
                if (a10 != null) {
                    num2 = Integer.valueOf(a10.getDisplayId());
                } else {
                    num2 = null;
                }
                if (!nc.k.a(num, num2)) {
                    c cVar3 = this.F0;
                    if (cVar3 != null) {
                        cVar3.dismiss();
                    }
                    this.F0 = null;
                    if (a10 != null) {
                        a0 a0Var = this.A0;
                        if (a0Var != null) {
                            final c cVar4 = new c(a0Var, this, a10, this.J0, this.G0);
                            cVar4.setOnShowListener(new DialogInterface.OnShowListener() { // from class: rh.e
                                @Override // android.content.DialogInterface.OnShowListener
                                public final void onShow(DialogInterface dialogInterface) {
                                    int i2 = LayoutEditorActivity.K0;
                                    sh.a aVar = (sh.a) LayoutEditorActivity.this.A().f12737n.A.getValue();
                                    if (aVar != null) {
                                        ve.n nVar = aVar.f12919a;
                                        nVar.getClass();
                                        cVar4.A.getLayoutEditorView().e(nVar, sh.d.SECONDARY_SCREEN);
                                    }
                                }
                            });
                            cVar4.show();
                            this.F0 = cVar4;
                            return;
                        }
                        nc.k.f("picasso");
                        throw null;
                    }
                }
                return;
            }
            nc.k.f("deviceLayoutDisplayMapper");
            throw null;
        }
        nc.k.f("secondaryDisplaySelector");
        throw null;
    }

    @Override // l.i, d.k, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        bf.a aVar;
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        B();
        if (configuration.orientation == 1) {
            aVar = bf.a.PORTRAIT;
        } else {
            aVar = bf.a.LANDSCAPE;
        }
        e0 A = A();
        aVar.getClass();
        q1 q1Var = (q1) A.f12728d.f3842d;
        q1Var.getClass();
        q1Var.k(null, aVar);
        Handler handler = this.D0;
        if (handler != null) {
            handler.post(new r0.b(3, this));
        } else {
            nc.k.f("handler");
            throw null;
        }
    }

    @Override // ah.j1, androidx.fragment.app.o0, d.k, m5.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aj.g j2Var;
        bf.a aVar;
        super.onCreate(bundle);
        this.D0 = new Handler(getMainLooper());
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-16777216);
        sh.d dVar = sh.d.MAIN_SCREEN;
        a0 a0Var = this.A0;
        if (a0Var != null) {
            b bVar = new b(dVar, a0Var, null, this);
            bVar.setListener(this.J0);
            this.C0 = bVar;
            relativeLayout.addView(bVar, -1, -1);
            setContentView(relativeLayout);
            ah.e eVar = new ah.e(13, this);
            WeakHashMap weakHashMap = x0.f533a;
            p0.k(relativeLayout, eVar);
            a().b(new a7.n(this, false, 4));
            b bVar2 = this.C0;
            if (bVar2 != null) {
                bVar2.addOnLayoutChangeListener(new aa.a(3, this));
                Window window = getWindow();
                window.getClass();
                a0.b bVar3 = new a0.b(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    j2Var = new l2(window, bVar3);
                } else if (i2 >= 30) {
                    j2Var = new l2(window, bVar3);
                } else if (i2 >= 26) {
                    j2Var = new j2(window, bVar3);
                } else {
                    j2Var = new j2(window, bVar3);
                }
                j2Var.H(2);
                j2Var.n0();
                Configuration configuration = getResources().getConfiguration();
                configuration.getClass();
                if (configuration.orientation == 1) {
                    aVar = bf.a.PORTRAIT;
                } else {
                    aVar = bf.a.LANDSCAPE;
                }
                e0 A = A();
                aVar.getClass();
                q1 q1Var = (q1) A.f12728d.f3842d;
                q1Var.getClass();
                q1Var.k(null, aVar);
                x.v(s0.f(this), null, null, new h(this, null, 1), 3);
                x.v(s0.f(this), null, null, new h(this, null, 3), 3);
                x.v(s0.f(this), null, null, new h(this, null, 5), 3);
                x.v(s0.f(this), null, null, new h(this, null, 7), 3);
                return;
            }
            nc.k.f("layoutEditorManager");
            throw null;
        }
        nc.k.f("picasso");
        throw null;
    }

    @Override // ah.j1, l.i, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        b bVar;
        ImageView imageBackground;
        super.onDestroy();
        a0 a0Var = this.A0;
        if (a0Var != null) {
            b bVar2 = this.C0;
            if (bVar2 != null) {
                ImageView imageBackground2 = bVar2.getImageBackground();
                if (imageBackground2 != null) {
                    a0Var.a(imageBackground2);
                    c cVar = this.F0;
                    if (cVar != null && (bVar = cVar.A) != null && (imageBackground = bVar.getImageBackground()) != null) {
                        a0 a0Var2 = this.A0;
                        if (a0Var2 != null) {
                            a0Var2.a(imageBackground);
                            return;
                        } else {
                            nc.k.f("picasso");
                            throw null;
                        }
                    }
                    return;
                }
                j.h("view cannot be null.");
                return;
            }
            nc.k.f("layoutEditorManager");
            throw null;
        }
        nc.k.f("picasso");
        throw null;
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        C();
    }

    @Override // l.i, androidx.fragment.app.o0, android.app.Activity
    public final void onStart() {
        super.onStart();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.E0, null);
        }
    }

    @Override // l.i, androidx.fragment.app.o0, android.app.Activity
    public final void onStop() {
        super.onStop();
        DisplayManager displayManager = (DisplayManager) getSystemService(DisplayManager.class);
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.E0);
        }
        B();
        c cVar = this.F0;
        if (cVar != null) {
            this.G0 = cVar.A.s();
            cVar.dismiss();
        }
        this.F0 = null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        aj.g j2Var;
        super.onWindowFocusChanged(z10);
        Window window = getWindow();
        window.getClass();
        a0.b bVar = new a0.b(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            j2Var = new l2(window, bVar);
        } else if (i2 >= 30) {
            j2Var = new l2(window, bVar);
        } else if (i2 >= 26) {
            j2Var = new j2(window, bVar);
        } else {
            j2Var = new j2(window, bVar);
        }
        j2Var.H(2);
        j2Var.n0();
    }
}
