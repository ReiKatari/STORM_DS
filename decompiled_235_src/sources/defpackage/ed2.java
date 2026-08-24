package defpackage;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.stormds.emulator.R;
import java.util.Locale;
import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed2  reason: default package */
/* loaded from: classes.dex */
public abstract class ed2 extends jq {
    @Override // androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        IconCompat b;
        setTheme(ht.a().getThemeResId());
        super.onCreate(bundle);
        ConsoleType z = z();
        String packageName = getPackageName();
        Intent intent = new Intent(packageName + ".LAUNCH_FIRMWARE");
        intent.putExtra("boot_firmware_only", true);
        intent.putExtra("boot_firmware_console", z.ordinal());
        String lowerCase = z.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        pa paVar = new pa(11, false);
        paVar.B = this;
        paVar.L = lowerCase;
        int[] iArr = dd2.a;
        int i = iArr[z.ordinal()];
        if (i != 1) {
            if (i == 2) {
                string = getString(R.string.console_dsi_full);
                string.getClass();
            } else {
                i.d();
                return;
            }
        } else {
            string = getString(R.string.console_ds_full);
            string.getClass();
        }
        paVar.X = string;
        int i2 = iArr[z.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                PorterDuff.Mode mode = IconCompat.k;
                b = IconCompat.b(getResources(), getPackageName(), R.mipmap.ic_platform_dsi);
            } else {
                i.d();
                return;
            }
        } else {
            PorterDuff.Mode mode2 = IconCompat.k;
            b = IconCompat.b(getResources(), getPackageName(), R.mipmap.ic_platform_ds);
        }
        paVar.Y = b;
        paVar.R = new Intent[]{intent};
        if (!TextUtils.isEmpty((CharSequence) paVar.X)) {
            Intent[] intentArr = (Intent[]) paVar.R;
            if (intentArr != null && intentArr.length != 0) {
                setResult(-1, qo2.t(this, paVar));
                finish();
                return;
            }
            i.h("Shortcut must have an intent");
            return;
        }
        i.h("Shortcut must have a non-empty label");
    }

    public abstract ConsoleType z();
}
