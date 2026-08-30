package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.TypedValue;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rn5  reason: default package */
/* loaded from: classes.dex */
public class rn5 implements os1, hx5 {
    public final RomListActivity A;

    public /* synthetic */ rn5(RomListActivity romListActivity) {
        this.A = romListActivity;
    }

    public void a() {
        int i;
        TypedValue typedValue = new TypedValue();
        RomListActivity romListActivity = this.A;
        Resources.Theme theme = romListActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            l07.M(romListActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            romListActivity.setTheme(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.Parcelable, bp5, java.lang.Object] */
    @Override // defpackage.os1
    public void c(rg5 rg5Var) {
        rg5Var.getClass();
        int i = EmulatorActivity.P1;
        RomListActivity romListActivity = this.A;
        Intent intent = new Intent(romListActivity, EmulatorActivity.class);
        ?? obj = new Object();
        obj.A = rg5Var;
        intent.putExtra("rom", (Parcelable) obj);
        romListActivity.startActivity(intent);
        romListActivity.overridePendingTransition(17432576, 17432577);
    }

    @Override // defpackage.os1
    public void g(ConsoleType consoleType) {
        int i = EmulatorActivity.P1;
        RomListActivity romListActivity = this.A;
        Intent intent = new Intent(romListActivity, EmulatorActivity.class);
        intent.putExtra("boot_firmware_only", true);
        intent.putExtra("boot_firmware_console", consoleType.ordinal());
        romListActivity.startActivity(intent);
        romListActivity.overridePendingTransition(17432576, 17432577);
    }

    @Override // defpackage.os1
    public void j() {
    }
}
