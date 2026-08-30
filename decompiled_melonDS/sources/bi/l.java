package bi;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.TypedValue;
import me.magnum.melonds.R;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import q.u2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class l implements vg.h, u2 {
    public final RomListActivity A;

    public /* synthetic */ l(RomListActivity romListActivity) {
        this.A = romListActivity;
    }

    @Override // vg.h
    public void E(ConsoleType consoleType) {
        consoleType.getClass();
        int i2 = EmulatorActivity.f9503a1;
        RomListActivity romListActivity = this.A;
        Intent intent = new Intent(romListActivity, EmulatorActivity.class);
        intent.putExtra("boot_firmware_only", true);
        intent.putExtra("boot_firmware_console", consoleType.ordinal());
        romListActivity.startActivity(intent);
    }

    public void a() {
        int i2;
        TypedValue typedValue = new TypedValue();
        RomListActivity romListActivity = this.A;
        Resources.Theme theme = romListActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            k7.w.p(romListActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i2 = typedValue.resourceId) != 0) {
            romListActivity.setTheme(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [eg.j, android.os.Parcelable, java.lang.Object] */
    @Override // vg.h
    public void o(ze.a aVar) {
        aVar.getClass();
        int i2 = EmulatorActivity.f9503a1;
        RomListActivity romListActivity = this.A;
        Intent intent = new Intent(romListActivity, EmulatorActivity.class);
        ?? obj = new Object();
        obj.A = aVar;
        intent.putExtra("rom", (Parcelable) obj);
        romListActivity.startActivity(intent);
    }

    @Override // vg.h
    public void I() {
    }
}
