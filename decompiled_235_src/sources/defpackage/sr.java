package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr  reason: default package */
/* loaded from: classes.dex */
public abstract class sr {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        q31 q31Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                q31Var = new os0(clipData, 3);
            } else {
                r31 r31Var = new r31();
                r31Var.B = clipData;
                r31Var.L = 3;
                q31Var = r31Var;
            }
            ao7.j(textView, q31Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        q31 q31Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            q31Var = new os0(clipData, 3);
        } else {
            r31 r31Var = new r31();
            r31Var.B = clipData;
            r31Var.L = 3;
            q31Var = r31Var;
        }
        ao7.j(view, q31Var.build());
        return true;
    }
}
