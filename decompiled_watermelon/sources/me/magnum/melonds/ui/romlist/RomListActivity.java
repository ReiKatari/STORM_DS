package me.magnum.melonds.ui.romlist;

import android.app.SearchManager;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import java.util.WeakHashMap;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RomListActivity extends rr2 {
    public static final /* synthetic */ int J0 = 0;
    public bu3 A0;
    public final va7 B0;
    public final va7 C0;
    public r9 D0;
    public tb E0;
    public ki2 F0;
    public final il6 G0;
    public final ee6 H0;
    public q9 I0;

    public RomListActivity() {
        super(3);
        this.B0 = new va7(q75.a(yo5.class), new xn5(this, 1), new xn5(this, 0), new xn5(this, 2));
        this.C0 = new va7(q75.a(v37.class), new xn5(this, 4), new xn5(this, 3), new xn5(this, 5));
        this.G0 = new il6(new bz2(16, this));
        this.H0 = fe6.a(null);
    }

    public final v37 B() {
        return (v37) this.C0.getValue();
    }

    public final yo5 C() {
        return (yo5) this.B0.getValue();
    }

    public final void D(us usVar) {
        tb tbVar = this.E0;
        if (tbVar != null) {
            tbVar.dismiss();
        }
        sb sbVar = new sb(this);
        pb pbVar = (pb) sbVar.L;
        sbVar.A(R.string.downloading_update);
        pbVar.u = null;
        pbVar.t = R.layout.dialog_layout_update_download_progress;
        sbVar.z(R.string.move_to_background, new pn5(this, 1));
        pbVar.m = false;
        this.E0 = sbVar.C();
        v37 B = B();
        usVar.getClass();
        tq5.w(ua7.a(B), null, null, new v74(B, usVar, null, 24), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r0 != 103) goto L23;
     */
    @Override // defpackage.xp, defpackage.xs0, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r4) {
        /*
            r3 = this;
            r4.getClass()
            int r0 = r4.getAction()
            if (r0 != 0) goto L45
            int r0 = r4.getKeyCode()
            r1 = 20
            r2 = 1
            if (r0 == r1) goto L34
            r1 = 92
            if (r0 == r1) goto L2b
            r1 = 93
            if (r0 == r1) goto L23
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L2b
            r1 = 103(0x67, float:1.44E-43)
            if (r0 == r1) goto L23
            goto L45
        L23:
            yo5 r3 = r3.C()
            r3.j(r2)
            return r2
        L2b:
            yo5 r3 = r3.C()
            r4 = 0
            r3.j(r4)
            return r2
        L34:
            ki2 r0 = r3.F0
            if (r0 == 0) goto L45
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r2) goto L45
            return r2
        L45:
            boolean r3 = super.dispatchKeyEvent(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.ui.romlist.RomListActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, l75] */
    @Override // defpackage.rr2, androidx.fragment.app.p, defpackage.ys0, defpackage.xs0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        rn5 rn5Var;
        if (Build.VERSION.SDK_INT >= 31) {
            rn5Var = new nc6(this);
        } else {
            rn5Var = new rn5(this);
        }
        rn5Var.a();
        jn1.a(this, new ml6(0, 0, 2, new d96(6)), 2);
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_rom_list, (ViewGroup) null, false);
        int i = R.id.layout_main;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ep2.r(inflate, R.id.layout_main);
        if (fragmentContainerView != null) {
            i = R.id.toolbar;
            Toolbar toolbar = (Toolbar) ep2.r(inflate, R.id.toolbar);
            if (toolbar != null) {
                i = R.id.view_status_bar_background;
                View r = ep2.r(inflate, R.id.view_status_bar_background);
                if (r != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.I0 = new q9(constraintLayout, fragmentContainerView, toolbar, r, 0);
                    setContentView(constraintLayout);
                    q9 q9Var = this.I0;
                    if (q9Var != null) {
                        y((Toolbar) q9Var.R);
                        ?? obj = new Object();
                        obj.A = -1;
                        q9 q9Var2 = this.I0;
                        if (q9Var2 != null) {
                            hi0 hi0Var = new hi0(5, obj, this);
                            WeakHashMap weakHashMap = aa7.a;
                            s97.c((ConstraintLayout) q9Var2.B, hi0Var);
                            this.D0 = new r9(this, new rn5(this));
                            tq5.w(hk2.y(this), null, null, new sn5(this, null, 1), 3);
                            tq5.w(hk2.y(this), null, null, new sn5(this, null, 3), 3);
                            tq5.w(hk2.y(this), null, null, new sn5(this, null, 5), 3);
                            tq5.w(hk2.y(this), null, null, new sn5(this, null, 7), 3);
                            tq5.w(hk2.y(this), null, null, new sn5(this, null, 9), 3);
                            tq5.w(hk2.y(this), null, null, new sn5(this, null, 11), 3);
                            return;
                        }
                        b53.g0("binding");
                        throw null;
                    }
                    b53.g0("binding");
                    throw null;
                }
            }
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.rom_list_menu, menu);
        MenuItem findItem = menu.findItem(R.id.action_search_roms);
        SearchManager searchManager = (SearchManager) getSystemService(SearchManager.class);
        if (searchManager != null) {
            View actionView = findItem.getActionView();
            actionView.getClass();
            SearchView searchView = (SearchView) actionView;
            searchView.setQueryHint(getString(R.string.hint_search_roms));
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            searchView.setOnQueryTextListener(new rn5(this));
        }
        findItem.setOnActionExpandListener(new wn5(this));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_view_toggle) {
            C().q();
            return true;
        } else if (itemId == R.id.action_sort_alphabetically) {
            C().p(qb6.ALPHABETICALLY);
            return true;
        } else if (itemId == R.id.action_sort_recent) {
            C().p(qb6.RECENTLY_PLAYED);
            return true;
        } else if (itemId == R.id.action_sort_most_played) {
            C().p(qb6.MOST_PLAYED);
            return true;
        } else if (itemId == R.id.action_boot_firmware_ds) {
            ConsoleType consoleType = ConsoleType.DS;
            r9 r9Var = this.D0;
            if (r9Var != null) {
                consoleType.getClass();
                js1 A = r9Var.A();
                A.f = new hs1(consoleType);
                tq5.w(ua7.a(A), null, null, new ba1(A, consoleType, null, 5), 3);
                return true;
            }
            b53.g0("emulatorLauncherValidatorDelegate");
            throw null;
        } else if (itemId == R.id.action_boot_firmware_dsi) {
            ConsoleType consoleType2 = ConsoleType.DSi;
            r9 r9Var2 = this.D0;
            if (r9Var2 != null) {
                consoleType2.getClass();
                js1 A2 = r9Var2.A();
                A2.f = new hs1(consoleType2);
                tq5.w(ua7.a(A2), null, null, new ba1(A2, consoleType2, null, 5), 3);
                return true;
            }
            b53.g0("emulatorLauncherValidatorDelegate");
            throw null;
        } else if (itemId == R.id.action_dsiware_manager) {
            startActivity(new Intent(this, DSiWareManagerActivity.class));
            return true;
        } else if (itemId == R.id.action_rom_list_refresh) {
            yo5 C = C();
            tq5.w(ua7.a(C), null, null, new v74(C, (j11) null, 14), 3);
            d72 d72Var = (d72) C.b;
            tq5.w(d72Var.h, null, null, new o62(d72Var, null, 3), 3);
            return true;
        } else if (itemId == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        } else {
            return false;
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        int i;
        menu.getClass();
        MenuItem findItem = menu.findItem(R.id.action_view_toggle);
        if (findItem != null) {
            int i2 = qn5.a[((tp5) C().q.A.getValue()).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = R.drawable.ic_view_grid;
                } else {
                    i.c();
                    return false;
                }
            } else {
                i = R.drawable.ic_view_list;
            }
            findItem.setIcon(i);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        il6 il6Var = this.G0;
        d42 d42Var = (d42) il6Var.getValue();
        Object systemService = d42Var.a.getSystemService("display");
        systemService.getClass();
        ((DisplayManager) systemService).registerDisplayListener(d42Var.d, null);
        d42Var.b();
        d42 d42Var2 = (d42) il6Var.getValue();
        et0 et0Var = new et0(-808863654, true, new z5(26, this));
        d42Var2.c = et0Var;
        f42 f42Var = d42Var2.b;
        if (f42Var != null) {
            f42Var.B.setValue(et0Var);
        }
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        ((d42) this.G0.getValue()).a();
        super.onStop();
    }
}
