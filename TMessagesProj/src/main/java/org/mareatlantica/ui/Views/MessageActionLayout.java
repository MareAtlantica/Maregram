/*
 * This is the source code of Telegram for Android v. 1.3.2.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013.
 */

package org.mareatlantica.ui.Views;

import android.widget.FrameLayout;

import org.mareatlantica.android.AndroidUtilities;
import org.mareatlantica.messenger.R;

public class MessageActionLayout extends FrameLayout {
    public TightTextView messageTextView;

    public MessageActionLayout(android.content.Context context) {
        super(context);
    }

    public MessageActionLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
    }

    public MessageActionLayout(android.content.Context context, android.util.AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(messageTextView.linesMaxWidth + AndroidUtilities.dp(14), getMeasuredHeight());
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        messageTextView = (TightTextView)findViewById(R.id.chat_message_text);
    }
}
