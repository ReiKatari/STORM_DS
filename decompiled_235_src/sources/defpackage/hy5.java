package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.TypedValue;
import com.stormds.emulator.R;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hy5  reason: default package */
/* loaded from: classes.dex */
public class hy5 implements ax1, t86 {
    public final RomListActivity A;

    public /* synthetic */ hy5(RomListActivity romListActivity) {
        this.A = romListActivity;
    }

    public void a() {
        int i;
        TypedValue typedValue = new TypedValue();
        RomListActivity romListActivity = this.A;
        Resources.Theme theme = romListActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            hf.S(romListActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            romListActivity.setTheme(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [wz5, android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.ax1
    public void e(pq5 pq5Var) {
        pq5Var.getClass();
        int i = EmulatorActivity.Z1;
        RomListActivity romListActivity = this.A;
        Intent intent = new Intent(romListActivity, EmulatorActivity.class);
        ?? obj = new Object();
        obj.A = pq5Var;
        intent.putExtra("rom", (Parcelable) obj);
        romListActivity.startActivity(intent);
        romListActivity.overridePendingTransition(17432576, 17432577);
    }

    @Override // defpackage.ax1
    public void k(ConsoleType consoleType) {
        int i = EmulatorActivity.Z1;
        RomListActivity romListActivity = this.A;
        Intent intent = new Intent(romListActivity, EmulatorActivity.class);
        intent.putExtra("boot_firmware_only", true);
        intent.putExtra("boot_firmware_console", consoleType.ordinal());
        romListActivity.startActivity(intent);
        romListActivity.overridePendingTransition(17432576, 17432577);
    }

    @Override // defpackage.ax1
    public void d() {
    }
}
