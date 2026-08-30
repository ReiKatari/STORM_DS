package me.magnum.melonds.ui.romlist;

import a4.n;
import a5.o;
import a6.p0;
import a6.x0;
import a7.v;
import ah.j1;
import android.app.SearchManager;
import android.content.Intent;
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
import androidx.lifecycle.s0;
import bi.h;
import bi.i0;
import bi.j;
import bi.j0;
import bi.l;
import bi.q;
import bi.r;
import java.util.WeakHashMap;
import k7.w;
import kf.e0;
import kf.l0;
import l.d;
import l.g;
import me.magnum.melonds.R;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
import nc.k;
import nc.u;
import ob.c;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class RomListActivity extends j1 {
    public static final /* synthetic */ int D0 = 0;
    public final v A0;
    public v B0;
    public g C0;

    /* renamed from: y0  reason: collision with root package name */
    public c f9572y0;

    /* renamed from: z0  reason: collision with root package name */
    public final v f9573z0;

    public RomListActivity() {
        super(1);
        this.f9573z0 = new v(u.a(i0.class), new r(this, 1), new r(this, 0), new r(this, 2));
        this.A0 = new v(u.a(j0.class), new r(this, 4), new r(this, 3), new r(this, 5));
    }

    public final j0 A() {
        return (j0) this.A0.getValue();
    }

    public final i0 B() {
        return (i0) this.f9573z0.getValue();
    }

    public final void C(pe.b bVar) {
        g gVar = this.C0;
        if (gVar != null) {
            gVar.dismiss();
        }
        bk.a aVar = new bk.a(this);
        d dVar = (d) aVar.L;
        aVar.w(R.string.downloading_update);
        dVar.f8375u = null;
        dVar.f8374t = R.layout.dialog_layout_update_download_progress;
        aVar.v(R.string.move_to_background, new j(0, this));
        dVar.m = false;
        this.C0 = aVar.y();
        j0 A = A();
        bVar.getClass();
        x.v(s0.h(A), null, null, new o(A, bVar, null, 17), 3);
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, nc.r] */
    @Override // ah.j1, androidx.fragment.app.o0, d.k, m5.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        l lVar;
        if (Build.VERSION.SDK_INT >= 31) {
            lVar = new w5.a(this);
        } else {
            lVar = new l(this);
        }
        lVar.a();
        super.onCreate(bundle);
        q8.r.w(getWindow());
        View inflate = getLayoutInflater().inflate(R.layout.activity_rom_list, (ViewGroup) null, false);
        int i2 = R.id.layout_main;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) w.k(inflate, R.id.layout_main);
        if (fragmentContainerView != null) {
            i2 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) w.k(inflate, R.id.toolbar);
            if (toolbar != null) {
                i2 = R.id.view_status_bar_background;
                View k10 = w.k(inflate, R.id.view_status_bar_background);
                if (k10 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    n nVar = new n(constraintLayout, fragmentContainerView, toolbar, k10, 19);
                    setContentView(constraintLayout);
                    y(toolbar);
                    ?? obj = new Object();
                    obj.A = -1;
                    h hVar = new h(0, obj, nVar);
                    WeakHashMap weakHashMap = x0.f533a;
                    p0.k(constraintLayout, hVar);
                    this.B0 = new v(this, new l(this));
                    x.v(s0.f(this), null, null, new bi.n(this, null, 1), 3);
                    x.v(s0.f(this), null, null, new bi.n(this, null, 3), 3);
                    x.v(s0.f(this), null, null, new bi.n(this, null, 5), 3);
                    x.v(s0.f(this), null, null, new bi.n(this, null, 7), 3);
                    return;
                }
            }
        }
        m9.o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
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
            searchView.setOnQueryTextListener(new l(this));
        }
        findItem.setOnActionExpandListener(new q(this));
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_sort_alphabetically) {
            B().f(oe.p0.ALPHABETICALLY);
            return true;
        } else if (itemId == R.id.action_sort_recent) {
            B().f(oe.p0.RECENTLY_PLAYED);
            return true;
        } else if (itemId == R.id.action_boot_firmware_ds) {
            ConsoleType consoleType = ConsoleType.DS;
            v vVar = this.B0;
            if (vVar != null) {
                consoleType.getClass();
                ((vg.c) ((v) vVar.L).getValue()).f(consoleType);
                return true;
            }
            k.f("emulatorLauncherValidatorDelegate");
            throw null;
        } else if (itemId == R.id.action_boot_firmware_dsi) {
            ConsoleType consoleType2 = ConsoleType.DSi;
            v vVar2 = this.B0;
            if (vVar2 != null) {
                consoleType2.getClass();
                ((vg.c) ((v) vVar2.L).getValue()).f(consoleType2);
                return true;
            }
            k.f("emulatorLauncherValidatorDelegate");
            throw null;
        } else if (itemId == R.id.action_dsiware_manager) {
            startActivity(new Intent(this, DSiWareManagerActivity.class));
            return true;
        } else if (itemId == R.id.action_rom_list_refresh) {
            l0 l0Var = (l0) B().f2285b;
            x.v(l0Var.f8248e, null, null, new e0(l0Var, null, 3), 3);
            return true;
        } else if (itemId == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        } else {
            return false;
        }
    }
}
