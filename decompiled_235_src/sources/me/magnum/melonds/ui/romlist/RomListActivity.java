package me.magnum.melonds.ui.romlist;

import android.app.SearchManager;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import com.stormds.emulator.R;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RomListActivity extends sx2 {
    public static final /* synthetic */ int K0 = 0;
    public e14 B0;
    public final uo7 C0;
    public final uo7 D0;
    public s9 E0;
    public ac F0;
    public on2 G0;
    public final ex6 H0;
    public final tp6 I0;
    public r9 J0;

    public RomListActivity() {
        super(3);
        this.C0 = new uo7(gh5.a(tz5.class), new ny5(this, 1), new ny5(this, 0), new ny5(this, 2));
        this.D0 = new uo7(gh5.a(qh7.class), new ny5(this, 4), new ny5(this, 3), new ny5(this, 5));
        this.H0 = new ex6(new er2(this, 23));
        this.I0 = up6.a(null);
    }

    public final qh7 B() {
        return (qh7) this.D0.getValue();
    }

    public final tz5 C() {
        return (tz5) this.C0.getValue();
    }

    public final void D(kt ktVar) {
        ac acVar = this.F0;
        if (acVar != null) {
            acVar.dismiss();
        }
        zb zbVar = new zb(this);
        wb wbVar = (wb) zbVar.L;
        zbVar.z(R.string.downloading_update);
        wbVar.u = null;
        wbVar.t = R.layout.dialog_layout_update_download_progress;
        zbVar.y(R.string.move_to_background, new ey5(this, 1));
        wbVar.m = false;
        this.F0 = zbVar.B();
        qh7 B = B();
        ktVar.getClass();
        hv.L(to7.a(B), null, null, new bf4(B, ktVar, null, 24), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r0 != 103) goto L23;
     */
    @Override // defpackage.jq, defpackage.lv0, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 20) {
                if (keyCode != 92) {
                    if (keyCode != 93) {
                        if (keyCode != 102) {
                        }
                    }
                    C().j(true);
                    return true;
                }
                C().j(false);
                return true;
            }
            on2 on2Var = this.G0;
            if (on2Var != null && ((Boolean) on2Var.c()).booleanValue()) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.sx2, androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        hy5 hy5Var;
        setTheme(ht.a().getThemeResId());
        if (Build.VERSION.SDK_INT >= 31) {
            hy5Var = new do6(this);
        } else {
            hy5Var = new hy5(this);
        }
        hy5Var.a();
        if (ht.a() == g57.LIGHT) {
            tr1.a(this, new ix6(0, 0, 1, new r76(17)));
        } else {
            tr1.a(this, new ix6(0, 0, 2, new r76(18)));
        }
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_rom_list, (ViewGroup) null, false);
        int i = R.id.layout_main;
        if (((FragmentContainerView) gi2.B(inflate, R.id.layout_main)) != null) {
            i = R.id.toolbar;
            Toolbar toolbar = (Toolbar) gi2.B(inflate, R.id.toolbar);
            if (toolbar != null) {
                i = R.id.view_status_bar_background;
                if (gi2.B(inflate, R.id.view_status_bar_background) != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    this.J0 = new r9(frameLayout, toolbar);
                    setContentView(frameLayout);
                    r9 r9Var = this.J0;
                    if (r9Var != null) {
                        y(r9Var.A);
                        ak7 w = w();
                        if (w != null) {
                            w.j0();
                        }
                        this.E0 = new s9(this, new hy5(this));
                        hv.L(bl2.C(this), null, null, new iy5(this, null, 1), 3);
                        hv.L(bl2.C(this), null, null, new iy5(this, null, 3), 3);
                        hv.L(bl2.C(this), null, null, new iy5(this, null, 5), 3);
                        hv.L(bl2.C(this), null, null, new iy5(this, null, 7), 3);
                        hv.L(bl2.C(this), null, null, new iy5(this, null, 9), 3);
                        hv.L(bl2.C(this), null, null, new iy5(this, null, 11), 3);
                        return;
                    }
                    nb3.a0("binding");
                    throw null;
                }
            }
        }
        u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
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
            searchView.setOnQueryTextListener(new hy5(this));
        }
        findItem.setOnActionExpandListener(new my5(this));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_view_toggle) {
            C().r();
            return true;
        } else if (itemId == R.id.action_sort_alphabetically) {
            C().q(gn6.ALPHABETICALLY);
            return true;
        } else if (itemId == R.id.action_sort_recent) {
            C().q(gn6.RECENTLY_PLAYED);
            return true;
        } else if (itemId == R.id.action_sort_most_played) {
            C().q(gn6.MOST_PLAYED);
            return true;
        } else if (itemId == R.id.action_boot_firmware_ds) {
            ConsoleType consoleType = ConsoleType.DS;
            s9 s9Var = this.E0;
            if (s9Var != null) {
                consoleType.getClass();
                vw1 A = s9Var.A();
                A.f = new tw1(consoleType);
                hv.L(to7.a(A), null, null, new xd1(A, consoleType, null, 5), 3);
                return true;
            }
            nb3.a0("emulatorLauncherValidatorDelegate");
            throw null;
        } else if (itemId == R.id.action_boot_firmware_dsi) {
            ConsoleType consoleType2 = ConsoleType.DSi;
            s9 s9Var2 = this.E0;
            if (s9Var2 != null) {
                consoleType2.getClass();
                vw1 A2 = s9Var2.A();
                A2.f = new tw1(consoleType2);
                hv.L(to7.a(A2), null, null, new xd1(A2, consoleType2, null, 5), 3);
                return true;
            }
            nb3.a0("emulatorLauncherValidatorDelegate");
            throw null;
        } else if (itemId == R.id.action_dsiware_manager) {
            startActivity(new Intent(this, DSiWareManagerActivity.class));
            return true;
        } else if (itemId == R.id.action_rom_list_refresh) {
            tz5 C = C();
            C.p();
            xb2 xb2Var = (xb2) C.b;
            hv.L(xb2Var.h, null, null, new ib2(xb2Var, null, 3), 3);
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
            int i2 = gy5.a[((n06) C().s.A.getValue()).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = R.drawable.ic_view_grid;
                } else {
                    i.d();
                    return false;
                }
            } else {
                i = R.drawable.ic_view_list;
            }
            findItem.setIcon(i);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        ex6 ex6Var = this.H0;
        v82 v82Var = (v82) ex6Var.getValue();
        Object systemService = v82Var.a.getSystemService("display");
        systemService.getClass();
        ((DisplayManager) systemService).registerDisplayListener(v82Var.d, null);
        v82Var.b();
        v82 v82Var2 = (v82) ex6Var.getValue();
        zv0 zv0Var = new zv0(-808863654, true, new z5(this, 26));
        v82Var2.c = zv0Var;
        x82 x82Var = v82Var2.b;
        if (x82Var != null) {
            x82Var.B.setValue(zv0Var);
        }
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        ((v82) this.H0.getValue()).a();
        super.onStop();
    }
}
